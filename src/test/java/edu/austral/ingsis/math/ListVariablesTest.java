package edu.austral.ingsis.math;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.austral.ingsis.math.Operations.*;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ListVariablesTest {

  /** Case 1 + 6 */
  @Test
  public void shouldListVariablesFunction1() {
    final List<String> result = Collections.emptyList();

    assertThat(result, empty());
  }

  /** Case 12 / div */
  @Test
  public void shouldListVariablesFunction2() {

    Function div = new Variable("div");
    List<String> result = div.listVariables();

    assertThat(result, containsInAnyOrder("div"));
  }

  /** Case (9 / x) * y */
  @Test
  public void shouldListVariablesFunction3() {
    Function x = new Variable("x");
    Function y = new Variable("y");
    Function constant9 = new Constant(9);
    Function division = new Division(constant9, x);
    Function expression = new Multiplication(division, y);
    System.out.println("La expresión es: " + expression.toString());

    List<String> result = expression.listVariables();
    assertTrue(result.contains("x"));
    assertTrue(result.contains("y"));
  }

  /** Case (27 / a) ^ b */
  @Test
  public void shouldListVariablesFunction4() {
    Function a = new Variable("a");
    Function b = new Variable("b");

    // Crear la constante 27
    Function constant27 = new Constant(27);

    // Crear la división 27 / a
    Function division = new Division(constant27, a);

    // Crear la potencia (27 / a) ^ b
    Function expression = new Power(division, b);

    List<String> result = expression.listVariables();
    assertTrue(result.contains("a"));
    assertTrue(result.contains("b"));
  }

  /** Case z ^ (1/2) */
  @Test
  public void shouldListVariablesFunction5() {
    Function z = new Variable("z");
    Function constantHalf = new Constant(0.5);
    Function expression = new Power(z, new Division(constantHalf, new Constant(1)));

    System.out.println("La expresión es: " + expression.toString());

    List<String> result = expression.listVariables();

    assertTrue(result.contains("z"));
  }

  @Test
  public void shouldListVariablesFunction6() {
    Function value = new Variable("value");
    Function expression = new Absolute(new Subtraction(value, new Constant(8)));
    List<String> result = expression.listVariables();
    assertTrue(result.contains("value"));
  }

  @Test
  public void shouldListVariablesFunction7() {
    Function value = new Variable("value");
    Function expression = new Absolute(new Subtraction(value, new Constant(8)));
    List<String> result = expression.listVariables();
    assertTrue(result.contains("value"));
  }

  @Test
  public void shouldListVariablesFunction8() {
    Function i = new Variable("i");
    Function expression = new Multiplication(new Subtraction(new Constant(5), i), new Constant(8));
    List<String> result = expression.listVariables();
    assertTrue(result.contains("i"));
  }
}
