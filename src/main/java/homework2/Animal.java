package homework2;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Name: " + getName();
    }
}
