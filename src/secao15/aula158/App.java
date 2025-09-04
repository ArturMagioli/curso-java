package secao15.aula158;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\Users\\artur\\Code\\Curso-java\\src\\secao15\\aula158\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))){
            for (String line : lines) {
                bw.write(line); //Sem quebra de linha. Necessário um newline
                bw.newLine();
            }
        }
        catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}