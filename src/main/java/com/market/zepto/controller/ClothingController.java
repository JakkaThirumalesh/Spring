package com.market.zepto.controller;

import com.market.zepto.entity.Clothing;
import com.market.zepto.service.ClothingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clothing")
public class ClothingController {

    @Autowired
    private ClothingService clothingService;

    @PostMapping("/add")
    public void addClothing(@RequestBody Clothing clothing) {
        clothingService.add(clothing);
    }

    @PostMapping("/addAll")
    public void addAllClothing(@RequestBody List<Clothing> clothingList) {
        clothingService.addAll(clothingList);
    }

    @GetMapping("/getAll")
    public List<Clothing> getAllClothing() {
        return clothingService.getAll();
    }

    @GetMapping("get/{id}")
    public Optional<Clothing> getClothingById(@PathVariable Integer id) {
        return clothingService.getById(id);
    }

    @PutMapping("put/{id}")
    public void updateClothing(@PathVariable int id, @RequestBody Clothing clothing) {
        clothingService.update(id, clothing);
    }

    @DeleteMapping("delete/{id}")
    public void deleteClothingById(@PathVariable Integer id) {
        clothingService.deleteById(id);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAllClothing() {
        clothingService.deleteAll();
    }
}
