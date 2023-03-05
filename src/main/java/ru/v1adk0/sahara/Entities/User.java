package ru.v1adk0.sahara.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.v1adk0.sahara.Enums.Sex;

;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="appuser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private int weight;
    @Column
    private int height;
    @Column(name = "bloodstream_sugar")
    double bloodstreamSugar = 0;
    @Column(name = "daily_insulin")
    double dailyInsulin = 0;
    @Column
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
