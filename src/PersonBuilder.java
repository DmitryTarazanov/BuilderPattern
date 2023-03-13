package src;

import java.util.OptionalInt;

public class PersonBuilder {
    private Person newPerson;
    protected String name;
    protected String surname;
    protected int age;
    protected String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalArgumentException("Поле name должно быть заполнено!");
        }
        if (surname == null) {
            throw new IllegalArgumentException("Поле surname должно быть заполнено!");
        }
        if (OptionalInt.of(age) != null) {
            if (age < 0) {
                throw new IllegalArgumentException("Возраст не может быть отрицательным!");
            } else {
                newPerson = new Person(name, surname, age);
            }
        } else {
            newPerson = new Person(name, surname);
        }
        if (address != null) {
            newPerson.setAddress(address);
        }
        return newPerson;
    }
}
