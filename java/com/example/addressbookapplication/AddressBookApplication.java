package com.example.addressbookapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressBookApplication {

    public static void main(String[] args) {
        System.out.println("-----Welcome to addressBook-----");
        SpringApplication.run(AddressBookApplication.class, args);
    }
}
