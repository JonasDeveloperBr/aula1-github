package br.com.profNelio.aula196.services;

import java.util.Calendar;
import java.util.Date;

import br.com.profNelio.aula196.entities.Contrato;
import br.com.profNelio.aula196.entities.Parcelas;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contrato contrato, int months) {
		double basicQuota = contrato.getValueContract() / months;
		
		for (int i=1; i <= months; i++) {
			Date date = addMonths(contrato.getDateContract(), i);
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			double fullQuota = updatedQuota  + onlinePaymentService.paymentFee(updatedQuota);
			contrato.addParcelas(new Parcelas(date, fullQuota));
		}
	}
	
	//Entender como foi definido que a parcelas são de 30 em 30 dias
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		System.out.println("Method 'addMonths' - value: " + cal.getTime());
		cal.setTime(date);
		System.out.println("Method 'addMonths' - value: " + cal.getTime());
		cal.add(Calendar.MONTH, n);
		System.out.println("Method 'addMonths' - value: " + cal.getTime());
		return cal.getTime();
	}
}
