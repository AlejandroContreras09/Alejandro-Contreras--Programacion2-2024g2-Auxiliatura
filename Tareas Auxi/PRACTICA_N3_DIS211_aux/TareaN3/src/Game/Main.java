package Game;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Creating characters
        Mago mage = new Mago("Gandalf", random.nextInt(10) + 1, 100, 50);
        Guerrero warrior = new Guerrero("Conan", random.nextInt(10) + 1, 100, 70);

        // Battle between mage and warrior
        while (mage.healthPoints > 0 && warrior.healthPoints > 0) {
            // Mage attacks
            mage.castSpell();
            warrior.takeDamage(random.nextInt(11) + 10);
            warrior.showStatus();

            // Warrior attacks
            warrior.attack();
            mage.takeDamage(random.nextInt(11) + 10);
            mage.showStatus();

            System.out.println("-----------------------------------");

            // Check if anyone has died
            if (mage.healthPoints <= 0) {
                System.out.println("The mage has fallen. The warrior wins.");
                break;
            } else if (warrior.healthPoints <= 0) {
                System.out.println("The warrior has fallen. The mage wins.");
                break;
            }
        }

        // Creating enemies
        Zombie zombie = new Zombie("Zombie", 50, 15);
        Vampiro vampire = new Vampiro("Vampire", 60, 20);
        Jefe boss = new Jefe("Dragon", 200, 30, 2.5);

        // Interaction with enemies
        boss.speak();
       

        System.out.println("The boss has received critical attacks but still stands!");
    }
}


