package ru.mirea.workshop.ws6;

import java.util.ArrayList;

public class Sort {
    public static <T extends Comparable<T>> void insertionSort(T[] input) {
        for (int i = 1; i < input.length; i++) {
            T item = input[i];
            int j = i - 1;
            while (j >= 0 && input[j].compareTo(item) > 0) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = item;
        }
    }

    public static <T extends Comparable<T>> T[] mergeSorted(T[] first, T[] second) {
        var result = new ArrayList<T>(first.length + second.length);
        int firstCur = 0;
        int secondCur = 0;
        while (firstCur < first.length || secondCur < second.length) {
            if (firstCur == first.length) {
                result.add(second[secondCur]);
                secondCur++;
            } else if (secondCur == second.length) {
                result.add(first[firstCur]);
            } else {
                if (first[firstCur].compareTo(second[secondCur]) > 0) {
                    result.add(second[secondCur]);
                    result.add(first[firstCur]);
                } else {
                    result.add(first[firstCur]);
                    result.add(second[secondCur]);
                }
                firstCur++;
                secondCur++;
            }
        }
        return result.toArray(first);
    }
}
