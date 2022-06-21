package com.example.addressbookapplication.repository;

import com.example.addressbookapplication.model.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBook, Integer> {

}
