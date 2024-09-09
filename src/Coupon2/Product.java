package Coupon2;

import Coupon2.Enum.DeductionType;
import Coupon2.Enum.ProductType;

import java.util.ArrayList;
import java.util.List;

public class Product implements CartItem{
    @Override
    public boolean isCoupon() {
        return false;
    }

    public ProductType productType;
    private double price;
    private List<Coupon> appliedCoupons;

    public Product(double price, String productType) {
        this.appliedCoupons = new ArrayList<>();
        this.productType = ProductType.valueOf(productType);
        this.price = price;
    }

    public void applyCoupons(Coupon coupon){
        appliedCoupons.add(coupon);
    }

    public double getDiscountedPrice(){
        if(appliedCoupons.isEmpty()){
            return this.price;
        }
        double finalP = price;
        for(Coupon c : appliedCoupons){
            if(c.getDeductionType() == DeductionType.Percentage){
                finalP = finalP -(100 - c.getDiscount())/100;
            }else {
                finalP = finalP - c.getDiscount();
            }
        }
        return  finalP;
    }

}
