package homework4.warriors;

import homework4.weapons.meleeWeapon.Melee;
import homework4.weapons.defense.Shield;

public class Infantryman extends Warrior<Melee>{
    public Infantryman(String name, int healthPoint, Melee weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Infantryman %s", super.toString());
    }
}
