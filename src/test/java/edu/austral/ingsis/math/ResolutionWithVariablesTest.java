package edu.austral.ingsis.math;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import edu.austral.ingsis.math.Operations.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class ResolutionWithVariablesTest {

  /** Case 1 + x where x = 3 */
  @Test
  public void shouldEvaluateExpression() {
    Function one = new Constant(1);
    Function x = new Variable("x");
    Function sum = new Sum(one, x);

    Map<String, Double> variables = new HashMap<>();
    variables.put("x", 3.0);

    double result = sum.evaluate(variables);

    assertThat(result, equalTo(4.0));
  }

  /** Case 12 / div where div = 4 */
  @Test
  public void shouldResolveFunction2() {
    Function twelve = new Constant(12);
    Function div = new Variable("div");
    Function division = new Division(twelve, div);

    Map<String, Double> variables = new HashMap<>();
    variables.put("div", 4.0);

    double result = division.evaluate(variables);

    assertThat(result, equalTo(3.0));
  }

  /** Case (9 / x) * y where x = 3 and y = 4 */
  @Test
  public void shouldResolveFunction3() {
    Function nine = new Constant(9);
    Function x = new Variable("x");
    Function y = new Variable("y");
    Function division = new Division(nine, x);
    Function multiplication = new Multiplication(division, y);

    Map<String, Double> variables = new HashMap<>();
    variables.put("x", 3.0);
    variables.put("y", 4.0);

    double result = multiplication.evaluate(variables);

    assertThat(result, equalTo(12.0));
  }

  /** Case (27 / a) ^ b where a = 9 and b = 3 */
  @Test
  public void shouldResolveFunction4() {
    Function twentySeven = new Constant(27);
    Function a = new Variable("a");
    Function b = new Variable("b");
    Function division = new Division(twentySeven, a);
    Function power = new Power(division, b);

    Map<String, Double> variables = new HashMap<>();
    variables.put("a", 9.0);
    variables.put("b", 3.0);

    double result = power.evaluate(variables);

    assertThat(result, equalTo(27.0));
  }

  /** Case z ^ (1/2) where z = 36 */
  @Test
  public void shouldResolveFunction5() {
    Function z = new Variable("z");
    Function squareRoot = new SquareRoot(z);

    Map<String, Double> variables = new HashMap<>();
    variables.put("z", 36.0);

    double result = squareRoot.evaluate(variables);

    assertThat(result, equalTo(6.0));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction6() {
    Function value = new Variable("value");
    Function absoluteValue = new Absolute(value);
    Function the8 = new Constant(8);
    Function sub = new Subtraction(absoluteValue, the8);
    Map<String, Double> variables = new HashMap<>();
    variables.put("value", 8.0);

    double result = sub.evaluate(variables);

    assertThat(result, equalTo(0.0));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction7() {
    Function value = new Variable("value");
    Function absoluteValue = new Absolute(value);
    Function the8 = new Constant(8);
    Function sub = new Subtraction(absoluteValue, the8);
    Map<String, Double> variables = new HashMap<>();
    variables.put("value", 8.0);

    double result = sub.evaluate(variables);

    assertThat(result, equalTo(0.0));
  }

  /** Case (5 - i) * 8 where i = 2 */
  @Test
  public void shouldResolveFunction8() {
    Function five = new Constant(5);
    Function i = new Variable("i");
    Function subtraction = new Subtraction(five, i);
    Function multiplication = new Multiplication(subtraction, new Constant(8));

    Map<String, Double> variables = new HashMap<>();
    variables.put("i", 2.0);

    double result = multiplication.evaluate(variables);

    assertThat(result, equalTo(24.0));
  }
}
