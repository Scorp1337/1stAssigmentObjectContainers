package org.example;

import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class Person {

    public String name;
    public Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void printNameOfPeople(TreeSet<Person> people) {

        Iterator<Person> personIterator = people.iterator();

        while (personIterator.hasNext()) {

            final Person nextPerson = personIterator.next();
            System.out.print("Person [name: ");
            System.out.print(nextPerson.name);
            System.out.print("; Age: ");
            System.out.print(nextPerson.age);
            System.out.print("]");
            System.out.println();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;

        if (!Objects.equals(name, person.name)) return false;
        return Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
