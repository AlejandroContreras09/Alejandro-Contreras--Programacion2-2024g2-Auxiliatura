package Game;

public class Mago extends Personaje {
    private int mana;

    public Mago(String name, int level, int healthPoints, int mana) {
        super(name, level, healthPoints);
        this.mana = mana;
    }

    public void castSpell() {
        System.out.println(name + " casts a spell.");
    }
}
