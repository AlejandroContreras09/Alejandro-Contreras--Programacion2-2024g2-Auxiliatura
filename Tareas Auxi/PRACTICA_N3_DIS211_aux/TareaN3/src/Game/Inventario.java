package Game;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<String> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " added to inventory.");
    }

    public void showItems() {
        System.out.println("Inventory: " + items);
    }
}
