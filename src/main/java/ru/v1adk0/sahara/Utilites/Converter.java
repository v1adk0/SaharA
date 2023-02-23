package ru.v1adk0.sahara.Utilites;

import lombok.AllArgsConstructor;
import ru.v1adk0.sahara.Entities.*;

@AllArgsConstructor
class Converter {
    Food food;
    User user;
    FoodIntake foodIntake;


    int fromCarbsToBreadUnits(Food food) {
        return ((int)food.getAmountOfCarbs() * 12);
    }

    double fromBreadUnitsToCarbs(int breadUnits) {
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
