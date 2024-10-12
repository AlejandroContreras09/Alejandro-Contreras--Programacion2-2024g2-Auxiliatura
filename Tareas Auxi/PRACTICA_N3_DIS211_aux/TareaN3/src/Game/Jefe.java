package Game;

public class Jefe extends Enemigo {
    private double damageMultiplier;

    public Jefe(String name, int healthPoints, int baseDamage, double damageMultiplier) {
        super(name, healthPoints, baseDamage);
        this.damageMultiplier = damageMultiplier;
    }

    public void speak() {
        System.out.println(name + " says: 'I will destroy you, insignificant human!'");
    }

    public int criticalAttack() {
        return (int) (baseDamage * damageMultiplier);
    }
}
