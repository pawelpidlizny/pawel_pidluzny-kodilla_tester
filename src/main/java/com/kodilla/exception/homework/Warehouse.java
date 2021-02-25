package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Order> orderList = new ArrayList<>();

    public void aadOrder (Order order){
        orderList.add(order);
    }

    public Order getOrder (String number) throws OrderDoesntExistException {
        return orderList.stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst()
                .orElseThrow(()-> new OrderDoesntExistException());
    }

}
