package com.noriaki.study.equationsolver;

public class Equation {
    private double a;
    private double b;
    private double c;

    public Equation(double a, double b, double c, double y) {
        this.a = a;
        this.b = b;
        this.c = y != 0 ? c - y : c;
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