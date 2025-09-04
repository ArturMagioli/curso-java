package secao16.aula170.minharsolucao.model.services;

public interface PayService {

    //Má prática: melhor manter dois métodos separados ao invés de um só
    public double applyInterestAndTax(double amount, int month);
}
