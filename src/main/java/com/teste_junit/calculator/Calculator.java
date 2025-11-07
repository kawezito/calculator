package com.teste_junit.calculator;

// METODO DE TESTE POSSUI TRES PASSOS
// 1 - PREPARAÇÃO DO CENARIO
// 2 - EXECUÇÃO DO CENARIO
// 3 - VERIFICACAO DO RESULTADO

//  Caso sucesso, casos de erros dentro da media e limites inferiores e superiores     

// METODOS MAIS UTILIZADOS NO JUNIT 5
// assertEquals - Verifica se um valor é igual a outro
// assertThrow - Verifica se uma determinada exceção foi lançada
// assertTrue - Verifica se um valor foi verdadeiro
// assertFalse - Verifica se um valor foi falso 

// TODOS OS METODOS DE TESTES PRECISAM RECEBER A ANOTAÇÃO @Test

public class Calculator {
  public Calculator() {
  }

  public double division(double a, double b) {
    if (b == 0) {
      throw new ArithmeticException("Divisão por zero não é permitida!");
    }

    return a / b;
  }

  public double sum(double a, double b) {
    return a + b;
  }

  public boolean isPositiveNums(double a, double b) {
    return a >= 0 && b >= 0;
  }

  public boolean isNegativeNums(double a, double b) {
    return a < 0 && b < 0;
  }
}
