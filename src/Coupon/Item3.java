package Coupon;

public class Item3 extends Product{
    public Item3(String name, Double originalPrice, ProductType productType) {
        super(name, originalPrice, productType);
    }

    @Override
    public double getPrice() {

        return originalPrice;
    }
}
