package secao18.exercicio2.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import secao18.exercicio2.entities.Employee;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        Double salary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            List<String> emails = list.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .sorted((e1, e2) -> e1.compareTo(e2))
                    .collect(Collectors.toList());

            double sumOfSalary = list.stream()
                    .filter(e -> Character.toUpperCase(e.getName().charAt(0)) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println("Email of people whoe salary is more than 2000.00");
            emails.forEach(e -> System.out.println(e));
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sumOfSalary));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
