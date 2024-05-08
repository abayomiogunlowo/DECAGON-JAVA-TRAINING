package demo_project.model;

import demo_project.enums.CourseOffer;

public class Course {
    private CourseOffer courseOffer;

    public Course(CourseOffer courseOffer) {
        this.courseOffer = courseOffer;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseOffer=" + courseOffer +
                '}';
    }

    public CourseOffer getCourseOffer() {
        return courseOffer;
    }

    public void setCourseOffer(CourseOffer courseOffer) {
        this.courseOffer = courseOffer;
    }
}