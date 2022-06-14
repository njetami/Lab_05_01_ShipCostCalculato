import javax.swing.*;

public class ShipCostCalculato {
    public static void main(String[] args) {
        double TAX_RATE = 0.0;
        double itemCost = 200;
        double shippingCost;
        double totalPrice;

//       if (itemCost < 100);
        {

//          shippingCost = itemCost * TAX_RATE;
//          totalPrice = itemCost + shippingCost;

//            System.out.println("The shipping cost is " + itemCost + " " + TAX_RATE + " is " + shippingCost);
//            System.out.println("The total price of the item is " + itemCost + " " + shippingCost + " is " + totalPrice);
        }

        if (itemCost >= 100) ;
        {
            shippingCost = itemCost * TAX_RATE;
            totalPrice = itemCost + shippingCost;
            System.out.println("The shipping cost is " + itemCost + " " + TAX_RATE + " is " + shippingCost);
            System.out.println("The total price of the item is " + itemCost + " " + shippingCost + " is " + totalPrice);
        }
    }
}
