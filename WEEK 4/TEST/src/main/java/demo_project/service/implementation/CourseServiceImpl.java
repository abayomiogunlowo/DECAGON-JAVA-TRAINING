package demo_project.service.implementation;

import demo_project.model.Course;
import demo_project.model.Student;
import demo_project.model.Teacher;
import demo_project.service.CourseService;

public class CourseServiceImpl implements CourseService {
    @Override
    public void teachCourse(Teacher teacher, Course course) {
        System.out.println("FullName : " + teacher.getName() +
                "\n" + "Gender: " + teacher.getGender() + "\n" + "Age: " + teacher.getAge() +
                "\n" + "Course taught: "+ course.getCourseOffer());

    }
    @Override
    public void takeCourse(Student student, Course course) {
        System.out.println("FullName : " + student.getName() +
                "\n" + "Gender: " + student.getGender() + "\n" + "Age: " + student.getAge() +
                "\n" + "Course taken: "+ course.getCourseOffer());

    }
}