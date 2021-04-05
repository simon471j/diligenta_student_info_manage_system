package com.diligent_bee.student_information_management_system;

public class Student {
    String name;
    int mark;
    boolean gender;     //true为男孩

    public Student() {
    }

    public Student(String name, int mark, boolean gender) {
        setName(name);
        setMark(mark);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}
