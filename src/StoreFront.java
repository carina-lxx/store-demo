import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class StoreFront {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]) {
        ItemHandler.restock();
        sellPrompt();
    }

    public static void sellPrompt() {

        Item[] inventory = new Item[5];

        Item apple = new Item(1, "apple", 1.50);
        inventory[0] = apple;
        Item soup = new Item(2, "soup", 0.95);
        inventory[1] = soup;
        Item shark = new Item(3, "shark", 120.00);
        inventory[2] = shark;
        Item monster = new Item(4, "monster", 250.00);
        inventory[3] = monster;
        Item champagne = new Item(5, "champagne", 860.00);
        inventory[4] = champagne;

        System.out.println("What would you like to sell today? \n"
                + "1 - Apple\n"
                + "2 - Soup\n"
                + "3 - Shark\n"
                + "4 - Monster\n"
                + "5 - Champagne\n"
                + "6 - to restock all products \n"
                + "7 - cash out the register \n"
                + "9 - No sale - close up shop"
        );

        int operator = scanner.nextInt();

        if (operator == 9) {
            System.out.println("Goodbye, store is closed!");
            System.exit(0);
        } else if (operator == 7) {
            Sales.cashOut();
        }  else if (operator == 6) {
            ItemHandler.restock();
            System.out.println("Store is all stocked up");
            sellPrompt();
        } else {

            System.out.println("And how many will you be selling?");
            int howMany = scanner.nextInt();

            switch (operator) {
                case 1:
                    ItemHandler.deduct(apple.id, howMany);
                    Sales.sellItem(apple, howMany);
                    break;
                case 2:
                    ItemHandler.deduct(soup.id, howMany);
                    Sales.sellItem(soup, howMany);
                    break;
                case 3:
                    ItemHandler.deduct(shark.id, howMany);
                    Sales.sellItem(shark, howMany);
                    break;
                case 4:
                    ItemHandler.deduct(monster.id, howMany);
                    Sales.sellItem(monster, howMany);
                    break;
                case 5:
                    ItemHandler.deduct(champagne.id, howMany);
                    Sales.sellItem(champagne, howMany);
                    break;
                default:
                    System.out.println("I'm sorry, please select a valid entry");
                    sellPrompt();
            }


            sellPrompt();

        }
    }


}



