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
    public enum Sex {MALE, FEMALE};
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private int age;
    private int weight;
    private int height;
    double bloodstreamSugar = 0;
    double dailyInsulin = 0;
    Sex sex;

    public User
            (String name, Sex sex, int age, int weight, int height, double bloodstreamSugar, double dailyInsulin) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.bloodstreamSugar = bloodstreamSugar;
        this.dailyInsulin = dailyInsulin;
    }

    public User(String name, Sex sex, int age, int weight, int height) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
}
