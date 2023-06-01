package Seminar1;

import java.util.ArrayList;
import java.util.List;


// содержащий в себе методы initProducts (List <Product>)
// сохраняющий в себе список исходных продуктов и getProduct(String name)


public abstract class Vending {

    private final List<Product> list;

    public Vending() {
        list = new ArrayList<>();
    }

    void addProduct(Product product) {
        list.add(product);
    }

    Product getProduct(String sort) {
        for (Product product : list) {
            if (sort.equals(product.getSort())) {
                return product;
            }
        }
        return null;
    }

    Product getProduct(Long id) {
        for (Product product : list) {
            if (id.equals(product.getId())) {
                return product;
            }
        }
        return null;
    }


}
