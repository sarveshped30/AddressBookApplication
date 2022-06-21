package com.example.addressbookapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "Build")
@NoArgsConstructor
public class AddressBook {

    private int id;
    private String name;
    private String mobileNo;
    private String emailId;
    private String country;
    private String state;
    private String city;
    private long pinCode;
    private String address;
}
