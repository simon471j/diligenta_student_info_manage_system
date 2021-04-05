package com.diligent_bee.student_information_management_system;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;
        if (student1.mark < student2.mark) {
            return 1;
        } else if (student1.mark > student2.mark)
            return -1;
        else return 0;
    }
}
