package homework2;

class Snake extends Animal implements Swimmable{
    public Snake(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Змея шипит");
    }

    @Override
    public int getSwimSpeed() {
        return 40;
    }

    @Override
    public String toString() {
        return String.format("Snake: %s, SwimSpeed: %d", super.toString(), getSwimSpeed());
    }
}
