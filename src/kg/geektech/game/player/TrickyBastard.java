package kg.geektech.game.player;

import kg.geektech.game.general.RPG_Game;

public class TrickyBastard extends Hero {
    public TrickyBastard(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.PRETENDER, nameHero);
    }

    @Override
    public void appleSuperAbility(Boss boss, Hero[] heroes) {
        boolean pretend;
        pretend = RPG_Game.random.nextBoolean();
                if (pretend) {
                    System.out.println("Bastard pretender ");
                } else {
                   this.setHealth(this.getHealth() - boss.getDamage());
                }
    }
}
