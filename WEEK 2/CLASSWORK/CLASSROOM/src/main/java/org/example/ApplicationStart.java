package org.example;

import org.example.enums.Gender;
import org.example.enums.StackClass;

public class ApplicationStart {
    public static void main(String[] args) {

        // SET DECADEV'S INFORMATION
        DecaDev decaDev = new DecaDev();
        decaDev.setName("Hamlet");
        decaDev.setAge(28);
        decaDev.setPersonGender(Gender.MALE);
        decaDev.setStudentID("STUDENTID123");
        decaDev.setGradeLevel(12);
        decaDev.setStackclass(StackClass.JAVA);

        // SET INSTRUCTOR'S INFORMATION
        Instructor instructor = new Instructor();
        instructor.setName("Instructor Daro");
        instructor.setAge(31);
        instructor.setPersonGender(Gender.MALE);
        instructor.setActiveDays(4);

        // SET CLASSROOM INFORMATION
        ClassRoom javaClassRoom = new ClassRoom();
        javaClassRoom.setDecadevLead(decaDev);
        javaClassRoom.setNoOfDecaDevs(20);
        javaClassRoom.setNoOfTables(5);

        decaDev.getStudentID();

        // PRINT/CONSTRUCT STATEMENT
        System.out.println("In the "+decaDev.getStackclass() + " classroom at Decagon Institute, we enjoy great comfort sitting across " + javaClassRoom.getNoOfTables() + " tables and being tutored by the great "+ instructor.getName() + ", while also being guided by our class lead named " + decaDev.getName() + " throughout our program lifecycle.");
    }
}