package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + minus(first, second)
                + div(first, second)
                + bmx(first, second)
                + rip(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}