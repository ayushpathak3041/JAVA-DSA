package Inheritance;
class Animal {

    void eat() {
        System.out.println("Eating");
    }

}

class Mammal extends Animal {

    void walk() {
        System.out.println("Walking");
    }

}

class Dog extends Mammal {

    void bark() {
        System.out.println("Barking");
    }

}

class multilevel{
    public static void main(String[] args) {
        Dog d = new Dog();
         d.eat();
         d.walk();
         d.bark();

    }
}