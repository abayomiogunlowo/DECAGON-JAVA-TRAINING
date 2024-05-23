package src.main.java.class_activity_5;

import src.main.java.class_activity.Model.Person;
import src.main.java.class_activity.Service.Impl.GenderComparatorImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(30);
        numbers.add(70);
        numbers.add(40);
        numbers.add(10);

        Collections.sort(numbers);
        for (Integer number : numbers){
            System.out.println(number);
        }
    }
}