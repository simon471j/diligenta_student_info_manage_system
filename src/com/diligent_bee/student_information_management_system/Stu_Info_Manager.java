package com.diligent_bee.student_information_management_system;

import java.util.ArrayList;


public class Stu_Info_Manager {

    ArrayList<Student> students_info_table = new ArrayList<>();

    public void show_stu_info_table() {
        for (Student student : students_info_table) {
            System.out.println("name:" + student.getName() + " mark:" + student.getMark() + " rank:" + student.getRank() + " gender:" + student.getGender());
        }
    }

    public void getMarkByName(String name) {
        if (students_info_table == null) {
            System.out.println("没有查询到数据");
        } else {
            for (Student student : students_info_table) {
                if (name.equals(student.getName())) {
                    System.out.println(name + "‘s mark is " + student.getMark());
                }
            }
        }

    }

    public void add_stu_info(String name, int rank, float mark, boolean gender) {
        Student stu = new Student(name, rank, mark, gender);
        students_info_table.add(stu);
    }

    public void getNameByRank(int rank) {
        for (Student student : students_info_table) {
            if (rank == student.getRank()) {
                System.out.println("The number " + rank + " is " + student.getName());
            }
        }
    }

    public void showRanksInBoys() {
        for (Student student : students_info_table) {
            if (student.gender) {
                System.out.println(student.name + "'s rank is " + student.rank);
            }
        }

    }

}
