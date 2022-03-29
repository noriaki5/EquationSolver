package com.noriaki.study.equationsolver;

import java.util.ArrayList;
import java.util.List;

public class EquationSolver {
    private Equation equation;

    public List<Double> solve(Equation equation) {
        List<Double> result = new ArrayList<>();
        this.equation = equation;
        if (equation.getA() == 0) {
            if (equation.getB() != 0) {
                double x = -equation.getC() / equation.getB();
                result.add(x);
            }
        }
        else if (haveSolvation()) {
            double x1 = (-equation.getB() + Math.sqrt(calcDiscriminant())) / (2 * equation.getA());
            double x2 = (-equation.getB() - Math.sqrt(calcDiscriminant())) / (2 * equation.getA());
            result.add(x1);
            result.add(x2);
        }
        return result;
    }

    private double calcDiscriminant() {
        return equation.getB()*equation.getB() - 4 * equation.getA() * equation.getC();
    }

    private boolean haveSolvation() {
        return !(calcDiscriminant() < 0);
    }
}