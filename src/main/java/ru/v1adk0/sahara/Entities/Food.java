package ru.v1adk0.sahara.Entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "food")
public class Food {
@Id
@Column
private String name;
@Column(name = "amount_of_fats")
private double amountOfFats;
@Column(name = "amount_of_carbs")
private double amountOfCarbs;
@Column(name = "amount_of_proteins")
private double amountOfProteins;

}
