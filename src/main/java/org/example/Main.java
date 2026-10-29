package org.example;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("РОСТІК");
        Animal myCat = new Cat("ЗІЛ");

        System.out.println(myDog.getName() + " каже: " + myDog.makeSound());
        System.out.println(myCat.getName() + " каже: " + myCat.makeSound());

    }
}