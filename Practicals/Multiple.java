class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Mammal extends Animal {
    public void giveBirth() {
        System.out.println("Mammals give birth.");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.giveBirth();
        // Inherited from Animal
        dog.bark(); // Specific to Dog
    }
}
