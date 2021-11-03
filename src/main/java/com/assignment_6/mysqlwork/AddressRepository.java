package com.assignment_6.mysqlwork;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepository extends JpaRepository<AddressBook, Long> {

    @Query("SELECT p FROM AddressBook p WHERE CONCAT(p.first_name, ' ', p.last_name, ' ', p.street_address, ' ', p.additional_address, ' ', p.city_or_town, ' ', p.state, ' ',p.zip_code, ' ', p.email_address, ' ', p.telephone) LIKE %?1%")
            public List<AddressBook> search(String keyword);

}
