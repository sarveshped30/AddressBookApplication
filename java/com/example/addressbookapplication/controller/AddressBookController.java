package com.example.addressbookapplication.controller;

import com.example.addressbookapplication.dto.AddressBookDTO;
import com.example.addressbookapplication.dto.ResponseDTO;
import com.example.addressbookapplication.services.IAddressBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/addressBook")
public class AddressBookController {

    @Autowired
    private IAddressBook addressService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> saveAddress(@RequestBody @Valid AddressBookDTO addressBookDTO) {
        ResponseDTO responseDTO = ResponseDTO.Build("Created data Successfully", addressService.saveAddress(addressBookDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<ResponseDTO> getAddresses() {
        ResponseDTO responseDTO = ResponseDTO.Build("Got all the data", addressService.getAddresses());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/fetch/{id}")
    public ResponseEntity<ResponseDTO> getDataById(@PathVariable int id){
        ResponseDTO responseDTO = ResponseDTO.Build("Got data for Id: " + id, addressService.getById(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateDataById(@PathVariable int id, @RequestBody @Valid AddressBookDTO addressBookDTO) {
        ResponseDTO responseDTO = ResponseDTO.Build("Updated data for given id: " + id, addressService.updateDataById(id, addressBookDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDataById(@PathVariable int id) {
        addressService.deleteDataById(id);
        return new ResponseEntity<>("Deleted data for id: "+ id , HttpStatus.OK);
    }

}
