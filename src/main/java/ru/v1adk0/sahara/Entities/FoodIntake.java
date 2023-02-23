package ru.v1adk0.sahara.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import ru.v1adk0.sahara.Enums.MealTime;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FoodIntake {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private MealTime mealTime;
    @OneToMany(mappedBy = "name")
    private List<Food> foodStuff = new ArrayList<>();

    public FoodIntake(List<Food> foodStuff, MealTime mealTime) {
        this.foodStuff = foodStuff;
        this.mealTime = mealTime;
    }
    public void addFood(Food food) {
        this.foodStuff.add(food);
    }
}
