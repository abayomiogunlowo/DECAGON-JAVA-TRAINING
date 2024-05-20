package src.main.java.class_activity.Service.Impl;

import src.main.java.class_activity.Model.Person;
import java.util.Comparator;

public class GenderComparatorImpl implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if ("FEMALE".equals(p1.getGender()) && "MALE".equals(p2.getGender())) {
            return -1;
        } else if ("MALE".equals(p1.getGender()) && "FEMALE".equals(p2.getGender())) {
            return 1;
        } else {
            return 0;
        }
    }
}
