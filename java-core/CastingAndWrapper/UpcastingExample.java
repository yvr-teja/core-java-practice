package basic.java.course;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting: Dog is automatically upcast to Animal
        animal.sound();  // Calls Dog's sound method due to polymorphism
    }
}

