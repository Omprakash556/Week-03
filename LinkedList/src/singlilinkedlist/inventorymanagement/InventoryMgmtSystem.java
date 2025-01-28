package singlilinkedlist.inventorymanagement;

public class InventoryMgmtSystem {
    public static void main(String[] args) {

        ItemList itemList = new ItemList();
        itemList.addFirst("ParleJee","P01", 12,24.6);
        itemList.addLast("Namkeen", "N02", 6, 30);
        itemList.addAtSpecificPosition("Kaju", "K03", 23,34,2);
        itemList.displayResults();
        System.out.println();

        itemList.calculateTotalPrice();
        itemList.updateQuantity("K03", 67);
        itemList.searchItemBased("K03");
        System.out.println();

        itemList.removeItemIdBased("K03");
        itemList.displayResults();



    }
}
