package homework4.weapons.defense;


public class SteelShield implements Shield {
    @Override
    public int defensePower() {
        return 5;
    }

    @Override
    public int damage() {
        return 0;
    }

    @Override
    public String toString() {
        return "Стальной щит";
    }
}