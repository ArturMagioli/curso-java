package secao16.aula165a169.minhaSolucao;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
        LocalDateTime pickupDate = LocalDateTime.parse(sc.nextLine(), fmt1);
        System.out.print("Return (dd/MM/yyyy hh:ss): ");
        LocalDateTime returnDate = LocalDateTime.parse(sc.nextLine(), fmt1);
        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        double basicPayment = getBasicPayment(pickupDate, returnDate, pricePerHour, pricePerDay);
        double tax = getTax(basicPayment);
        double totalPayment = getTotalPayment(basicPayment, tax);

        System.out.println("INVOICE: " + carModel);
        System.out.println("Basic payment: " + basicPayment);
        System.out.println("Tax: " + tax);
        System.out.println("Total payment: " + totalPayment);

        sc.close();
    }

    private static double getBasicPayment(LocalDateTime pickupDate, LocalDateTime returnDate, double pricePerHour, double pricePerDay) {
        Duration duration = Duration.between(pickupDate, returnDate);
        if (duration.toHours() > 12) 
            return duration.toDays() == duration.toHours() / 24.0 ? duration.toDays() * pricePerDay : (duration.toDays() + 1) * pricePerDay;
        else 
            return duration.toHours() == duration.toMinutes() / 60.0 ? duration.toHours() * pricePerHour : (duration.toHours() + 1) * pricePerHour;
    }

    private static double getTax(double basicPayment) {
        return basicPayment > 100 ? basicPayment * 0.15 : basicPayment * 0.2;
    }

    private static double getTotalPayment(double basicPayment, double tax) {
        return basicPayment + tax;
    }
}