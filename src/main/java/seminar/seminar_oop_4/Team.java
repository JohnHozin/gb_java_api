package seminar.seminar_oop_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends BaseHero> implements Iterable<T> {
    private List<T> warriors = new ArrayList<>();

    public Team(List<T> warriors) {
        this.warriors = warriors;
    }

    public Team() {
    }

    public void add(T value) {
        warriors.add(value);
    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }


    public int getTeamHealth() {
        int teamHealth = 0;
        for (T item : warriors) {
            teamHealth += item.getHealth();
        }
        return teamHealth;
    }

    public int getMaxRange() {
        int maxRange = 0;
        for (T hero : warriors) {
            if (hero instanceof Archer) {
                Archer archer = (Archer) hero;
                if (maxRange < archer.range()) {
                    maxRange = archer.range();
                }
            }
        }
        return maxRange;
    }

    public int getSumDamage() {
        int sumDamage = 0;
        for (T hero : warriors) {
            sumDamage += hero.getWeapon().damage();
        }
        return sumDamage;
    }

    public BaseHero getWeakShield() {
        double weakShield = 0;
        BaseHero baseHero = null;
        for (T item : warriors) {
                if (weakShield < item.shield.defence()) {
                    weakShield = item.shield.defence();
                    baseHero = item;
                }
        }
        return baseHero;
    }
}
