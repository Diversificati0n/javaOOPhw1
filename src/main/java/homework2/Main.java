package homework2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Fish("Рыбка", 20),
                new Fish("Пиранья", 30),
                new Fish("Рыба", 15),
                new Turtle("Черепаха"),
                new Snake("Змея")
        };

        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Swimmable) {
                Swimmable swimmable = (Swimmable) animal;
                System.out.println(swimmable.toString());
            } else {
                System.out.println(animal.toString());
            }
            System.out.println();
        }
    }
}
