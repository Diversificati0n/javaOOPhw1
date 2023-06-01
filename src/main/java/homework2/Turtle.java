package homework2;

class Turtle extends Animal implements Swimmable {
    public Turtle(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Черепаха молчит как рыба");
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Turtle: %s, SwimSpeed: %d", super.toString(), getSwimSpeed());
    }
}