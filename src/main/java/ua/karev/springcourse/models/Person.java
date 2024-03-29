package ua.karev.springcourse.models;


import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
  private int id;

  @Min(value = 0, message = "Age should be greater than 0")
  private int age;
  @NotEmpty(message = "Name should not be empty")
  @Size(min = 2, max = 30,
      message = "Name should be between 2 and 30 characters")
  private String name;
  @NotEmpty(message = "Email should not be empty")
  @Email(message = "Email should not be valid")
  private String email;

  public Person() {
  }

  public Person(int id, String name, int age, String email) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.email = email;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public String getEmail() {
    return email;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
