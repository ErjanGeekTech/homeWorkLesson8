package kg.geektech.game.player;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero{
    public Berserk(int health, int damage,String nameHero) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT,nameHero);
    }

    @Override
    public void appleSuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i] == this && heroes[i].getHealth() >0){
                boss.setHealth(boss.getHealth() - (heroes[i].getDamage() + boss.getDamage() / 2));
                System.out.println("Berserk took "+(heroes[i].getDamage() + boss.getDamage() / 2) +" from the boss");
                break;
            }
        }
    }
}
