package klassnayadzz;
class Hero {
    String name;
    int health;

    void attack() {
        System.out.println(name + " атакует!");
    }
}


class Warrior extends Hero {
    void heavyAttack() {
        System.out.println(name + " делает мощную атаку!");
    }
}


class Mage extends Hero {
    void castSpell() {
        System.out.println(name + " колдует заклинание!");
    }
}


class Archer extends Hero {
    void shootArrow() {
        System.out.println(name + " стреляет из лука!");
    }
}


public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        Archer archer = new Archer();

        warrior.name = "Торас";
        warrior.health = 100;

        mage.name = "Элиан";
        mage.health = 80;

        archer.name = "Лиара";
        archer.health = 90;


        warrior.attack();
        mage.attack();
        archer.attack();

  
        warrior.heavyAttack();
        mage.castSpell();
        archer.shootArrow();
    }
}