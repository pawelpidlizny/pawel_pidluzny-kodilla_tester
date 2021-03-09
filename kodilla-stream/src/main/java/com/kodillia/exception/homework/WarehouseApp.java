package com.kodillia.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.aadOrder(new Order("12222"));
        warehouse.aadOrder(new Order("34444"));
        warehouse.aadOrder(new Order("4444"));

        try {
            Order ord1 = warehouse.getOrder("12657893");
            System.out.println(ord1.getNumber());
            Order ord2 = warehouse.getOrder("bu");
        } catch (OrderDoesntExistException existException) {
            System.out.println("Zamówienie z tym numerem nie istnieje!");
        } finally {
            System.out.println("Koniec ");
        }
    }
}