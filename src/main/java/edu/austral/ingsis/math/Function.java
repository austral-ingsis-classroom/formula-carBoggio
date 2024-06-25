package edu.austral.ingsis.math;

import java.util.Map;

public interface Function {
    public  double evaluate(Map<String, Double> variables);
    public String toString();
}
