package src.main.java.class_activity_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add("Orange");
        String[] convertToArray = fruits.toArray(fruits.toArray(new String[0]));
        System.out.println("Array: " + Arrays.toString(convertToArray));
    }
}