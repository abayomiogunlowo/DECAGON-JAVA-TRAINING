package src.main.java.class_activity_1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> cityName = new ArrayList<>();
        cityName.add("Enugu");
        cityName.add("Lagos");
        cityName.add("Makurdi");
        cityName.add("Lafia");

        Iterator<String> iterator = cityName.iterator();
        while (iterator.hasNext()){
            String city = iterator.next();
            System.out.println(city);
        }
    }
}
