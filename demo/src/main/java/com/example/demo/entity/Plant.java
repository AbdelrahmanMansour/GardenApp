package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
public class Plant {

    public Plant(){
    }

    public Plant(String name, String type, LocalDate plantDate, Garden garden) {
        this.name = name;
        this.type = type;
        this.plantDate = plantDate;
        this.garden = garden;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String type;

    private LocalDate plantDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "garde_id", nullable = false)
    private Garden garden;
}
