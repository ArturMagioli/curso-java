package secao15.aula157;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        
        //Podemos aplicar caminhos relativos à raíz do projeto:
        String path = "src\\secao15\\aula157\\texto.txt"; 

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        }catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
