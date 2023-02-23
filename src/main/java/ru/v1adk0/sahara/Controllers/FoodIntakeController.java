package ru.v1adk0.sahara.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.v1adk0.sahara.Entities.FoodIntake;
import ru.v1adk0.sahara.Repositories.FoodIntakeRepository;

import java.util.Optional;

@RestController("/foodintake")
class FoodIntakeController {
    private final FoodIntakeRepository foodIntakeRepository;
    FoodIntakeController (FoodIntakeRepository foodIntakeRepository) {
        this.foodIntakeRepository = foodIntakeRepository;
    }

    @GetMapping("/foodintake/all")
    Iterable<FoodIntake> findAll() {
       return foodIntakeRepository.findAll();
    }

    @GetMapping("/foodintake/{id}")
    Optional<FoodIntake> findById(@PathVariable String id) {
        return foodIntakeRepository.findById(id);
    }

    @PostMapping ("foodintake/")
    FoodIntake saveFoodIntake(@RequestBody FoodIntake foodIntake) {
        return foodIntakeRepository.save(foodIntake);
    }

    @DeleteMapping("/foodintake/{id}")
    void deleteFoodIntake(@PathVariable String id) {
        foodIntakeRepository.deleteById(id);
    }

    @PutMapping("/foodintake/{id}")
    ResponseEntity<FoodIntake> putFoodIntake
            (@PathVariable String id, @RequestBody FoodIntake foodIntake) {
        return foodIntakeRepository.existsById(id) ?
                new ResponseEntity<>(foodIntakeRepository.save(foodIntake), HttpStatus.OK) :
                new ResponseEntity<>(foodIntakeRepository.save(foodIntake), HttpStatus.CREATED);
    }
}
