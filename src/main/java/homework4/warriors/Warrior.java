package homework4.warriors;

import homework4.weapons.Weapon;

import java.util.Random;
import homework4.weapons.defense.Shield;

public abstract class Warrior<W extends Weapon> {
    private final String name;
    private int healthPoint;
    private W weapon;
    private Shield shield;

    public Warrior(String name, int healthPoint, W weapon, Shield shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public String getName(){
        return name;
    }

    public int gethealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setHealthPoint(int healthPoint){
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon){
        this.weapon = weapon;
    }

    public  int hit(){
        Random rnd = new Random();
        int hitDamage = rnd.nextInt(0, weapon.damage() + 1);

        return hitDamage;
    }

    public void rediceHealth(int damage){
        healthPoint -= damage;
        if (healthPoint <0 ){
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, HealthPoint: %d", name, weapon, healthPoint);
    }
}
