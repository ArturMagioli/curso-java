package secao18.aula198.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import secao18.aula193.entities.Product;

public class Program {
    
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("HD Case", 80.90));
        list.add(new Product("Tablet", 350.50));

        //instância da implementação da interface:
        // List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        //estaticamente
        // List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //referência do método não estático
        // List<String> names = list.stream().map(Product::nonstaticUpperCaseName).collect(Collectors.toList());

        //expressão lambda declarada
        // Function<Product, String> upperCaseName = p -> p.getName().toUpperCase();
        // List<String> names = list.stream().map(upperCaseName).collect(Collectors.toList());

        //expressão lambda inline
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        for (String s : names) {
            System.out.println(s);
        }
    }
}
