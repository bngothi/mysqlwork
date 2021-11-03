package com.assignment_6.mysqlwork;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddressBook {
	private Long id;
	private String first_name;
	private String last_name;
	private String street_address;
	private String additional_address;
	private String city_or_town;
	private String state;
	private String zip_code;
	private String email_address;
	private String telephone;

	protected AddressBook() {
	}

	protected AddressBook(Long id, String first_name, String last_name, String street_address,
						  String additional_address, String city_or_town, String state,
						  String zip_code, String email_address, String telephone	) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name= last_name;
		this.street_address = street_address;
		this.additional_address = additional_address;
		this.city_or_town = city_or_town;
		this.state= state;
		this.zip_code = zip_code;
		this.email_address = email_address;
		this.telephone = telephone;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getStreet_address() {
		return street_address;
	}
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

	public String getAdditional_address() {
		return additional_address;
	}
	public void setAdditional_address(String additional_address) {
		this.additional_address = additional_address;
	}

	public String getCity_or_town() {
		return city_or_town;
	}
	public void setCity_or_town(String city_or_town) {
		this.city_or_town = city_or_town;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "AddressBook [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", street_address=" + street_address
				+", additional_address=" + additional_address + ", city_or_town=" + city_or_town + ", state=" + state + ", zip_code="
				+ zip_code + ", email_address=" + email_address + ", telephone=" + telephone
				+ "]";
	}

}
