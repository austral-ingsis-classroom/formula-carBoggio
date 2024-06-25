package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.BinaryOperation;
import edu.austral.ingsis.math.Function;

import java.util.Map;

public class Multiplication extends BinaryOperation {
    public Multiplication(Function left, Function right) {
        super(left, right);
    }

    @Override
    public double evaluate(Map<String, Double> variables) {
        return left.evaluate(variables) * right.evaluate(variables);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }



}
