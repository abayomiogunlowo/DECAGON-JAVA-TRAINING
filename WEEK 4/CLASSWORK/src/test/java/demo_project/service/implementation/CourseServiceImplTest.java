package demo_project.service.implementation;

import demo_project.enums.CourseOffer;
import demo_project.enums.Gender;
import demo_project.model.Course;
import demo_project.model.Teacher;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceImplTest {

    @Test
    void itShouldBeTeachCourse() {
        // Arrange

        // Create a mock Teacher object
        Teacher teacherInput = new Teacher("Yomi", 31, Gender.MALE);
        //Create a mock course object
        Course course = new Course(CourseOffer.JAVA);

        // Create an instance of TeachableServiceImpl
        CourseServiceImpl teachableService = new CourseServiceImpl();
        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.out.println(new PrintStream(actualContent));

        // Act
        // Call the method being tested
        teachableService.teachCourse(teacherInput, course);

        // Assert
        // Retrieve the output from the console
        String expected = "FullName : Yomi\nGender : MALE\nAge : 31\nCourse taught : JAVA\n";
        assertEquals(expected, actualContent.toString());
    }

    @Test
    void itShouldBeTakeCourse() {
    }
}