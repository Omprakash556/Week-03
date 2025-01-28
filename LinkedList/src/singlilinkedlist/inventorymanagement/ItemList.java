package singlilinkedlist.inventorymanagement;

public class ItemList {
    Item head;

    public ItemList(){

        head = null;
    }

    public void addFirst(String itemName, String itemID, int quantity, double price){
        Item newNode = new Item(itemName, itemID, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String itemName, String itemID, int quantity, double price){
        Item newNode = new Item(itemName, itemID, quantity, price);
        if (head == null){
            head = newNode;
            return;
        }else {
            Item current = head;
            while (current.next != null){
                    current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addAtSpecificPosition(String itemName, String itemID, int quantity, double price, int position){
        Item newNode = new Item(itemName, itemID, quantity, price);
        Item current = head;
        int index = 1;
        if (position == 1){
            addFirst(itemName, itemID, quantity, price);
            return;
        }
            while (current != null && index < position - 1){
                current = current.next;
                index++;
            }
        if(current == null){
                System.out.println("Invalid position ");
                return;
            }
        //Item forward = current.next;
        newNode.next = current.next;
        current.next = newNode;
        }


        public void removeItemIdBased(String itemID){
            if (head == null){
                System.out.println("LL is empty: ");
                return;
            }
            if (head.itemID == itemID){
                head = head.next;
                return;
            }
            Item current = head;
            while (current != null && current.itemID != itemID){
                current = current.next;
            }
            if (current == null){
                System.out.println("This item id is not present in inventory. ");
                return;
            }
            current.next = current.next.next;
        }
        public void updateQuantity(String productID, int newQuantity){
        Item current = head;
        while (current != null && current.itemID!=productID){
            current = current.next;
        }
        if(current == null){
            System.out.println("Item id is invalid: ");
            return;
        }
        current.quantity = newQuantity;
            System.out.println("Item ID: "+current.itemID+" for new quantity: "+newQuantity);
        }

        public void searchItemBased(String itemID){
            Item current = head;
            while (current != null && current.itemID != itemID){
                current = current.next;
            }
            if(current == null ){
                System.out.println("Item not present: ");
            }else {
                System.out.println("Item present: ");
            }
        }

        public void calculateTotalPrice(){
            Item current = head;
            double totalPrice = 0;
            while (current != null){
                totalPrice += current.price * current.quantity;
                current = current.next;
            }
            System.out.println("Total Inventory Price: "+totalPrice);
        }

        public void displayResults(){
            if (head == null){
                System.out.println("LL is empty: ");
                return;
            }
            Item current = head;
            while (current != null){
                System.out.println("Item Name: "+current.itemName+" Item ID: "+current.itemID+" Quantity: "+current.quantity+" Price: "+current.price);
                current = current.next;
            }
        }

    private Item SortedMerge(Item a, Item b, boolean byName) {
        Item dummy = new Item("", "", 0, 0);
        Item current = dummy;

        while (a != null && b != null) {
            if ((byName && a.itemName.compareTo(b.itemName) <= 0) || (!byName && a.price <= b.price)) {
                current.next = a;
                a = a.next;
            } else {
                current.next = b;
                b = b.next;
            }
            current = current.next;
        }

        if (a != null) {
            current.next = a;
        } else {
            current.next = b;
        }

        return dummy.next;
    }

}
