package org.example;


import java.util.List;

public class Address {

    public String city;
    public String country;
    public String street;
    public String streetNumber;

    public Address(String city, String country, String street, String streetNumber) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    public static void printAddress(List<Address> addresses) {
        for (Address address : addresses) {
            System.out.println(address);
        }
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

}




