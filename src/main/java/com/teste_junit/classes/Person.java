package com.teste_junit.classes;

public class Person {
  String name;
  String cpf;
  int age;

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

  public int getAge() {
    return age;
  }

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
