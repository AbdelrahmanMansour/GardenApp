package com.example.demo.service;

import com.example.demo.entity.Plant;
import com.example.demo.repoistory.PlantRepoistory;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class PlantService {

    @Autowired
    PlantRepoistory plantRepoistory;

    public Plant getPlant(long id) {
        return plantRepoistory.findById(id).get();
    }

    public List<Plant> getAllPlants() {
        return plantRepoistory.findAll().parallelStream()
                .sorted(Comparator.comparing(Plant::getName)
                .thenComparing(Plant::getPlantDate)).toList();
    }

    public void updatePlant(long id, Plant plant) {
        Plant plant1 = plantRepoistory.findById(id).get();
        if(plant1 != null){
            plantRepoistory.save(plant);
        }
    }

    public void deletePlant(long id) {
        plantRepoistory.deleteById(id);
    }

    @Transactional
    public Plant addPlant(Plant plant) {
        return plantRepoistory.save(plant);
    }
}
