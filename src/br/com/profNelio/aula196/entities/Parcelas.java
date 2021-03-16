package br.com.profNelio.aula196.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.profNelio.aula196.model.exceptions.DomainException;

public class Parcelas {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date dataVencimento;
	private Double amount;
	private Date dataPagamento;
	
	public Parcelas(Date dataVencimento, Double amount) {
		this.dataVencimento = dataVencimento;
		this.amount = amount;//este valor será definido pela classe TaxServicePayment
	}
	
	public void pagamentoParcela(Date dataVencimento, Double amount) throws DomainException {
		if(this.dataPagamento != null) {
			throw new DomainException("Operação não permitida! A parcela já foi paga em " + String.format("%.2f", this.dataPagamento));
		}
		if (!(this.dataVencimento == dataVencimento && this.amount == amount)) {
			throw new DomainException("Data de vencimento ou valor informado são inválidos!");
		}
		this.dataPagamento = new Date();
	}
	
	public Date getDataVencimento() {
		return dataVencimento;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public Date getDataPagamento() {
		return dataPagamento;
	}
	
	@Override
	public String toString() {
		return sdf.format(dataVencimento) + " - " + String.format("%.2f", amount);
	}
}
