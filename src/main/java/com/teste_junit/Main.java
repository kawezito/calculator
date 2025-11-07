package com.teste_junit;

import com.teste_junit.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double sum = calculator.sum(12, 2);
        double division = calculator.division(12, 2);
        boolean isPositive = calculator.isPositiveNums(12, 2);
        boolean isNegative = calculator.isNegativeNums(12, 2);

        System.err.println("A soma entre 12 e 2 foi: " + sum + "\n"
                + "A divisão entre 12 e 2 foi: " + division + "\n"
                + "A verifição de 12 e 2 para números positivos foi: " + isPositive + "\n"
                + "A verificação de 12 e 2 para números negativos foi: " + isNegative);
    }
}