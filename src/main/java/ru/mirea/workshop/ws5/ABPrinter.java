package ru.mirea.workshop.ws5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ABPrinter {

    public static void printRange(int from, int to) {
        System.out.format("%d ", from);
        if (from == to) {
            return;
        } else if (from < to) {
            printRange(from + 1, to);
        } else {
            printRange(from - 1, to);
        }
    }

    public static int digitSum(int x) {
        return (x == 0) ? 0 : digitSum(x / 10) + (x % 10);
    }

    public static int countNumbersWithDigitSum(int k, int d) {
        int count = 0;
        for (int i = (int) Math.pow(10, k - 1) - 1; i < (int) Math.pow(10, k); i++) {
            int sum = digitSum(i);
            if (d == sum) {
                count++;
            }
        }
        return count;
    }

    public static void printPrimeFactors(int n, int d) {
        if (n == 1)
            return;

        if (n % d == 0) {
            System.out.format("%d ", d);
            printPrimeFactors(n / d, d);
        } else {
            printPrimeFactors(n, d + 1);
        }
    }

    public static void printPrimeFactors(int n) {
        printPrimeFactors(n, 2);
    }

    public static boolean isPrime(int n, int d) {
        if (n <= d)
            return true;

        if (n % d == 0) {
            return false;
        } else {
            return isPrime(n, d + 1);
        }
    }

    public static boolean isPrime(int n) {
        return isPrime(n, 2);
    }

    public static int countMaxInSequence(Scanner scanner, Map<Integer, Integer> count, int max) {
        var value = scanner.nextInt();
        if (value == 0) {
            return count.getOrDefault(max, 0);
        }
        count.put(value, count.getOrDefault(value, 0) + 1);
        if (value > max) {
            return countMaxInSequence(scanner, count, value);
        } else {
            return countMaxInSequence(scanner, count, max);
        }
    }


    public static int countMaxInSequence() {
        var scanner = new Scanner(System.in);

        return countMaxInSequence(scanner, new HashMap<>(), Integer.MIN_VALUE);
    }

    public static void main(String[] args) {
        printRange(0, 10);
        System.out.println();
        printRange(10, 0);
        System.out.println();
        System.out.println(countNumbersWithDigitSum(1, 5));
        System.out.println(countNumbersWithDigitSum(2, 5));
        System.out.println(countNumbersWithDigitSum(2, 9));
        System.out.println();
        printPrimeFactors(10);
        System.out.println();
        printPrimeFactors(17);
        System.out.println();
        printPrimeFactors(24);
        System.out.println();
        printPrimeFactors(256);
        System.out.println();
        System.out.println(isPrime(200));
        System.out.println(isPrime(6));
        System.out.println(isPrime(129));
        System.out.println(isPrime(3));
        System.out.println(isPrime(17));

        System.out.println(countMaxInSequence());
    }
}
