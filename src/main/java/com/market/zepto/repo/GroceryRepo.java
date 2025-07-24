package com.market.zepto.repo;

import com.market.zepto.entity.Grocery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryRepo extends JpaRepository<Grocery, Integer> {
}
