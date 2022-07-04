package ru.netology.course;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String city;

    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Не указано имя");
        } else this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) throws IllegalArgumentException {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Не указана фамилия");
        } else this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше 0");
        } else this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        Person person;
        if (name == null || surname == null)
            throw new IllegalStateException("Не указаны фамилия или имя");
        if (age < 0) {
            person = new Person(name, surname);
        } else person = new Person(name, surname, age);
        person.setAddress(city);
        return person;
    }
}
