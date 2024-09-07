package Coupon;

import java.util.ArrayList;
import java.util.List;

public class TypeDecorator extends DecoratorCoupon{
    Product product;
    int discount;
    ProductType productType;
    static List<ProductType> eligible = new ArrayList<>();
    static {
        eligible.add(ProductType.Book);
        eligible.add(ProductType.Sports);
    }

    public TypeDecorator(Product product, int discount, ProductType productType) {
        this.product = product;
        this.discount = discount;
        this.productType = productType;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        if (eligible.contains(productType)) {
            return price - ((price * discount) / 100);
        }
        return price;
    }
}
