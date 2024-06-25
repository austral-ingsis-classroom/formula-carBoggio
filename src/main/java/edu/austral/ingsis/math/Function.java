package edu.austral.ingsis.math;

import java.util.List;
import java.util.Map;

public interface Function {
    public  double evaluate(Map<String, Double> variables);
    public String toString();
    public abstract List<String> listVariables();
}
