package Coupon2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Cart{
    List<CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    @Override
    public void addItem(CartItem item) {
        this.items.add(item);
    }

    @Override
    public double checkout() {
        double finalA = 0d;
        applyAllCoupons();

        for (CartItem item: items){
            if(item.isCoupon()){
                continue;
            }
            Product p = (Product) item;
            finalA+= p.getDiscountedPrice();
        }
        return finalA;
    }

    private void applyAllCoupons() {
        int index =0;
        for(CartItem item:items){
            if(!item.isCoupon()){
                index++;
                continue;
            }
            Coupon c = (Coupon) item;
            c.applyToProduct(items,index);
            index++;
        }
    }
}
