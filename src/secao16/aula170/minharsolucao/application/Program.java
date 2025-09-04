package secao16.aula170.minharsolucao.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import secao16.aula170.minharsolucao.model.entities.Contract;
import secao16.aula170.minharsolucao.model.services.ContractService;
import secao16.aula170.minharsolucao.model.services.PicPayService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double valueToPay = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int quantityInstallments = sc.nextInt();

        Contract contract = new Contract(number, date, valueToPay);

        ContractService contractService = new ContractService(new PicPayService());

        contractService.processContract(contract, quantityInstallments);
        
        System.out.println("Parcelas: ");
        System.out.println(contract.printInstallments());
        sc.close();
    }
}
