package Inheritance;
class Animal {

    void eat() {
        System.out.println("Eating");
    }

}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }

}

class Cat extends Animal {

    void meow() {
        System.out.println("Meow");
    }

}

class Hirarical{
    public static void main(String[] args) {
        Dog d = new Dog();
Cat c = new Cat();

d.eat();
c.eat();

d.bark();
c.meow();
    }
}