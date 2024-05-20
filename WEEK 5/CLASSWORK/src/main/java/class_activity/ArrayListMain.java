package src.main.java.class_activity;

import src.main.java.class_activity.Model.Person;
import src.main.java.class_activity.Service.Impl.GenderComparatorImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Person p1 = new Person("Hamletie",30,"FEMALE");
        Person p2 = new Person("Yomi",20,"MALE");
        Person p3 = new Person("Enuma",35,"FEMALE");
        Person p4 = new Person("Mutiu",25,"MALE");

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        Collections.sort(people, new GenderComparatorImpl());
        for (Person persons : people){
            System.out.println(persons.getFullName() + " _ " + persons.getGender());
        }
    }
}