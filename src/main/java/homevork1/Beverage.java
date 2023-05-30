package homevork1;

class Beverage {
    private String name;
    private int volume;
    private int temperature;
    private double price;

    public Beverage(String name, int volume, int temperature, double price) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public double getPrice() {
        return price;
    }
}
