package ru.v1adk0.sahara.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="appuser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private int age;
    private int weight;
    private int height;
    private double bloodstreamSugar;

    public User(String name, int age, int weight, int height, double bloodstreamSugar) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.bloodstreamSugar = bloodstreamSugar;
    }
}
