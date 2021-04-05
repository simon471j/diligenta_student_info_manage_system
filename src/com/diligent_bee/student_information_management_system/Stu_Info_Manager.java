package com.diligent_bee.student_information_management_system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Stu_Info_Manager {

    ArrayList<Student> students_info_table = new ArrayList<>();

    public void show_stu_info_table() {
        for (Student student : students_info_table) {
            if (student.gender)
                System.out.println("name:" + student.getName() + " mark:" + student.getMark() + " gender: male");
        }
    }

    public void getMarkByName(String name) {
        if (students_info_table == null) {
            System.out.println("没有数据");
        } else {
            for (Student student : students_info_table) {
                if (name.equals(student.getName())) {
                    System.out.println(name + "‘s mark is " + student.getMark());
                }
            }
        }

    }

    public void add_stu_info(String name, int mark, boolean gender) {
        Student stu = new Student(name, mark, gender);
        students_info_table.add(stu);
        Collections.sort(students_info_table, new MyComparator());
    }

    public void getNameByRank(int rank) {
        if (rank > 0 || rank < students_info_table.size()) {
            Student stu;
            stu = students_info_table.get(rank - 1);
            System.out.println("Ranking " + rank + "th is " + stu.getName());
        }
    }

    public void showRanksInBoys() {
        int rank = 0;
        for (Student student : students_info_table) {
            rank++;
            if (student.gender)
                System.out.println(student.name + "'s rank is " + rank);
        }

    }

}
