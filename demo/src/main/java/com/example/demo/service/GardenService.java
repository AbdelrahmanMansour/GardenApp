package com.example.demo.service;

import com.example.demo.entity.Garden;
import com.example.demo.entity.Plant;
import com.example.demo.repoistory.GardenRepoistory;
import com.example.demo.repoistory.PlantRepoistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GardenService {

    @Autowired
    GardenRepoistory gardenRepoistory;

    public Garden addGarden(Garden garden) {
          return gardenRepoistory.save(garden);
    }

    public void deleteGarden(int id){
        gardenRepoistory.deleteById(id);
    }

    public Garden getGarden(int id){
        return gardenRepoistory.findById(id).get();
    }

    public Garden updateGarden(Garden garden){
        return gardenRepoistory.save(garden);
    }

    public List<Garden> findAllGarden(){
        return gardenRepoistory.findAll();
    }

}
