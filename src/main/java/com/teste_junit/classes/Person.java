package com.teste_junit.classes;

public class Person {
  private String name;
  private String cpf;
  private int age;

  public Person(String name, String cpf, int age) {
    this.name = name;
    this.cpf = cpf;
    this.age = age;
  }

  public Person() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  // Pega idade
  public int getAge() {
    return age;
  }
  // Coloca valor em idade
  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Pessoa" +
        ", name=" + name +
        ", cpf=" + cpf +
        ", age=" + age +
        "]";
  }

}
