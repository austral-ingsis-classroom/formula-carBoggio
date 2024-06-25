package edu.austral.ingsis.math;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.austral.ingsis.math.Operations.*;
import org.junit.jupiter.api.Test;

public class PrintTest {

  @Test
  public void shouldPrintFunction1() {
    Function one = new Constant(1);
    Function six = new Constant(6);

    Function operation = new Sum(one, six);

    String str = operation.toString();
    assertEquals("(1.0 + 6.0)", str);
  }

  @Test
  public void shouldPrintFunction2() {
    Function twelve = new Constant(12);
    Function two = new Constant(2);

    Function operation = new Division(twelve, two);

    String str = operation.toString();
    assertEquals("(12.0 / 2.0)", str);
  }

  @Test
  public void shouldPrintFunction3() {
    Function nine = new Constant(9);
    Function two = new Constant(2);
    Function three = new Constant(3);

    Function division = new Division(nine, two);
    Function operation = new Multiplication(division, three);

    String str = operation.toString();
    assertEquals("((9.0 / 2.0) * 3.0)", str);
  }

  @Test
  public void shouldPrintFunction4() {
    Function twentySeven = new Constant(27);
    Function six = new Constant(6);
    Function two = new Constant(2);

    Function division = new Division(twentySeven, six);
    Function operation = new Power(division, two);

    String str = operation.toString();
    assertEquals("((27.0 / 6.0) ^ 2.0)", str);
  }

  @Test
  public void shouldPrintFunction6() {
    Function value = new Variable("value");
    Function eight = new Constant(8);

    Function abs = new Absolute(value);
    Function operation = new Subtraction(abs, eight);

    String str = operation.toString();
    assertEquals("(|value| - 8.0)", str);
  }

  @Test
  public void shouldPrintFunction7() {
    Function value = new Variable("value");
    Function eight = new Constant(8);

    Function abs = new Absolute(value);
    Function operation = new Subtraction(abs, eight);

    String str = operation.toString();
    assertEquals("(|value| - 8.0)", str);
  }

  @Test
  public void shouldPrintFunction8() {
    Function five = new Constant(5);
    Function eight = new Constant(8);
    Function i = new Variable("i");

    Function subtraction = new Subtraction(five, i);
    Function operation = new Multiplication(subtraction, eight);

    String str = operation.toString();
    assertEquals("((5.0 - i) * 8.0)", str);
  }
}
