package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Function;
import edu.austral.ingsis.math.UnaryOperation;

import java.util.Map;

public class Absolute extends UnaryOperation {
    public Absolute(Function operand) {
        super(operand);
    }

    @Override
    public double evaluate(Map<String, Double> variables) {
        return Math.abs(this.operand.evaluate(variables));
    }

    @Override
    public String toString() {
        return "|" + this.operand.toString() + "|";
    }
}

