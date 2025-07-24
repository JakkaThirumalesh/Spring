package com.market.zepto.repo;

import com.market.zepto.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepo extends JpaRepository<Food, Integer> {
}
