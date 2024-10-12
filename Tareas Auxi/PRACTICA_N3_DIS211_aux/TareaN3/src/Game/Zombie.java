package Game;

public class Zombie extends Enemigo {
    public Zombie(String name, int healthPoints, int baseDamage) {
        super(name, healthPoints, baseDamage);
    }

    @Override
    public int attack() {
        healthPoints += 5;  // Regenerates 5 health points when attacking
        return super.attack();
    }
}
