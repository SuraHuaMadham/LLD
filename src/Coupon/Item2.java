package Coupon;

public class Item2 extends Product{
    public Item2(String name, Double originalPrice, ProductType productType) {
        super(name, originalPrice, productType);
    }

    @Override
    public double getPrice() {

        return originalPrice;
    }
}
