package edu.austral.ingsis.math.Operations;

import edu.austral.ingsis.math.Function;
import edu.austral.ingsis.math.UnaryOperation;
import java.util.Map;

public class SquareRoot extends UnaryOperation {
  public SquareRoot(Function operand) {
    super(operand);
  }

  @Override
  public double evaluate(Map<String, Double> variables) {
    return Math.sqrt(this.operand.evaluate(variables));
  }

  @Override
  public String toString() {
    return "sqrt(" + getOperand().toString() + ")";
  }
}
