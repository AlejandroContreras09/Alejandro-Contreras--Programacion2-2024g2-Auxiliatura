package Game;

public class Personaje {
    protected String name;
    protected int level;
    protected int healthPoints;
    protected Inventario inventory;

    public Personaje(String name, int level, int healthPoints) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
        this.inventory = new Inventario();
    }

    public void showStatus() {
        System.out.println(name + " [Level: " + level + ", Health Points: " + healthPoints + "]");
    }

    public void takeDamage(int damage) {
        healthPoints -= damage;
        System.out.println(name + " received " + damage + " damage.");
    }

    public void heal() {
        healthPoints += 20;
        System.out.println(name + " has healed. Current health: " + healthPoints);
    }
}
