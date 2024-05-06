package org.example;

import org.example.enums.StackClass;

public class DecaDev extends Person{
    public StackClass stackclass;
    private String studentID;
    private int gradeLevel;

    @Override
    public String toString() {
        return "DecaDev{" +
                "stackclass=" + stackclass +
                ", studentID='" + studentID + '\'' +
                ", gradeLevel=" + gradeLevel +
                '}';
    }

    public StackClass getStackclass() {
        return stackclass;
    }

    public void setStackclass(StackClass stackclass) {
        this.stackclass = stackclass;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}