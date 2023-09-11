package ru.mirea.workshop.ws6;

import java.util.Comparator;

public class SortByGPA implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getGpa(), student2.getGpa());
    }

}
