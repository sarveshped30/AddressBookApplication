package com.example.addressbookapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor(staticName = "Build")
@NoArgsConstructor
public class AddressBook {

    @Id
    @GeneratedValue
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
