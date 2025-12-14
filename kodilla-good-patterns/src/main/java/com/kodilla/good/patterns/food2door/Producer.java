package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.challenges.Product;

public interface Producer {

    boolean process(Product product, int quantity);
}
