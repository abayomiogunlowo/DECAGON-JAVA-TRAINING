package org.example;

import org.example.enums.StackClass;

public class Instructor extends Person{
    public StackClass stackClass;
    private int activeDays;

    @Override
    public String toString() {
        return "Instructor{" +
                "stackClass=" + stackClass +
                ", activeDays=" + activeDays +
                '}';
    }

    public StackClass getStackClass() {
        return stackClass;
    }

    public void setStackClass(StackClass stackClass) {
        this.stackClass = stackClass;
    }

    public int getActiveDays() {
        return activeDays;
    }

    public void setActiveDays(int activeDays) {
        this.activeDays = activeDays;
    }
}
