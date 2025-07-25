package com.market.zepto.controller;

import com.market.zepto.entity.Food;
import com.market.zepto.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping("/add")
    public void addFood(@RequestBody Food food) {
        foodService.add(food);
    }

    @PostMapping("/addAll")
    public void addAllFood(@RequestBody List<Food> foodList) {
        foodService.addAll(foodList);
    }

    @GetMapping("/getAll")
    public List<Food> getAllFood() {
        return foodService.getAll();
    }

    @GetMapping("get/{id}")
    public Optional<Food> getFoodById(@PathVariable Integer id) {
        return foodService.getById(id);
    }

    @PutMapping("put/{id}")
    public void updateFood(@PathVariable int id, @RequestBody Food food) {
        foodService.update(id, food);
    }

    @DeleteMapping("delete/{id}")
    public void deleteFoodById(@PathVariable Integer id) {
        foodService.deleteById(id);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAllFood() {
        foodService.deleteAll();
    }
}
