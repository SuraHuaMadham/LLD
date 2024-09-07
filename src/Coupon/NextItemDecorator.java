package Coupon;

import java.util.List;

public class NextItemDecorator extends DecoratorCoupon{
    List<Product> product1;
    Product product;
    int discount;

    public NextItemDecorator(List<Product> product1, Product product, int discount) {
        this.product1 = product1;
        this.product = product;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        if(product1.size()>3){
            System.out.println(product1.size());
            double price = product.getPrice();
            return price - ((price * discount)/100);
        }
        return product.getPrice();
    }
}

