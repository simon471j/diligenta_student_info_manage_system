package com.diligent_bee.student_information_management_system;

public class Student {
    String name;
    int rank;
    float mark;
    boolean gender;     //true为男孩

    public Student() {
    }

    public Student(String name, int rank, float mark, boolean gender) {
        setName(name);
        setRank(rank);
        setMark(mark);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}
