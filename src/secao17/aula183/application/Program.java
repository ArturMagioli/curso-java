package secao17.aula183.application;

import secao17.aula183.entities.Client;

public class Program {
    
    public static void main(String[] args) {
        // equals();
        // hash();
        personalizados();
    }

    public static void equals() {

        String a = "Maria";
        String b = "Alex";

        System.out.println(a.equals(b));
    }

    public static void hash() {

        String a = "Maria";
        String b = "Alex";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    public static void personalizados() {
        
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");


        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
