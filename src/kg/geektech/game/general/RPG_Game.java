package kg.geektech.game.general;

import kg.geektech.game.player.*;

import java.util.Random;

public class RPG_Game {

    public static Random random = new Random();


    public static void start() {
        Boss boss = new Boss(1600, 50);

        Warrior warrior = new Warrior(250, 15, "Aslan warrior");
        Medic doc = new Medic(230, 10, 15, "Adil doc");
        Magic magic = new Magic(250, 25, "Ulukbek magic");
        Berserk berserk = new Berserk(270, 20, "Erjan berserk");
        Medic assistant = new Medic(250, 15, 5, "Alymbek assistant");
        TrickyBastard bastard = new TrickyBastard(200, 10, "Bastard");
        Witcher savior = new Witcher(230, 0, "Savior");
        Hacker hacker = new Hacker(240, 10, "Hacker");

        Hero[] heroes = {warrior, doc, magic, berserk, assistant, bastard, savior, hacker};
        printStatistics(boss, heroes);

        while (!isGameFinished(boss, heroes)) {
            round(boss, heroes);
        }
    }

    private static void round(Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0) {
            bossHits(boss, heroes);
        }
        heroesHits(boss, heroes);
        heroesApplySuperPower(boss, heroes);
        printStatistics(boss, heroes);

    }

    private static void bossHits(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                if (heroes[i].getSuperAbility() == SuperAbility.PRETENDER) {
                    heroes[i].appleSuperAbility(boss, heroes);
                } else {
                    heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());
                }
            }
        }
    }

    private static void heroesHits(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() > 0) {
                boss.setHealth(boss.getHealth() - heroes[i].getDamage());
            }
        }
    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }

        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("_______________");
        System.out.println("Boss health: " + boss.getHealth() + " [" + boss.getDamage() + "]");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getNameHero() + " health: " + heroes[i].getHealth() + " [" + heroes[i].getDamage() + "]");
        }
    }

    private static void heroesApplySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0 && heroes[i].getHealth() > 0) {
                heroes[i].appleSuperAbility(boss, heroes);
            }
        }
    }
}
