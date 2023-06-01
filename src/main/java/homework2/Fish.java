package homework2;

class Fish extends Animal implements Swimmable {
    private int swimSpeed;

    public Fish(String name, int swimSpeed) {
        super(name);
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void makeSound() {
        System.out.println("Рыба молчит");
    }

    @Override
    public int getSwimSpeed() {
        return swimSpeed;
    }

    @Override
    public String toString() {
        return String.format("Fish: %s, SwimSpeed: %d", super.toString(), getSwimSpeed());
    }
}
