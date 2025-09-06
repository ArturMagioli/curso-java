package secao18.aula199.model.services;

import java.util.List;
import java.util.function.Predicate;

import secao18.aula193.entities.Product;

public class ProductService {
    
    public double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product p : list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
