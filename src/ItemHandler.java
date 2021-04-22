public class ItemHandler {

    public static void restock() {

        for (int i = 1; i < 6; i++) {
           Inventory.inventory[i] = 100;
        }
    }

        public static void deduct(int idx, int num){
            Inventory.inventory[idx] -= num;
    }
}
