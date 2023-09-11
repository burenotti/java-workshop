package ru.mirea.workshop.ws6;

import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;

public class SortTest extends TestSuite {
    @Test
    public void test_insertionSort() {
        Student[] target = {
                new Student("1", "A John Doe 1", 30),
                new Student("1", "Jane Doe", 10),
                new Student("2", "A John Doe 1", 20),
                new Student("2", "C John Doe", 60),
                new Student("2", "Jane Doe 1", 50),
        };

        Student[] students = {
                new Student("2", "A John Doe 1", 20),
                new Student("1", "A John Doe 1", 30),
                new Student("2", "Jane Doe 1", 50),
                new Student("1", "Jane Doe", 10),
                new Student("2", "C John Doe", 60),
        };
        Sort.insertionSort(students);
        Assert.assertArrayEquals(target, students);
    }

    @Test
    public void test_mergeSorted() {
        Integer[] left = {1, 3, 5, 7, 9};
        Integer[] right = {2, 4, 6, 8, 10};
        Integer[] target = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var actual = Sort.mergeSorted(left, right);
        Assert.assertArrayEquals(target, actual);
    }
}
