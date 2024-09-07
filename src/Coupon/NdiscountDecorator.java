package Coupon;

import java.util.List;

public class NdiscountDecorator extends DecoratorCoupon{
    List<Product> product1;
    Product product;
    int discount;
    int k;


    public NdiscountDecorator(List<Product> product1,Product product, int discount, int k) {
        this.product1 = product1;
        this.discount = discount;
        this.k = k;
        this.product = product;
    }

    @Override
    public double getPrice() {
        if(product==product1.get(k)){
        double price = product.getPrice();
        return price - ((price * discount)/100);
    }
        return product.getPrice();
    }
}
