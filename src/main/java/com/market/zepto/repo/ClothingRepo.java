package com.market.zepto.repo;

import com.market.zepto.entity.Clothing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothingRepo extends JpaRepository<Clothing, Integer> {
}
