package Coupon;

public class Item1 extends Product{
    public Item1(String name, Double originalPrice, ProductType productType) {
        super(name, originalPrice, productType);
    }

    @Override
    public double getPrice() {

        return originalPrice;
    }
}
