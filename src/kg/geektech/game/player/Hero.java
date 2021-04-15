package kg.geektech.game.player;

public abstract class Hero extends GameEntity implements HavingSuperAbility{
    private String nameHero;
    private SuperAbility superAbility;

    public Hero(int health, int damage, SuperAbility superAbility, String nameHero) {
        super(health, damage);
        this.nameHero = nameHero;
        this.superAbility = superAbility;
    }

    public SuperAbility getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(SuperAbility superAbility) {
        this.superAbility = superAbility;
    }

    public String getNameHero() {
        return nameHero;
    }

    public void setNameHero(String nameHero) {
        this.nameHero = nameHero;
    }

}
