import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.teste_junit.classes.Calculator;

// Vai dar erro
public class CalculatorTest {
  Calculator calculator = new Calculator();

  @BeforeAll
  static void inicializador() {
    System.out.println("Olá JUnit!");
  }

  @Test
  public void verificaDivisao() {
    assertEquals(5, calculator.division(10, 2));
  }

  @Test
  public void verificaDivisaoPorZero() {
    // Compara erro
    assertThrows(
        IllegalArgumentException.class,
        () -> calculator.division(10, 0));
  }
}
