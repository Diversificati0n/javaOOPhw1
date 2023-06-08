package homework4;

import homework4.warriors.Archer;
import homework4.warriors.Warrior;
import homework4.weapons.defense.Shield;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {

    List<T> team = new ArrayList<>();

    public void add(T element) {
        team.add(element);
    }

    public Shield getMinimumShield() {
        if (team.isEmpty()) {
            return null;
        }

        Shield minimumShield = team.get(0).getShield();
        for (T warrior : team) {
            Shield currentShield = warrior.getShield();
            if (currentShield.defensePower() < minimumShield.defensePower()) {
                minimumShield = currentShield;
            }
        }
        return minimumShield;
    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }

    public int getTeamHealth() {
        int teamHealth = 0;
        for (T t : this) {
            teamHealth += t.gethealthPoint();
        }
        return teamHealth;
    }

    public int maxAttackDistance() {
        int maxDistance = 0;
        for (T t : this) {
            if (!(t instanceof Archer)) {
                continue;
            }
            int currentDistance = ((Archer) t).distance();
            if (maxDistance < currentDistance) {
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }

    public int getTeamAttack() {
        int teamAttack = 0;
        for (T t : this) {
            teamAttack += t.getWeapon().damage();
        }
        return teamAttack;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t : this) {
            builder.append(t).append("\n");
        }
        builder.append(String.format("TeamAttack: %d ", getTeamAttack()));
        builder.append(String.format("TeamAttack: %d ", getTeamHealth()));
        builder.append(String.format("TeamAttack: %d ", maxAttackDistance()));
        return builder.toString();
    }
}
