package secao15.aula159;

import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        //path pode representar o caminho de arquivos e diretórios
        File path = new File(strPath);

        //Obtendo uma lista de diretórios:
        File[] folders = path.listFiles(File::isDirectory);
        //Tópico acima: predicados e expressões lambda
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        //obtendo os arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for(File file : files) {
            System.out.println(file);
        }

        //Criando um subdiretório:
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        sc.close();
    }
}
