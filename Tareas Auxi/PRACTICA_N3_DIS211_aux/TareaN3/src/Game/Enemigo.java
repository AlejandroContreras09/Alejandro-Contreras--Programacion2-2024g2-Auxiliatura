package Game;

public class Enemigo {
    protected String name;
    protected int healthPoints;
    protected int baseDamage;

    public Enemigo(String name, int healthPoints, int baseDamage) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.baseDamage = baseDamage;
    }

    public int attack() {
        return baseDamage;
    }

    public void takeDamage(int damage) {
        healthPoints -= damage;
    }

    public boolean isAlive() {
        return healthPoints > 0;
    }
}

