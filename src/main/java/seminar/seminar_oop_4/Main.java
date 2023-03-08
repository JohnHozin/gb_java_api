package seminar.seminar_oop_4;

public class Main {
    public static void main(String[] args) {
        Team<Footman> squadF = new Team<>();
        squadF.add(new Footman(55, "joe", new Melee("spear", 15)));
        squadF.add(new Footman(55, "moe", new Melee("sword", 10)));
        squadF.add(new Footman(55, "doe", new Melee("axe", 20)));

        for (Footman item : squadF) {
            System.out.println(item);
        }
        System.out.println(squadF.getTeamHealth());
        System.out.println(squadF.getMaxRange());
        System.out.println(squadF.getSumDamage());

        System.out.println("~~~~~~~~~~~~~~~~~");

        Team<BaseHero> squadA = new Team<>();
        squadA.add(new Footman(15, "jonatan", new Melee("crossbow", 15)));
        squadA.add(new Footman(15, "jonatan", new Melee("crossbow", 15)));
        squadA.add(new Archer(25, "john", new Ranged("bow", 30, 15)));
        squadA.add(new Archer(25, "john", new Ranged("bow", 30, 15)));

        for (BaseHero item : squadA) {
            System.out.println(item);
        }

        System.out.println(squadA.getTeamHealth());
        System.out.println(squadA.getMaxRange());
        System.out.println(squadA.getSumDamage());

        System.out.println("~~~~~~~~~~~~~~~~~");

//        Footman footman1 = new Footman(80,"marks", new Melee("book",15));
        Footman footman1 = new Footman(80, "marks", new Melee("book", 15), new HardShield("ironShield", 550));
        Footman footman2 = new Footman(100, "adamS", new Melee("weights", 45));

        while (footman1.getHealth() > 0 && footman2.getHealth() > 0) {
            footman1.hit(footman2);
            System.out.println(footman2);
            footman2.hit(footman1);
            System.out.println(footman1);
        }
        if (footman1.getHealth() > 0) {
            System.out.println("Победил " + footman1.getName());
        } else {
            System.out.println("Победил " + footman2.getName());
        }

        System.out.println("~~~~~~~~~~~~~~~~~");

        Team<Footman> squadB = new Team<>();
        squadB.add(new Footman(12, "ivan", new Melee("sword", 30), new SimpleShield("door")));
        squadB.add(new Footman(12, "ivan", new Melee("sword", 30), new SimpleShield("door")));
        squadB.add(new Footman(80, "marks", new Melee("book", 15), new HardShield("ironShield", 550)));
        squadB.add(new Footman(100, "adamS", new Melee("weights", 45)));

        System.out.println(squadB.getWeakShield());

    }
}
