package edu.austral.ingsis.math;

import java.util.List;
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

  @Override
  public List<String> listVariables() {
    return List.of(toString());
  }
}
