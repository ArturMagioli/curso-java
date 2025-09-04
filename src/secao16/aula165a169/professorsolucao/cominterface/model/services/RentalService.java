package secao16.aula165a169.professorsolucao.cominterface.model.services;

import java.time.Duration;

import secao16.aula165a169.professorsolucao.seminterface.model.entities.CarRental;
import secao16.aula165a169.professorsolucao.seminterface.model.entities.Invoice;

public class RentalService {
    
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = brazilTaxService;
    }

    public void processInvoice(CarRental carRental) {
    
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;
        if (hours <= 12) {
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
