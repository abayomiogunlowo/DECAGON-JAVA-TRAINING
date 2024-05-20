package src.main.java.week5_task_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Person p1 = new Person("Hamlet",30);
        Person p2 = new Person("Yomi",20);
        Person p3 = new Person("Enums",35);
        Person p4 = new Person("Mutiu",25);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        Collections.sort(people, new AgeComparator());
        for (Person persons : people){
            System.out.println(persons.getFullName() + " _ " + persons.getAge());
        }
    }
}
