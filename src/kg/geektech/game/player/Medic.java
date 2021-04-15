package kg.geektech.game.player;

public class Medic extends Hero{
    private int healPoints;

    public Medic(int health, int damage, int healPoints,String nameHero) {
        super(health, damage, SuperAbility.HEAL,nameHero);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void appleSuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && heroes[i] != this){
                heroes[i].setHealth(heroes[i].getHealth() + healPoints);
            }
        }
    }
}
