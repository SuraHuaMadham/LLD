package Coupon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){
        Product item1 = new Item1("Java",100.0,ProductType.Book);
        Product item2 = new Item2("Football",100.0,ProductType.Sports);
        Product item3 = new Item3("Iphone",200.0,ProductType.Iphone);

        ShoppingCart shoppingCart = new ShoppingCart();
        List<Product> product1 = new ArrayList<>();
        product1.add(item1);
        product1.add(item2);
        product1.add(item3);

        shoppingCart.addCart(item1,product1);
        shoppingCart.addCart(item2,product1);
        shoppingCart.addCart(item3,product1);

        //System.out.println("Cart value after not applying coupons are - " +shoppingCart.getTotalPrice());

        product1.add(item2);
        shoppingCart.addCart(item2,product1);

        System.out.println("Cart value after applying coupons on next item are - " +shoppingCart.getTotalPrice());

    }
}
