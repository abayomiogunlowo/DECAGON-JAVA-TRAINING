package src.main.java.class_activity_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] stack = {"Java", "Node", "Phython"};

        System.out.println("Array: "+ Arrays.toString(stack));
        System.out.println("*****************");

        // converting to array list

        List<String> language = new ArrayList<>();
        for (String s : stack){
            language.add(s);
            System.out.println(language);
        }
    }
}
