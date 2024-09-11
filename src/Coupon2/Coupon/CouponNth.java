package Coupon2.Coupon;

import Coupon2.Enum.CouponType;
import Coupon2.Enum.DeductionType;
import Coupon2.Enum.ProductType;
import Coupon2.Interface.CartItem;
import Coupon2.Product;

import java.util.List;

public class CouponNth extends Coupon {
    ProductType type;
    int count;

    public CouponNth(double discount, ProductType type, int count) {
        super(discount);
        this.type = type;
        this.count = count;
    }

    public ProductType getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    @Override
    public CouponType getCouponType() {
        return CouponType.NTH;
    }

    @Override
    public DeductionType getDeductionType() {
        return DeductionType.Rupees;
    }

    public void process(List<CartItem> items, int currentIndex) {
        int index = 0;
        for (CartItem cartItem : items) {
            if (cartItem.isCoupon()) {
                continue;
            }
            Product product = (Product) cartItem;
            CouponNth couponNth = (CouponNth) this;
            if (product.getProductType() == couponNth.getType()) {
                index++;
                if (index == couponNth.getCount()) {
                    product.applyCoupons(this);
                    break;
                }
            }
        }
    }
}
