package com.noriaki.study.equationsolver;

import java.util.ArrayList;
import java.util.List;

public class EquationSolver {
    private Equation equation;

    public List<Double> solve(Equation equation) {
        List<Double> result = new ArrayList<>();
        this.equation = equation;
        if (haveSolvation()) {
            double x1 = (-equation.getB() + Math.sqrt(calcDiscriminant())) / (2 * equation.getA());
            double x2 = (-equation.getB() - Math.sqrt(calcDiscriminant())) / (2 * equation.getA());
            result.add(x1);
            result.add(x2);
        }
        return result;
    }

    private double calcDiscriminant() {
        double discriminant = equation.getB()*equation.getB() - 4 * equation.getA() * equation.getC();
        return discriminant;
    }

    private boolean haveSolvation() {
        if (calcDiscriminant() < 0) {
            return false;
        } else {
            return true;
        }
    }
}
