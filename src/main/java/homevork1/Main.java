package homevork1;

public class Main {
    public static void main(String[] args) {


        Beverage coffee = new Beverage("Кофе", 200, 70, 150.0);
        Beverage tea = new Beverage("Чай", 150, 80, 100.0);
        Beverage hotChocolate = new Beverage("Горячий шоколад", 250, 60, 200.0);

        Beverage[] beverages = {coffee, tea, hotChocolate};
        CoffeeVendingMachine vendingMachine = new CoffeeVendingMachine(beverages);

        vendingMachine.displayAvailableBeverages();

        vendingMachine.sellBeverage("Кофе");
        vendingMachine.sellBeverage("Чай");
        vendingMachine.sellBeverage("Какао");
    }
}