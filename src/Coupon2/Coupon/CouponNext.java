package Coupon2.Coupon;

import Coupon2.Enum.CouponType;
import Coupon2.Enum.DeductionType;
import Coupon2.Interface.CartItem;
import Coupon2.Product;

import java.util.List;

public class CouponNext extends Coupon {
    public CouponNext(double discount) {
        super(discount);
    }

    @Override
    public CouponType getCouponType() {
        return CouponType.NEXT;
    }

    @Override
    public DeductionType getDeductionType() {
        return DeductionType.Rupees;
    }

    @Override
    public void process(List<CartItem> cartItems, int currentIndex) {
       for(int i = currentIndex+1;i<cartItems.size();i++){
           if(!cartItems.get(i).isCoupon()){
               Product p = (Product) cartItems.get(i);
               p.applyCoupons(this);
           }
       }

    }
}
