package Coupon2;

import Coupon2.Enum.CouponType;
import Coupon2.Enum.DeductionType;

import java.util.List;

public class CouponALL extends Coupon {
    public CouponALL(double discount) {
        super(discount);
    }

    @Override
    public CouponType getCouponType() {
        return CouponType.ALL;
    }

    @Override
    public DeductionType getDeductionType() {
        return DeductionType.Rupees;
    }

    @Override
    public void process(List<CartItem> cartItems, int currentIndex) {
        for(CartItem items : cartItems){
            if(items.isCoupon()){
                continue;
            }
            Product p = (Product) items;
            p.applyCoupons(this);
        }

    }
}
