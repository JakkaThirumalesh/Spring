package com.market.zepto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
public class Food {
    @Id
    private int Id;
    private String ItemName;
    private double Price;
    private String DiscountPrice;
}
