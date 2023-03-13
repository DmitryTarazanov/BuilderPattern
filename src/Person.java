package src;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


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
        return getAge() == null ? false : true;
    }

    public boolean hasAddress() {
        return address == null ? false : true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        age++;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder childBuilder = new PersonBuilder();
        childBuilder.setName(name);
        childBuilder.setSurname(surname);
        return childBuilder;
    }


    @Override
    public String toString() {
        return "Человек [Имя=" + name
                + ", Фамилия=" + surname
                + ", Возраст=" + age
                + ", адрес=" + address + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, getAge(), getAddress());
    }
}
