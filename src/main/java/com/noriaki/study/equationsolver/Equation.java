package com.noriaki.study.equationsolver;

public class Equation {
    private double a;
    private double b;
    private double c;

    public Equation(double a, double b, double c, double y) {
        this.a = a;
        this.b = b;
        if (y != 0) {
            this.c = c - y;
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}