package src.main.java.class_activity.Model;

public class Person {
    private String fullName;
    private int age;
    private String gender;

    public Person(String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
