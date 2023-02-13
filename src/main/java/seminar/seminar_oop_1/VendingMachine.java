package seminar.seminar_oop_1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();
    private Double money = 0.0;


    public List<Product> getProducts() {
        return products;
    }

    public VendingMachine addProduct(Product product){
        this.products.add(product);
        return this;
    }

    public Double getMoney() {
        return money;
    }

    public Product findProduct(String name){
        for (Product product : getProducts()) {
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    public Product buy(String name, Double price){
        Product findingProduct = findProduct(name);
        if (findingProduct == null){
            return null;
        }
        if (findingProduct.getPrice().equals(price)){
                products.remove(findingProduct);
                money+=price;
                return findingProduct;
        }
        System.out.println("price is wrong");
        return null;

    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Product prod : products) {
            sb.append(prod).append("\n");
        }
        sb.append("money in VendingMachine = " + money);
        sb.append("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        return sb.toString();
    }
}
