package homework4;

import homework4.warriors.Warrior;

public class Battle {
    private Warrior w1;
    private Warrior w2;

    public Battle(Warrior w1, Warrior w2) {
        this.w1 = w1;
        this.w2 = w2;
    }

    public void fight(){
        while (w1.gethealthPoint() > 0 && w2.gethealthPoint() > 0){
            int damage1 = w1.hit();
            System.out.println("first hit second: " + damage1);
            w2.rediceHealth(damage1);
            int damage2 = w2.hit();
            System.out.println("second hit first: " + damage2);
            w1.rediceHealth(damage2);
            System.out.println(w1);
            System.out.println(w2);
        }
    }
}
