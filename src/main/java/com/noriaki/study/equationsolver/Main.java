package com.noriaki.study.equationsolver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        double a = 4;
        double b = 7;
        double c = 3;
        double y = 0; //значение после равно

        Equation equation = new Equation(a, b, c, y);
        EquationSolver equationSolver = new EquationSolver();
        List<Double> solve = equationSolver.solve(equation);
        if (solve.isEmpty()) {
            System.out.println("There is no solves");
        } else {
            for (Double aDouble : solve) {
                System.out.println("x = " + aDouble);
            }
        }
    }
}