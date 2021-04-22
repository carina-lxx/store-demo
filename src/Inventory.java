import java.util.HashMap;

public class Inventory {
    public static int[] inventory = new int[6];

    public static void printInventory() {

        System.out.println("Here are the items you have left: \n"
        + "  Apples: " + inventory[1]
        + "\n  Soup: " + inventory[2]
        + "\n  Sharks: " + inventory[3]
        + "\n  Monsters: " + inventory[4]
        + "\n  Champagne: " + inventory[5]
        );
    }
}

