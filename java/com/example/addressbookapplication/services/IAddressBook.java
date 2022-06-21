package com.example.addressbookapplication.services;

import com.example.addressbookapplication.dto.AddressBookDTO;
import com.example.addressbookapplication.model.AddressBook;

import java.util.List;
import java.util.Optional;

public interface IAddressBook {

    AddressBook saveAddress(AddressBookDTO addressBookDTO);
    List<AddressBook> getAddresses();
    Optional<AddressBook> getById(int id);
    AddressBook updateDataById(int id, AddressBookDTO addressBookDTO);
    void deleteDataById(int id);

}
