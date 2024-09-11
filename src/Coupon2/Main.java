package Coupon2;

import Coupon2.Coupon.CouponALL;
import Coupon2.Coupon.CouponNext;
import Coupon2.Coupon.CouponNth;
import Coupon2.Enum.ProductType;
import Coupon2.Interface.Cart;

public class Main {
    public static void main(String [] args){
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
