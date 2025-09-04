package secao17.aula189.application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import secao17.aula189.entities.Product;

public class Program {

    public static void main(String[] args) {
       demo1();
       demo2();
    }

    private static void demo1() {
         Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "997711122");

        cookies.remove("email");
        cookies.put("phone", "997711133"); //sobrescreve o valor

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email")); //retorna null se o elmento não existe
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }

    private static void demo2() {
        
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key:  " + stock.containsKey(ps));
    }
}