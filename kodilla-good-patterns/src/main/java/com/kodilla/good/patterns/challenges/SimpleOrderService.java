package com.kodilla.good.patterns.challenges;

public class SimpleOrderService implements OrderService{
    @Override
    public boolean order(User user, Product product, int quantity) {
        return true;
    }
}
