package kg.geektech.game.player;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Magic extends Hero {
    public Magic(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.BOOST, nameHero);
    }

    @Override
    public void appleSuperAbility(Boss boss, Hero[] heroes) {
//        boolean ggg = true;
//        int accidentally = RPG_Game.random.nextInt(10);
//        for (int i = 0; i < heroes.length; i++) {
//            heroes[i].setDamage(heroes[i].getDamage() + accidentally);
//        }
//        System.out.println("Маг увеличивает на " + accidentally);

    }
}
//if ( this.getHealth() > 0) {
//        boss.setHealth(boss.getHealth() - (heroes[i].getDamage() + accidentally));
//        System.out.println("Маг увеличивает на " + (heroes[i].getDamage() + accidentally));
//        }