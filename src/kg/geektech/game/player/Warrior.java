package kg.geektech.game.player;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero{
    public Warrior(int health, int damage,String nameHero) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, nameHero);
    }

    @Override
    public void appleSuperAbility(Boss boss, Hero[] heroes) {
        int coef = RPG_Game.random.nextInt(5) + 2;
        boss.setHealth(boss.getHealth() - coef * this.getDamage());
        System.out.println(this.getNameHero() + " hits critically " + coef * this.getDamage());
    }
}
