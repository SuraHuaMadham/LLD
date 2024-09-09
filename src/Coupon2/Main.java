package Coupon2;

import Coupon2.Enum.ProductType;

public class Main {
    public static void main(String args[]){
        Cart cart = new ShoppingCart();
        cart.addItem(new Product(100,"Book"));
        cart.addItem(new CouponNth(10, ProductType.Book, 2));
        cart.addItem(new CouponALL(10));
        cart.addItem(new CouponNext(10));
        cart.addItem(new Product(100,"Book"));
        double finalPrice = cart.checkout();
        System.out.println(finalPrice);
    }
}
