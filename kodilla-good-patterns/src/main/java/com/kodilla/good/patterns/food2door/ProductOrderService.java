package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.challenges.Product;

public class ProductOrderService {

    public boolean order(Producer producer, Product product, int quantity) {
        return producer.process(product, quantity);
    }


}
