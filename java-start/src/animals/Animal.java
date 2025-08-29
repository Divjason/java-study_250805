package animals;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void makeSound() {
        System.out.printf("%s is making a sound!%n", name);
    }
}
