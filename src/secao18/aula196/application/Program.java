package secao18.aula196.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import secao18.aula193.entities.Product;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("HD Case", 80.90));
        list.add(new Product("Tablet", 350.50));

        //com static method reference
        // list.removeIf(Product::staticProductPredicate);

        //com non-static method reference
        // list.removeIf(Product::nonStaticProductPredicate);

        //com expressão lambda declarada
        //double min = 100.0;
        // Predicate<Product> pred = p -> p.getPrice() >= min;
        // list.removeIf(pred);
        
        // com lambda inline
        double min = 100.0;
        list.removeIf(p -> p.getPrice() >= min);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
