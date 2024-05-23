package src.main.java.class_activity_7;

import java.util.ArrayList;
import java.util.List;

public class withGenericEx {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList();
        numbers.add("10");
        numbers.add("10");
        System.out.println(numbers);
    }
}

// Create a method and make it generic, take that method duplicate it into String, int, boelean. Using method overload
// Create a class, that dont take any type
