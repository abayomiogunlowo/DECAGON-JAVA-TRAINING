package week4taskdemo;

import week4taskdemo.models.Student;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Step 1 Create an array of student objects
        Student[] students = {
                new Student(1, "Abayomi", "Ogunlowo", "10/10/2004", "MALE", 45),
                new Student(2, "Bayomi", "Ogunlowo", "10/10/2004", "MALE", 46),
                new Student(3, "Yomi", "Ogunlowo", "10/10/2004", "MALE", 47),
                new Student(4, "Victor", "Ogunlowo", "10/10/2004", "MALE", 48),
                new Student(5, "Segun", "Ogunlowo", "10/10/2004", "MALE", 49)
        };

        // Write student objects to a csv file
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        try {
            FileWriter fw = new FileWriter(desktopPath + "/students.csv");
            fw.write("AdmissionID, FirstName, LastName, DOB, Gender, Age\n");

            for(Student student : students){
                fw.write(student.getAdmissionId() + ", ");
                fw.write(student.getFirstName() + ", ");
                fw.write(student.getLastName() + ", ");
                fw.write(student.getDob() + ", ");
                fw.write(student.getGender() + ", ");
                fw.write(student.getAge() + "\n ");
            }
            fw.close();
            System.out.println("Successfully written into a CSV file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
