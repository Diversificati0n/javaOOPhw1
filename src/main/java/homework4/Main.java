package homework4;

import homework4.warriors.Archer;
import homework4.warriors.Warrior;
import homework4.warriors.Infantryman;
import homework4.weapons.defense.SteelShield;
import homework4.weapons.defense.WoodenShield;
import homework4.weapons.meleeWeapon.Axe;
import homework4.weapons.meleeWeapon.Sword;
import homework4.weapons.rangedWeapon.Bow;
import homework4.weapons.rangedWeapon.CrossBow;

public class Main {
    public static void main(String[] args) {

        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow(), new SteelShield()));
        team1.add(new Infantryman("John", 150, new Axe(), new WoodenShield()));


        Team<Archer> teamArchears = new Team<>();
        teamArchears.add(new Archer("Jimmy", 100, new CrossBow(), new WoodenShield()));
        teamArchears.add(new Archer("Piter", 100, new Bow(), new SteelShield()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword(), null));

        System.out.println(team1);
        System.out.println("________________________________________________");
        System.out.println(teamArchears);
        System.out.println("_________________________________________________");
        System.out.println(teamInfantryman);

        Battle battle1 = new Battle(new Infantryman("John", 150,new Axe(), new WoodenShield()), (new Archer("Robin", 100, new Bow(), new SteelShield())));

        battle1.fight();
    }
}
