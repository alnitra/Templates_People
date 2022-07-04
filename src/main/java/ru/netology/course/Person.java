package ru.netology.course;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return this.age >= 0;
    }
    public boolean hasAddress() {
        return this.city != null ;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getAge() {
       return this.age;
    }
    public String getAddress() {
        return this.city;
    }

    public void setAddress(String address) {
        this.city = address;
    }
    public void happyBirthday() {
        System.out.println("Поздравляем тебе исполнилось: " + age + " лет");
        this.age++;
    }

    @Override
    public String toString() {
        return "Имя: " + this.name + " , фамилия: " + this.surname + " , возраст: " + this.age + " , текущий город: " + this.city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(city);
    }
}
