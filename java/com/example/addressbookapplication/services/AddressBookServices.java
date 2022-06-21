package com.example.addressbookapplication.services;

import com.example.addressbookapplication.dto.AddressBookDTO;
import com.example.addressbookapplication.model.AddressBook;
import com.example.addressbookapplication.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AddressBookServices implements IAddressBook{

    @Autowired
    private AddressBookRepository repository;

    @Override
    public AddressBook saveAddress(AddressBookDTO addressBookDTO) {
        AddressBook addressBook = AddressBook.
                Build(0,addressBookDTO.getName(),addressBookDTO.getMobileNo(),
                        addressBookDTO.getEmailId(), addressBookDTO.getCountry(),
                        addressBookDTO.getState(), addressBookDTO.getCity(),
                        addressBookDTO.getPinCode(), addressBookDTO.getAddress());
        return repository.save(addressBook);
    }

    @Override
    public List<AddressBook> getAddresses() {
        return repository.findAll();
    }

    @Override
    public Optional<AddressBook> getById(int id) {
        return repository.findById(id);
    }

    @Override
    public AddressBook updateDataById(int id, AddressBookDTO addressBookDTO) {
        List<AddressBook> dataList = this.getAddresses();
        for (AddressBook addressBook : dataList ) {
            if(addressBook.getId() == id) {
                addressBook.setName(addressBookDTO.getName());
                addressBook.setMobileNo(addressBookDTO.getMobileNo());
                addressBook.setEmailId(addressBookDTO.getEmailId());
                addressBook.setPinCode(addressBookDTO.getPinCode());
                addressBook.setAddress(addressBookDTO.getAddress());
                addressBook.setCountry(addressBookDTO.getCountry());
                addressBook.setState(addressBookDTO.getState());
                addressBook.setCity(addressBookDTO.getCity());
                return repository.save(addressBook);
            }
        }
        return null;
    }

    @Override
    public void deleteDataById(int id) {
        repository.deleteById(id);
    }
}
