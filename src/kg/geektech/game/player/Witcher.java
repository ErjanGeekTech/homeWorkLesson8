package kg.geektech.game.player;

public class Witcher extends Hero {
    public Witcher(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.SAVIOR, nameHero);
    }

    @Override
    public void appleSuperAbility(Boss boss, Hero[] heroes) {
        boolean run = false;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] == this) {
                while (!run) {
                    for (int j = 0; j < heroes.length; j++) {
                        if (heroes[j].getHealth() <= 0) {
                            heroes[j].setHealth(heroes[j].getHealth() + heroes[i].getHealth());
                            heroes[i].setHealth(0);
                            System.out.println("Savior saved: " + heroes[j].getNameHero());
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}
