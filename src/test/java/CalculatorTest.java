import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.teste_junit.calculator.Calculator;

public class CalculatorTest {
  private Calculator calculator;
  private double positiveNum1;
  private double positiveNum2;
  private double negativeNum1;
  private double negativeNum2;
  private double zero;

  // Executa uma vez antes de todo o teste
  @BeforeAll
  public static void beforeAll() {
    System.out.println("Iniciando os testes de classe Calculator...");
  }

  // Executa uma vez depois de todo o teste
  @AfterAll
  public static void afterAll() {
    System.out.println("Todos os testes foram executados!");
  }

  // Executa uma vez antes de cada teste
  @BeforeEach
  public void setUp() {
    System.out.println("Preparando cenário para teste...");

    calculator = new Calculator();

    positiveNum1 = 10.0;
    positiveNum2 = 2.0;
    negativeNum1 = -10;
    negativeNum2 = -20;
    zero = 0;
  }

  // Executa uma vez depois de cada teste
  @AfterEach
  public void afterEach() {
    System.out.println("Finalizando cenário de teste da classe Calculator.\n");
  }

  @Test
  public void testDivisionNormal() {
    // Teste para uma divisão normal
    double result = calculator.division(positiveNum1, positiveNum2);
    String mensagem = positiveNum1 + "/" + positiveNum2 + "deve ser igual a: 5";

    assertEquals(5, result, mensagem);
  }

  @Test
  public void testDivisionByZeroThrowsException() {
    // Teste para visualizar se o número é dividido por zero
    Exception exception = assertThrows(ArithmeticException.class, () -> {
      calculator.division(positiveNum1, zero);
    });

    assertEquals("Divisão por zero não é permitida!", exception.getMessage());
  }

  @Test
  public void testSumNormal() {
    // Teste de uma soma normal
    double result = calculator.sum(20.5, -23);

    // delta indica a diferença minima do numero ao passar pela subtração
    assertEquals(result, -2.5, 0.00001, "20 + (-23) deve ser igual a -2.5");
  }

  @Test
  public void isPositiveNums() {
    // Teste de números positivos
    assertTrue(calculator.isPositiveNums(positiveNum1, positiveNum2),
        "Esperado true para dois números positivos");
  }

  @Test
  public void isPositiveNumsWithOneNegativeNumber() {
    assertFalse(calculator.isPositiveNums(negativeNum1, positiveNum1),
        "Esperado false para um número negativo e um positivo");
  }

  @Test
  public void isNegativeNums() {
    // Teste de números negativos
    assertTrue(calculator.isNegativeNums(negativeNum1, negativeNum2),
        "Esperado true para dois  números negativos!");
  }

  @Test
  public void isNegativeNumsWithOnePositiveNumber() {
    assertFalse(calculator.isNegativeNums(positiveNum1, negativeNum2),
        "Esperado False para um número positivo e um negativo!");
  }
}