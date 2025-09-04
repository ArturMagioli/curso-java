package secao16.aula170.minharsolucao.model.services;

public class PicPayService implements PayService{
    
    private final Double interest = 0.01;
    private final Double taxPayment = 0.02;

    @Override
    public double applyInterestAndTax(double amount, int month) {
        return applyTax(applyInterest(amount, month));
    }

    private double applyInterest(double amount, double month) {
        return amount + amount * interest * month;
    }

    private double applyTax(double amount) {
        return amount + amount * taxPayment;
    }
}
