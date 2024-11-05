package com.example.demo.repoistory;

import com.example.demo.entity.Garden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GardenRepoistory extends JpaRepository<Garden, Integer> {
}
