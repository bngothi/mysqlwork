package com.assignment_6.mysqlwork.controller;

import com.assignment_6.mysqlwork.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// make this a rest controller
@RestController
@RequestMapping(path = "/addressbook")
public class AddressController {
    //auto wire user repository
    @Autowired
    AddressRepository addressRepository;

    //to test our service is up and running
    @GetMapping
    public String check() {
        return "Welcome to Assignment 6";
    }

    /**
     *  this method returns values stored in the database
     * @return addressRepository
     */

    @GetMapping(path = "/getaddressbookvalues")
    public List<String> getFirstName() {
        return addressRepository.getFirstName();

    }

}
