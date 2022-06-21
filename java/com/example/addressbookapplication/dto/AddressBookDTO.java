package com.example.addressbookapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBookDTO {

    private String name;
    private String mobileNo;
    private String emailId;
    private String country;
    private String state;
    private String city;
    private long pinCode;
    private String address;
}
