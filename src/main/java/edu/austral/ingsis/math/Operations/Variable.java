package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Function;

import java.util.Map;

public class Variable implements Function {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public double evaluate(Map<String, Double> variables) {
        return variables.get(name);
    }

    @Override
    public String toString() {
        return name;
    }


}