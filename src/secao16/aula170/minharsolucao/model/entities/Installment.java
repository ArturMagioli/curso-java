package secao16.aula170.minharsolucao.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate payDate;
    private Double valueToPay;

    public Installment() {

    }

    public Installment(LocalDate payDate, Double valueToPay) {
        this.payDate = payDate;
        this.valueToPay = valueToPay;
    }

    public LocalDate getPayDate() {
        return payDate;
    }

    public void setPayDate(LocalDate payDate) {
        this.payDate = payDate;
    }

    public Double getValueToPay() {
        return valueToPay;
    }

    public void setValueToPay(Double valueToPay) {
        this.valueToPay = valueToPay;
    }
    
    @Override
    public String toString() {
        return this.payDate.format(fmt) + " - " + String.format("%.2f", this.valueToPay);
    }
}
