package ru.v1adk0.sahara.Utilites;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;
import ru.v1adk0.sahara.Entities.Food;
import ru.v1adk0.sahara.Entities.FoodIntake;
import ru.v1adk0.sahara.Entities.User;

@AllArgsConstructor
class Converter {
    Food food;
    User user;
    FoodIntake foodIntake;


    int fromCarbsToBreadUnits(@NotNull Food food) {
        return ((int)food.getAmountOfCarbs() * 12);
    }

    double fromBreadUnitsToCarbs(@NotNull int breadUnits) {
        return breadUnits / 12;
    }

    int howMuchInject(FoodIntake foodIntake) {
        double totalCarbs = foodIntake.getFoodStuff()
                .stream()
                .map(Food::getAmountOfCarbs)
                .mapToDouble(c -> c).sum();
        return ((int)totalCarbs *2);
    }
}
