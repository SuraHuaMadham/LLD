package Coupon;

public class PercentageDecorator extends  DecoratorCoupon{
    Product product;
    int discount;
    ProductType productType;

    public PercentageDecorator(Product product, int discount, ProductType productType) {
        this.product = product;
        this.discount = discount;
        this.productType = productType;
    }

    @Override
    public double getPrice() {
        if(ProductType.Iphone.equals(productType)){
            return product.getPrice();
        }
        double price = product.getPrice();
        return price - ((price * discount)/100);
    }
}
