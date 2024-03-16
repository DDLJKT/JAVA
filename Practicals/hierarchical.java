class Animal {
    public void eat() {
        System.out.println("Moves");
    }
}

class Mammal extends Animal {
    public void giveBirth() {
        System.out.println("4 wheels");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("2 wheels");
    }
}

public class hei {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        // Inherited from Animal
        dog.bark(); // Specific to Dog

        Mammal m = new Mammal();
        m.giveBirth();
        m.eat();
    }
}
