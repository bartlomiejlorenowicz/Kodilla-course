package com.kodilla.good.patterns.challenges;

public class InMemoryOrderRepository implements OrderRepository{
    @Override
    public void createOrder(User user, Product product, int quantity) {
        System.out.println("Order saved: " + product.getName() +
                ", quantity: " + quantity +
                ", user: " + user.getUsername());
    }
}
