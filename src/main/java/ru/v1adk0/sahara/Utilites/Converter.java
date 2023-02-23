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

    String howControlBloodsteamShugar(double bloodstreamSugar) {
       String answ = switch ((int)bloodstreamSugar) {
           case 1,2,3 -> "Тебе надо поесть!";
           case 4,5,6 -> "Все в порядке. Если чувствуешь недомогание - выпей немного сока или молока.";
           case 7,8 -> "Сделай зарядку или разминку. Не переусердствуй, но вспотей!";
           case 0 -> "Не смешно! Проверь глюкометр";
           default -> {
               double sug = bloodstreamSugar/2;
               yield String.format("Вколи %s единиц быстрого инсулина", sug);
           }};
            return answ;
       }
    }
