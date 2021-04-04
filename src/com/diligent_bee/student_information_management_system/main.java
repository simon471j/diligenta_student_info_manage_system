package com.diligent_bee.student_information_management_system;

import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Stu_Info_Manager stu = new Stu_Info_Manager();
        stu.add_stu_info("mike",1,100,true);
        stu.add_stu_info("tom",3,98,true);
        stu.add_stu_info("jack",2,99,true);
        stu.add_stu_info("jason",5,96,true);
        stu.add_stu_info("ivy",7,94,false);
        stu.add_stu_info("marry",4,97,false);
        stu.add_stu_info("simon",6,95,true);
        System.out.println("==============get mark by name===============");
        stu.getMarkByName("mike");
        System.out.println("==============get name by rank===============");
        stu.getNameByRank(1);
        System.out.println("==============show ranks in boys===============");
        stu.showRanksInBoys();
        System.out.println("==============show the whole table===============");
        stu.show_stu_info_table();
    }
}
