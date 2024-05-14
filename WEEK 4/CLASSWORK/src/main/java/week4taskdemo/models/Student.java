package week4taskdemo.models;

public class Student {
    private int admissionId;
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private int age;

    public Student(int admissionId, String firstName, String lastName, String dob, String gender, int age) {
        this.admissionId = admissionId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.age = age;
    }

    public int getAdmissionId() {
        return admissionId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
