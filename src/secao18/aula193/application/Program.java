package secao18.aula193.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import secao18.aula193.entities.Product;

public class Program {

    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));

        //primeira forma:
        // list.sort(new MyComparator());

        //segunda forma: classe anônima
        // Comparator<Product> comp = new Comparator<Product>() {
        //     @Override
        //     public int compare(Product p1, Product p2) {
        //         return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        //     }
        // };

        //terceira forma: função anônima (arrow function)
        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        list.sort(comp);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}