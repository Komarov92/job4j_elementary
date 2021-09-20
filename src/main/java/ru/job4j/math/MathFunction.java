package ru.job4j.math;

public class MathFunction {

    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double minus(double first, double second) {
        return first - second;
    }

    public static double div(double first, double second) {
        return first / second;
    }

    public static double bmx(double first, double second) {
        return (first - second) + (first / second);
    }

    public static double rip(double first, double second) {
        return (first * second) + (first - second) + (first / second) + (first + second);
    }
}