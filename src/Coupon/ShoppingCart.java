package Coupon;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productList = new ArrayList<>();

    public ShoppingCart() {
        productList = new ArrayList<>();
    }

    public void addCart(Product product, List<Product> product1){
        //Product discountProduct = new TypeDecorator(new PercentageDecorator(product,10,product.getProductType()),15,product.getProductType());
        //Product discountProduct = new NdiscountDecorator(product1, product,10,2);
        Product discountProduct = new NextItemDecorator(product1, product,10);
        productList.add(discountProduct);

    }

    public int getTotalPrice(){
        int total =0;
        for(Product p : productList){
            total+= (int) p.getPrice();
        }
        return total;
    }
}
