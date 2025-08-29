package zoo;

import animals.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.printf("%s is barking%n", name);
        makeSound();
    }
}
