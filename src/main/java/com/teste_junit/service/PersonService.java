package com.teste_junit.service;

import com.teste_junit.classes.Person;

public class PersonService {
  // Green - Minimo possivel
  // public Person createPerson(String name, String cpf, int age) {
  // if (age < 18) {
  // throw new IllegalArgumentException("Idade inválida: menor de 18 anos");
  // }

  // if (cpf == null || cpf.length() != 11) {
  // throw new IllegalArgumentException("CPF inválido!");
  // }

  // return new Person(name, cpf, age);
  // }

  // Refactor - Refatoração do código
  // public Person createPerson(String name, String cpf, int age) {
  // validarIdade(age);
  // validarCpf(cpf);

  // return new Person(name, cpf, age);
  // }

  // public void validarIdade(int age) {
  // if (age < 18) {
  // throw new IllegalArgumentException("Idade inválida: menor de 18 anos");
  // }
  // }

  // public void validarCpf(String cpf) {
  // if (cpf == null || cpf.length() != 11) {
  // throw new IllegalArgumentException("CPF inválido!");
  // }
  // }
}
