package Game;

public class Vampiro extends Enemigo {
    public Vampiro(String name, int healthPoints, int baseDamage) {
        super(name, healthPoints, baseDamage);
    }

    @Override
    public int attack() {
        int damage = super.attack();
        healthPoints += damage / 2;  // Steals life when attacking
        return damage;
    }
}
