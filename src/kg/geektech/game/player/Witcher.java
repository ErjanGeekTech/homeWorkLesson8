package kg.geektech.game.player;

public class Witcher extends Hero {
    public Witcher(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.SAVIOR, nameHero);
    }

    @Override
    public void appleSuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0) {
                heroes[i].setHealth(heroes[i].getHealth() + this.getHealth());
                this.setHealth(0);
                System.out.println("Savior saved: " + heroes[i].getNameHero());
                break;
            }


        }
    }
}
