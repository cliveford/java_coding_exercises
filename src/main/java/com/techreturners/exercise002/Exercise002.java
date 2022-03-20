package com.techreturners.exercise002;

import java.util.Objects;

class Person{

    public String firstName;
    public String lastName;
    public String town;
    public int age;

    public Person(String firstName, String lastName,  String town, int age ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.town = town;
        this.age = age;
    }
}

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        return Objects.equals(person.town, "Manchester");
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return person.age >= ageLimit;
    }
    
}
