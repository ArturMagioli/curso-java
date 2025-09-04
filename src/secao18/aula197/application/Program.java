package secao18.aula197.application;

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

        double factor = 1.1;
        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
