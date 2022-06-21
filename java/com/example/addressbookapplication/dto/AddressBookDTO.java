package com.example.addressbookapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBookDTO {

    @NotNull(message = "User name shouldn't be null")
    @NotBlank
    private String name;

    @NotNull(message = "mobile no shouldn't be null")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid mobileNo entered")
    private String mobileNo;

    @NotBlank
    @Email(message = "Email address entered is not valid")
    private String emailId;

    @NotNull
    private String country;

    @NotNull
    private String state;

    @NotNull
    private String city;

    @NotNull(message = "pin-code shouldn't be null")
    private long pinCode;

    @NotNull(message = "Address should not be null")
    private String address;
}
