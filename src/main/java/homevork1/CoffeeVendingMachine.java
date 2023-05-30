package homevork1;

class CoffeeVendingMachine {
    private Beverage[] beverages;

    public CoffeeVendingMachine(Beverage[] beverages) {
        this.beverages = beverages;
    }

    public void displayAvailableBeverages() {
        System.out.println("Доступные напитки:");
        for (Beverage beverage : beverages) {
            System.out.println(beverage.getName() + " - Цена: " + beverage.getPrice() + " руб.");
        }
    }

    public void sellBeverage(String beverageName) {
        Beverage selectedBeverage = null;
        for (Beverage beverage : beverages) {
            if (beverage.getName().equalsIgnoreCase(beverageName)) {
                selectedBeverage = beverage;
                break;
            }
        }

        if (selectedBeverage != null) {
            System.out.println("Продан напиток: " + selectedBeverage.getName());
        } else {
            System.out.println("Напиток с именем " + beverageName + " не найден.");
        }
    }
}
