public class Sales {

    public static double dailyProfit = 0;

    public static void sellItem(Item item, int number) {
        dailyProfit += item.price * number;
        System.out.println("Sold! Your profit is now: " + Sales.dailyProfit);
        Inventory.printInventory();
    }

    public static void cashOut(){
        dailyProfit = 0;
        System.out.println("All cashed out");
    }
}
