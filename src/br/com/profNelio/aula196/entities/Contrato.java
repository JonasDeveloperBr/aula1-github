package br.com.profNelio.aula196.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer numberContract;
	private Date dateContract;
	private Double valueContract;
	
	private List<Parcelas> listParcelas = new ArrayList<Parcelas>();
	
	public Contrato(Integer numberContract, Date dateContract, Double valueContract) {
		this.numberContract = numberContract;
		this.dateContract = dateContract;
		this.valueContract = valueContract;
	}

	public Integer getNumberContract() {
		return numberContract;
	}

	public void setNumberContract(Integer numberContract) {
		this.numberContract = numberContract;
	}

	public Date getDateContract() {
		return dateContract;
	}

	public void setDateContract(Date dateContract) {
		this.dateContract = dateContract;
	}

	public Double getValueContract() {
		return valueContract;
	}

	public void setValueContract(Double valueContract) {
		this.valueContract = valueContract;
	}

	public List<Parcelas> getParcelas(){
		return listParcelas;
	}

	public void addParcelas(Parcelas parcelas) {
		listParcelas.add(parcelas);
	}
	
	public void removeInstallment(Parcelas parcelas) {
		listParcelas.remove(parcelas);
	}
}
