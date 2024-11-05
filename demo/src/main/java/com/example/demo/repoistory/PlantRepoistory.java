package com.example.demo.repoistory;

import com.example.demo.entity.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepoistory extends JpaRepository<Plant, Long> {
}
