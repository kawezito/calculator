package com.teste_junit.classes;

public class Calculator {
  public int division(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Cannot divide by zero");
    }
    return a / b;
  }

  public int sum(int a, int b) {
    return a + b;
  }

  public int multiplication(int a, int b) {
    return a * b;
  }
}

