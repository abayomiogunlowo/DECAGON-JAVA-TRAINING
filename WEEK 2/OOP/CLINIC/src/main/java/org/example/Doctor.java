package org.example;

import org.example.enums.Department;

public class Doctor extends Person{
    public Department department;

    private boolean onDuty;
    private int gradeLevel;

    public Department getDepartment() {

        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public boolean isOnDuty() {
        return onDuty;
    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "department=" + department +
                ", onDuty=" + onDuty +
                ", gradeLevel=" + gradeLevel +
                ", name=" +getName()+
                '}';
    }
}
