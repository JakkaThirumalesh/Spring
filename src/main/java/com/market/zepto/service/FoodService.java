package com.market.zepto.service;

import com.market.zepto.entity.Food;
import com.market.zepto.repo.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    private FoodRepo foodRepo;

    //create
    public void add(Food food){
        foodRepo.save(food);
    }

    public void addAll(List<Food> foodList){
        foodRepo.saveAll(foodList);
    }

    //read
    public Optional<Food> getById(Integer id){
        return foodRepo.findById(id);
    }

    public List<Food> getAll(){
        return foodRepo.findAll();
    }

    //update
    public void update(int id, Food food){
        Optional<Food> oldData = foodRepo.findById(id);
        oldData.get().setItemName(food.getItemName());
        oldData.get().setPrice(food.getPrice());
        oldData.get().setDiscountPrice(food.getDiscountPrice());
    }

    //delete
    public void deleteById(Integer id){
        foodRepo.deleteById(id);
    }

    public void deleteAll(){
        foodRepo.deleteAll();
    }
}
