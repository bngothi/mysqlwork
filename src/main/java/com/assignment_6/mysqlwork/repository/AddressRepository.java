package com.assignment_6.mysqlwork.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * @return firstnameList - returns list of firstnames
     */
    public List<String> getFirstName() {
        List<String> firstnameList = new ArrayList<>();
        firstnameList.addAll(jdbcTemplate.queryForList("SELECT first_name from address_book.address;", String.class));

        return firstnameList;
    }


}
