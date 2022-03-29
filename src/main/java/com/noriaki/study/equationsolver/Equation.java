package com.noriaki.study.equationsolver;

public class Equation {
    private double a;
    private double b;
    private double c;
    private double y;

    public Equation(double a, double b, double c, double y) {
        this.a = a;
        this.b = b;
        if (y != 0) {
            this.c = c - y;
        }
        this.c = c;
        this.y = y;
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