package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height1) {
        double rsl = (height1 - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 185;
        short height1 = 165;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height1);
        System.out.println("Man 185 is " + man);
        System.out.println("Woman 165 is " + woman);
    }

}