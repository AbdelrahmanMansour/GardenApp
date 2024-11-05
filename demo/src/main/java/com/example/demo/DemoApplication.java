package com.example.demo;

import com.example.demo.entity.Garden;
import com.example.demo.entity.Plant;
import com.example.demo.service.GardenService;
import com.example.demo.service.PlantService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

		PlantService plantService = new PlantService();
		GardenService gardenService = new GardenService();

		Garden garden = new Garden(11d, "New garden");
        gardenService.addGarden(garden);

		Plant plant = new Plant("newplant", "fruits", LocalDate.of(2024, 11, 11), garden);
		Plant plant1 = new Plant("newplant" , "fruits", LocalDate.of(2024, 11, 11), garden);
        plantService.addPlant(plant);
		plantService.addPlant(plant1);
	}

}
