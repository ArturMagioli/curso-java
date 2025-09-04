package secao16.aula170.minharsolucao.model.services;

import java.time.LocalDate;

import secao16.aula170.minharsolucao.model.entities.Contract;
import secao16.aula170.minharsolucao.model.entities.Installment;

public class ContractService {

    private PayService payService;

    public ContractService(PayService payService) {
        this.payService = payService;
    }

    public void processContract(Contract contract, int quantityInstallments) {
        double valuePerInstallment = contract.getValue() / quantityInstallments;
        for (int i = 1; i <= quantityInstallments; i++) {
            double finalValue = payService.applyInterestAndTax(valuePerInstallment, i);
            LocalDate payDate = contract.getDate().plusMonths(i);
            contract.addInstallment(new Installment(payDate, finalValue));
        }
    }
}
