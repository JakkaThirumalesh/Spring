package com.market.zepto.service;

import com.market.zepto.entity.Clothing;
import com.market.zepto.repo.ClothingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClothingService {

    @Autowired
    private ClothingRepo clothingRepo;

    //create
    public void add(Clothing clothing){
        clothingRepo.save(clothing);
    }

    public void addAll(List<Clothing> clothingList){
        clothingRepo.saveAll(clothingList);
    }

    //read
    public Optional<Clothing> getById(Integer id){
        return clothingRepo.findById(id);
    }

    public List<Clothing> getAll(){
        return clothingRepo.findAll();
    }

    //update
    public void update(int id, Clothing clothing){
        Optional<Clothing> oldData = clothingRepo.findById(id);
        oldData.get().setItemName(clothing.getItemName());
        oldData.get().setPrice(clothing.getPrice());
        oldData.get().setDiscountPrice(clothing.getDiscountPrice());
    }

    //delete
    public void deleteById(Integer id){
        clothingRepo.deleteById(id);
    }

    public void deleteAll(){
        clothingRepo.deleteAll();
    }
}
