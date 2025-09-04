package secao15.exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import secao15.exercicio.entities.Item;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome do arquivo: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = new File(sourceFile.getParent()).getParent();

        boolean success = new File(sourceFolderStr + "\\out").mkdir();
        System.out.println("Arquivo de resposta criado: " + success);

        String targerFileStr = sourceFolderStr + "\\out\\summary.csv";

        List<Item> items = getItemsFromFile(sourceFileStr);
        if(saveItems(items, targerFileStr)) {
            System.out.println("Os items foram salvos com sucesso!");
        }else {
            System.out.println("Falha ao salvar os items.");
        }

        sc.close();
    }

    private static ArrayList<Item> getItemsFromFile(String path) {
        ArrayList<Item> items = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                items.add(getItemFromLine(line));
                line = br.readLine();
            }
            return items;
        }catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    private static Item getItemFromLine(String line) {
        String[] data = line.split(",");
        return new Item(data[0], Double.parseDouble(data[1]), Integer.parseInt(data[2]));
    }

    private static boolean saveItems(List<Item> items, String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (Item i : items) {
                bw.write(i.getScvFormat());
                bw.newLine();
            }
            return true;
        }catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
