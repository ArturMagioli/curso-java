package secao15.aula155;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\artur\\Code\\Curso-java\\src\\secao15\\aula155\\texto.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }catch(IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }finally{
            if (sc != null)
                sc.close();
        }
    }
}
