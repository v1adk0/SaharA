package ru.v1adk0.sahara.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FoodIntake {
    @Id
    private String id;

    public FoodIntake(List<Food> foodStuff, MealTime mealTime) {
        this.foodStuff = foodStuff;
        this.mealTime = mealTime;
    }
    public enum MealTime {BREAKFAST, DINNER, SUPPER, SNACK}
    List<Food> foodStuff;
    private MealTime mealTime;

    String setId (List<Food> foodStuff) {
        String id = String.valueOf(UUID.fromString(foodStuff.toString()));
       return this.id = id;
    }
    List<Food> addFood(Food food) {
        foodStuff.add(food);
        return foodStuff;
    }

}
