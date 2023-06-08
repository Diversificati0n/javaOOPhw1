package homework4.weapons.defense;

public class WoodenShield implements Shield {
    @Override
    public int defensePower() {
        return 3;
    }

    @Override
    public int damage() {
        return 0;
    }

    @Override
    public String toString() {
        return "Деревянный щит";
    }
}
