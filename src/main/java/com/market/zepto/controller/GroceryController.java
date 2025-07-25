package com.market.zepto.controller;

import com.market.zepto.entity.Grocery;
import com.market.zepto.service.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/grocery")
public class GroceryController {

    @Autowired
    private GroceryService groceryService;

    @PostMapping("/add")
    public void addGrocery(@RequestBody Grocery grocery) {
        groceryService.add(grocery);
    }

    @PostMapping("/addAll")
    public void addAllGrocery(@RequestBody List<Grocery> groceryList) {
        groceryService.addAll(groceryList);
    }

    @GetMapping("/getAll")
    public List<Grocery> getAllGrocery() {
        return groceryService.getAll();
    }

    @GetMapping("get/{id}")
    public Optional<Grocery> getGroceryById(@PathVariable Integer id) {
        return groceryService.getById(id);
    }

    @PutMapping("put/{id}")
    public void updateGrocery(@PathVariable int id, @RequestBody Grocery grocery) {
        groceryService.update(id, grocery);
    }

    @DeleteMapping("delete/{id}")
    public void deleteGroceryById(@PathVariable Integer id) {
        groceryService.deleteById(id);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAllGrocery() {
        groceryService.deleteAll();
    }
}
