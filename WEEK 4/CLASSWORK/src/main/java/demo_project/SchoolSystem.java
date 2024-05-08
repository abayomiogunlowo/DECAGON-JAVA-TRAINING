package demo_project;

import demo_project.enums.CourseOffer;
import demo_project.enums.Gender;
import demo_project.model.*;
import demo_project.service.implementation.ApplicantServiceImpl;
import demo_project.service.implementation.CourseServiceImpl;
import demo_project.service.implementation.PrincipalServiceImpl;
import demo_project.service.implementation.StudentServiceImpl;

import java.util.PrimitiveIterator;

public class SchoolSystem {
    public static void main(String[] args){
        Teacher teacher1 = new Teacher("Yomi", 40, Gender.MALE);
        Teacher teacher2 = new Teacher("Victor", 30, Gender.MALE);

        Course course1 = new Course(CourseOffer.JAVA);
        Course course2 = new Course(CourseOffer.DOT_NET);

        CourseServiceImpl courseService1 = new CourseServiceImpl();
        CourseServiceImpl courseService2 = new CourseServiceImpl();

        //System.out.println("Teacher Data: ");
        //courseService1.teachCourse(teacher1, course1);
        //System.out.println("********");

        //System.out.println("Teacher Data: ");
        //courseService2.teachCourse(teacher2, course2);
        //System.out.println("********");


/// STUDENTS

        Student student1 = new Student("Yomi", 40, Gender.MALE);
        Student student2 = new Student("Victor", 30, Gender.MALE);

        //System.out.println("Student Data: ");
        //courseService1.takeCourse(student1, course1);
        //System.out.println("********");

        //System.out.println("Student Data: ");
        //courseService2.takeCourse(student2, course2);
        //System.out.println("********");



        // PRINCIPAL
        Principal principal = new Principal("Yomi", 40, Gender.MALE);
        PrincipalServiceImpl principalData = new PrincipalServiceImpl();
        //principalData.display(principal);


        // STUDENT

        Student student = new Student("Yomi", 40, Gender.MALE);
        StudentServiceImpl expelStudent = new StudentServiceImpl();
        //expelStudent.expelStudent(student, principal);


        // APPLICANT

        Applicants applicants1 = new Applicants("Yomi", 40, Gender.MALE);
        Applicants applicants2 = new Applicants("Yomi", 40, Gender.MALE);
        ApplicantServiceImpl applicantData = new ApplicantServiceImpl();
        //applicantData.displayApplicantData(applicants1);
        applicantData.admitStudent(applicants2);


    }
}