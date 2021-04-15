package kg.geektech.game.player;


import kg.geektech.game.general.RPG_Game;

public class Hacker extends Hero {
    public Hacker(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.TAKE_HEALTH_AWAY, nameHero);
    }

    @Override
    public void appleSuperAbility(Boss boss, Hero[] heroes) {
        int addition;
        int index;
        addition = RPG_Game.random.nextInt(48) + 2;
        index = RPG_Game.random.nextInt(heroes.length);
        boss.setHealth(boss.getHealth() - addition);
        heroes[index].setHealth(heroes[index].getHealth() + addition);
        System.out.println(this.getNameHero() + " added health to " + heroes[index].getNameHero() + " [" + addition + "]");
    }
}
