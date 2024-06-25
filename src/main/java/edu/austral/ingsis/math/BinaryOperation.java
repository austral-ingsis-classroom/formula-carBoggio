package edu.austral.ingsis.math;

import java.util.ArrayList;
import java.util.List;

public abstract class BinaryOperation implements Function {

  protected Function left, right;

  public BinaryOperation(Function left, Function right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public List<String> listVariables() {
    ArrayList<String> variables = new ArrayList<>(left.listVariables());
    variables.addAll(right.listVariables());
    return variables;
  }
}
