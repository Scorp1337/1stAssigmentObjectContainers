package org.example;

import java.util.*;


import static org.example.Address.printAddress;
import static org.example.Hobby.printHobbies;
import static org.example.Person.printNameOfPeople;

/**
 * @Author Ionut G
 * With this code you can print persons by name and age. Added two hobbies to Person ionut and one hobby to madalina.
 * I have also listed the hobbies, and for certain persons I added what hobbies they have and where they can practice
 * them.
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Printed in alphabetical order: ");
        TreeSet<Person> setPeople = new TreeSet<>(new ComparatorForName());

        Person ionut = new Person("Ionut", 36);
        Person victor = new Person("Victor", 24);
        Person madalina = new Person("Madalina", 21);

        setPeople.add(ionut);
        setPeople.add(victor);
        setPeople.add(madalina);

        printNameOfPeople(setPeople);

        System.out.println();
        System.out.println("Printed by age order: ");

        TreeSet<Person> setPeople2 = new TreeSet<>(new ComparatorForAge());

        Person ionut2 = new Person("Ionut", 36);
        Person victor2 = new Person("Victor", 24);
        Person madalina2 = new Person("Madalina", 21);

        setPeople2.add(ionut2);
        setPeople2.add(victor2);
        setPeople2.add(madalina2);

        printNameOfPeople(setPeople2);

        List<Address> address = new ArrayList<>();
        System.out.println();
        System.out.println("List of addresses with just City and Country: ");
        address.add(new Address("Rio", "Brazil", "Pele's Street", "13"));
        address.add(new Address("Miami", "USA", "Main Street", "5"));
        address.add(new Address("Chamonix-Mont-Blanc", "France", "Napoleon Street",
                "21"));
        address.add(new Address("Stockholm", "Sweeden", "2nd Street",
                "21"));

        printAddress(address);

        System.out.println();
        List<Hobby> hobbies = new ArrayList<>();

        System.out.println("List of hobbies: ");
        hobbies.add(new Hobby("Football", 2));
        hobbies.add(new Hobby("Ski", 1));
        hobbies.add(new Hobby("Gaming", 5));
        hobbies.add(new Hobby("Driving", 5));
        printHobbies(hobbies);

        System.out.println();
        System.out.println("Each person has stored some hobbies: ");


        System.out.println(ionut.name + " has two hobbies " + hobbies.get(0) + " and " + hobbies.get(2) +
                ", they can be practiced in " + address.get(0).getCountry() + " and "
                + address.get(3).getCountry()+ ".") ;


        System.out.println(madalina.name  + "\'s hobby is " + hobbies.get(3) + " and can be practiced in " +
                address.get(1).getCountry()+ ".");
        System.out.println(victor.name + "\'s hobby is " + hobbies.get(1) + " and can be practiced in " +
                address.get(2).getCountry()+ ".");


        System.out.println();


        Map<Person, Hobby> map = new HashMap<>();


        map.put(ionut, hobbies.get(0));
        map.put(madalina, hobbies.get(3));
        map.put(victor, hobbies.get(0));


        System.out.println("Size of map is: " + map.size());
        System.out.println();
        System.out.println("For key " + ionut + " value is " + map.get(ionut));
        System.out.println("For key " + madalina + " value is " + map.get(madalina));


        System.out.println();
        System.out.println(victor == ionut);

    }
}


