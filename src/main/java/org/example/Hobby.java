package org.example;

import java.util.List;

public class Hobby {
    public String nameOfHobby;
    public int frequencyPerWeek;
    public String country;

    public Hobby(String nameOfHobby) {
        this.nameOfHobby = nameOfHobby;
    }

    public Hobby(String nameOfHobby, int frequencyPerWeek) {
        this(nameOfHobby, frequencyPerWeek,
                "country_not_found");
    }

    public Hobby(String nameOfHobby, int frequencyPerWeek, String country) {
        this.nameOfHobby = nameOfHobby;
        this.frequencyPerWeek = frequencyPerWeek;
        this.country = country;
    }

    public static void printHobbies(List<Hobby> hobbies) {
        for (Hobby hobby : hobbies) {
            System.out.println(hobby);
        }
    }

    @Override
    public String toString() {
        return  nameOfHobby ;

    }
}
