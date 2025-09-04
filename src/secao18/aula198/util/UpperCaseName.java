package secao18.aula198.util;

import java.util.function.Function;

import secao18.aula193.entities.Product;

public class UpperCaseName implements Function<Product, String> {
    
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
