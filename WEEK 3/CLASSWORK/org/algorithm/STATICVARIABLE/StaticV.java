package org.algorithm.STATICVARIABLE;

public class StaticV {
    private String name;
    private int classNo;
    private String course;
    private static String principal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public static String getPrincipal() {
        return principal;
    }

    public static void setPrincipal(String principal) {
        StaticV.principal = principal;
    }
}
