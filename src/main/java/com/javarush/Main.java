package com.javarush;

import com.javarush.domain.Customer;

public class Main {

    public static void main(String[] args) {

        Service service = new Service();

        Customer customer = service.createCustomer();

        service.customerReturnInventoryToStore();
        service.customerRentInventory(customer);
        service.newFilmWasRelease();
    }
}