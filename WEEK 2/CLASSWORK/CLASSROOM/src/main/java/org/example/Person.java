package org.example;

import org.example.enums.Gender;

public abstract class Person {
    private String name;
    private int age;
    private Gender personGender;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", personGender=" + personGender +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getPersonGender() {
        return personGender;
    }

    public void setPersonGender(Gender personGender) {
        this.personGender = personGender;
    }
}
