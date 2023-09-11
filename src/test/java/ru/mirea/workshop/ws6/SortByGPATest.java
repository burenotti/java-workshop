package ru.mirea.workshop.ws6;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortByGPATest {

    @Test
    public void test() {
        Student[] students = {
                new Student("1", "John Doe 1", 30),
                new Student("1", "Jane Doe", 10),
                new Student("1", "John Doe 2", 20),
                new Student("1", "Jane Doe 1", 50),
                new Student("1", "John Doe", 60),
        };

        Student[] target = {
                new Student("1", "Jane Doe", 10),
                new Student("1", "John Doe 2", 20),
                new Student("1", "John Doe 1", 30),
                new Student("1", "Jane Doe 1", 50),
                new Student("1", "John Doe", 60),
        };
        Arrays.sort(students, new SortByGPA());
        Assert.assertArrayEquals(target, students);
    }
}
