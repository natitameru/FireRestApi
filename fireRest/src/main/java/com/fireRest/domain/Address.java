package com.fireRest.domain;

public class Address {
	//@Id
    //@GeneratedValue(strategy= GenerationType.AUTO, generator = "address_seq_gen")
    //@SequenceGenerator(name="address_seq_gen", sequenceName="ADDRESS_SEQ")
    private Long id; 
     
    //@Column(name = "houseNumber", nullable = false)
    private int houseNumber;
     
    //@Column(name = "streetAddress", nullable = false)
    private String streetAddress;
     
    //@Column(name = "city", nullable = false)
    private String city;
     
    //@Column(name = "state", nullable = false)
    private String state;
     
    //@Column(name = "zipCode", nullable = false)
    private String zipCode;
     
}
