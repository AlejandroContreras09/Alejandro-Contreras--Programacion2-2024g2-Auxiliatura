package Game;

public class Guerrero extends Personaje {
    private int strength;

    public Guerrero(String name, int level, int healthPoints, int strength) {
        super(name, level, healthPoints);
        this.strength = strength;
    }

    public void attack() {
        System.out.println(name + " attacks.");
    }
}
