package edu.austral.ingsis.math;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import edu.austral.ingsis.math.Operations.*;
import org.junit.jupiter.api.Test;

public class ResolutionTest {

  /** Case 1 + 6 */
  @Test
  public void shouldResolveSimpleFunction1() {
    Function one = new Constant(1);
    Function six = new Constant(6);
    Function operation = new Sum(one, six);

    Double result = evaluateFunction(operation);

    assertThat(result, equalTo(7d));
  }

  private Double evaluateFunction(Function function) {
    return function.evaluate(null);
  }

  @Test
  public void shouldResolveSimpleFunction2() {
    Function twelve = new Constant(12);
    Function two = new Constant(2);
    Function operation = new Division(twelve, two);

    Double result = evaluateFunction(operation);

    assertThat(result, equalTo(6d));
  }

  @Test
  public void shouldResolveSimpleFunction3() {
    Function nine = new Constant(9);
    Function two = new Constant(2);
    Function three = new Constant(3);

    Function division = new Division(nine, two);
    Function multiplication = new Multiplication(division, three);

    Double result = evaluateFunction(multiplication);

    assertThat(result, equalTo(13.5d));
  }

  @Test
  public void shouldResolveSimpleFunction4() {
    Function twentySeven = new Constant(27);
    Function six = new Constant(6);
    Function two = new Constant(2);

    Function division = new Division(twentySeven, six);
    Function power = new Power(division, two);

    Double result = evaluateFunction(power);

    assertThat(result, equalTo(20.25d));
  }

  @Test
  public void shouldResolveSimpleFunction5() {
    Function thirtySix = new Constant(36);
    Function half = new Constant(0.5);

    Function power = new Power(thirtySix, half);

    Double result = evaluateFunction(power);

    assertThat(result, equalTo(6d));
  }

  @Test
  public void shouldResolveSimpleFunction6() {
    Function hundredThirtySix = new Constant(136);
    Function abs = new Absolute(hundredThirtySix);

    Double result = evaluateFunction(abs);

    assertThat(result, equalTo(136d));
  }

  @Test
  public void shouldResolveSimpleFunction7() {
    Function negativeHundredThirtySix = new Constant(-136);
    Function abs = new Absolute(negativeHundredThirtySix);

    Double result = evaluateFunction(abs);

    assertThat(result, equalTo(136d));
  }

  @Test
  public void shouldResolveSimpleFunction8() {
    Function five = new Constant(5);
    Function eight = new Constant(8);
    Function subtraction = new Subtraction(five, five);
    Function multiplication = new Multiplication(subtraction, eight);

    Double result = evaluateFunction(multiplication);

    assertThat(result, equalTo(0d));
  }
}
