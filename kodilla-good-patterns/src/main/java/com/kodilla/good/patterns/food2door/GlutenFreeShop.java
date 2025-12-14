package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.challenges.Product;

public class GlutenFreeShop implements Producer {
    @Override
    public boolean process(Product product, int quantity) {
        return quantity < 15;
    }
}
