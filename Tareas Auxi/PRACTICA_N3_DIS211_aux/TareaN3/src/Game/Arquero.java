package Game;

public class Arquero extends Personaje {
    private int dexterity;

    public Arquero(String name, int level, int healthPoints, int dexterity) {
        super(name, level, healthPoints);
        this.dexterity = dexterity;
    }

    public void shootArrow() {
        System.out.println(name + " shoots an arrow.");
    }
}
