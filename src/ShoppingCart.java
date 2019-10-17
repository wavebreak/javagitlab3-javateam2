import java.util.ArrayList;

public class ShoppingCart {

    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase> ();


    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2016";
    }

    public ShoppingCart(String name, String date) {
        customerName = name;
        currentDate = date;
    }

    public String getCustomerName()  {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }

    public void addItem(ItemToPurchase item) {
        cartItems.add(item);
    }

    public void removeItem(String name) {

    }

    public void modifyItem(ItemToPurchase item) {

    }

    public int getNumItemsInCart() {
        int countItems = 0;
        for(ItemToPurchase it: cartItems) {
            countItems += it.getQuantity() ;
        }
        return countItems;
    }

    public int getCostOfCart() {
        int totalCostCart = 0;
        for (ItemToPurchase it : cartItems) {
            totalCostCart += it.getQuantity() * it.getPrice();
        }
        return totalCostCart;
    }

    public void printTotal() {
        int i = 0;
        int totalCost = 0;

        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println("Number of Items: " + getNumItemsInCart());
        System.out.println("");

        if (cartItems.size() > 0) {
            for (i = 0; i < cartItems.size(); ++i) {
                cartItems.get(i).printItemCost();
            }
        }
        else {
            System.out.println("SHOPPING CART IS EMPTY");
        }

        totalCost = getCostOfCart();
        System.out.println("");
        System.out.println("Total: $" + totalCost);
    }

    public void printDescriptions() {
        int i = 0;

        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println("");
        System.out.println("Item Descriptions");

        if(cartItems.size() > 0) {
            for(i = 0; i < cartItems.size(); ++i) {
                cartItems.get(i).printItemDescription();
            }
        }
        else {
            System.out.println("SHOPPING CART IS EMPTY");
        }
    }
}
