package ru.hse.lab1.second;
/**
 * @author Батраков Артём Олегович
 * @version 1.0
 * @since 2026
 * 
 */
public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}
