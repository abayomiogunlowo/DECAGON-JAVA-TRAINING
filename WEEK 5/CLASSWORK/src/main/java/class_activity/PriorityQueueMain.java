package src.main.java.class_activity;

import src.main.java.class_activity.Model.Person;
import src.main.java.class_activity.Service.Impl.GenderComparatorImpl;

import java.util.*;

public class PriorityQueueMain {
    public static void main(String[] args) {
        PriorityQueue<Person> people = new PriorityQueue<>(new GenderComparatorImpl());

        Person p1 = new Person("Hamletie", 30, "FEMALE");
        Person p2 = new Person("Yomi", 20, "MALE");
        Person p3 = new Person("Enuma", 35, "FEMALE");
        Person p4 = new Person("Mutiu", 25, "MALE");

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        // Print the persons in the queue order
        while (!people.isEmpty()) {
            Person person = people.poll();
            System.out.println(person.getFullName() + " _ " + person.getGender());
        }
    }
}