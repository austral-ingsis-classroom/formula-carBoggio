package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Function;

import java.util.Map;

public class Constant implements Function {

    private final double value;


    public Constant(double value) {
        this.value = value;
    }


    @Override
    public double evaluate(Map<String, Double> variables) {
        return value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
