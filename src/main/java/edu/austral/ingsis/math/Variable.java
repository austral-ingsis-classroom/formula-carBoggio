package edu.austral.ingsis.math;

import java.util.Collections;
import java.util.List;
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

    @Override
    public List<String> listVariables() {
        return List.of(name);
    }


}