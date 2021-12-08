package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        int x = left[left.length - 1];
        int y = right[right.length - 1];
            if (x == y) {
            return true;
        }
        return false;
    }
}