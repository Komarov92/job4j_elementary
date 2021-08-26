package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (185 - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (165-110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 185;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 185 is " + man);
        System.out.println("Woman 165 is " + woman);
    }

}