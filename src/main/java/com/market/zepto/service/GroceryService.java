package com.market.zepto.service;

import com.market.zepto.entity.Grocery;
import com.market.zepto.repo.GroceryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroceryService {
    @Autowired
    private GroceryRepo groceryRepo;

    //create
    public void add(Grocery grocery){
        groceryRepo.save(grocery);
    }

    public void addAll(List<Grocery> groceryList){
        groceryRepo.saveAll(groceryList);
    }

    //read
    public Optional<Grocery> getById(Integer id){
        return groceryRepo.findById(id);
    }

    public List<Grocery> getAll(){
        return groceryRepo.findAll();
    }

    //update
    public void update(int id, Grocery grocery){
        Optional<Grocery> oldData = groceryRepo.findById(id);
        oldData.get().setItemName(grocery.getItemName());
        oldData.get().setPrice(grocery.getPrice());
        oldData.get().setDiscountPrice(grocery.getDiscountPrice());
    }

    //delete
    public void deleteById(Integer id){
        groceryRepo.deleteById(id);
    }

    public void deleteAll(){
        groceryRepo.deleteAll();
    }
}
