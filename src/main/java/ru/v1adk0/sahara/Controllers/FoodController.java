package ru.v1adk0.sahara.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.v1adk0.sahara.Entities.Food;
import ru.v1adk0.sahara.Repositories.FoodRepository;

import java.util.Optional;

@RestController("/food")
class FoodController {

    private final FoodRepository foodRepository;

    FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @GetMapping("food/all")
    Iterable<Food> findAll() {
        return foodRepository.findAll();
    }

    @GetMapping("food/{name}")
    Optional<Food> findByName(@PathVariable String name) {
        return foodRepository.findById(name);
    }

    @PostMapping("food/")
    Food saveFood(@RequestBody Food food) {
        return foodRepository.save(food);
    }

    @DeleteMapping("food/{name}")
    void deleteFood(@PathVariable String name) {
        foodRepository.deleteById(name);
    }

    @PutMapping("food/{id}")
    ResponseEntity<Food> updateFood(@PathVariable String name, @RequestBody Food food) {
        return foodRepository.existsById(name) ?
                new ResponseEntity<>(foodRepository.save(food), HttpStatus.OK) :
                new ResponseEntity<>(foodRepository.save(food), HttpStatus.CREATED);
    }
}
