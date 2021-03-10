package com.kodillia.exception.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarehouseTestSuite {

    @Test

    public void testGetOrder() throws OrderDoesntExistException{
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.aadOrder(new Order("122"));
        // when
        Order result = warehouse.getOrder("122");
        Order expectedOrder = new Order("122");
        // then
        Assertions.assertEquals(expectedOrder,result);
    }
    @Test
    public void testGetOrder_withExpected() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        Assertions.assertThrows(OrderDoesntExistException.class,()-> warehouse.getOrder("122"));
    }
}