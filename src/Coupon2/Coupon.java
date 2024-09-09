package Coupon2;

import Coupon2.Enum.CouponType;
import Coupon2.Enum.DeductionType;

import java.util.List;

public abstract class Coupon implements CartItem{
    @Override
    public boolean isCoupon() {
        return true;
    }

    private double discount;

    public Coupon(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public abstract CouponType getCouponType();
    public abstract DeductionType getDeductionType();

    public void applyToProduct(List<CartItem> cartItems, int currentIndex){
        process(cartItems,currentIndex);
    }

    public abstract  void process(List<CartItem> cartItems, int currentIndex);


}
