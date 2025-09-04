package secao16.aula175;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ordenaFuncionarios {
    public static void main(String[] args) {
        
        List<Funcionario> list = new ArrayList<>();
        String path = "C:\\Users\\artur\\Code\\Curso-java\\src\\secao16\\aula176\\funcionarios.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String funcionarioCsv = br.readLine();
            while (funcionarioCsv != null) {
                String[] data = funcionarioCsv.split(",");
                list.add(new Funcionario(data[0], Double.parseDouble(data[1])));
                funcionarioCsv = br.readLine();
            }
            Collections.sort(list);
            for(Funcionario f : list) {
                System.out.println(f);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
