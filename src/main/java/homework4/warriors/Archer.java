package homework4.warriors;

import homework4.weapons.rangedWeapon.Ranged;
import homework4.weapons.defense.Shield;

public class Archer extends Warrior<Ranged>{
    public Archer(String name, int healthPoint, Ranged weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
    }

    public int distance(){
        return super.getWeapon().distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d", super.toString(), distance());
    }
}
