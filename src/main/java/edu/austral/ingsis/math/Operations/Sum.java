package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.BinaryOperation;
import edu.austral.ingsis.math.Function;

import java.util.Map;

public class Sum extends BinaryOperation {
    public Sum(Function left, Function right) {
        super(left, right);
    }

    @Override
    public double evaluate(Map<String, Double> variables) {
        return this.left.evaluate(variables) + this.right.evaluate(variables);
    }

    @Override
    public String toString() {
        return "(" + this.left.toString() + " + " + this.right.toString() + ")";
    }
}
