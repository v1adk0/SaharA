package ru.v1adk0.sahara.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Food {
@Id
private String name;
private double amountOfFats;
private double amountOfCarbs;
private double amountOfProteins;

}
