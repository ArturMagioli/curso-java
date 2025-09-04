package secao15.aula156;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        
        //Podemos aplicar caminhos relativos à raíz do projeto:
        String path = "src\\secao15\\aula156\\texto.txt"; 
        FileReader fr = null;
        BufferedReader br = null;

        try {
            //Aumento da abstração: utilizando uma stream mais básica para
            //instanciar uma stream mais especilizada com esquema de buffer
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        }catch (IOException exception) {
            System.out.println("Error: " + exception.getMessage());
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }catch(IOException exception) {
                System.out.println("Error: " + exception.getMessage());
            }
        }
    }
}
