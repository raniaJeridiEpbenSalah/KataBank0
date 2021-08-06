package kataBankPackage;

import java.util.Date;

public class Operation {
	private String TypeOperation;
	private double Montant;
	Date Aujourdhui ;
	public Operation(String TypeOperation,double Montant) {
		// TODO Auto-generated constructor stub
		this.setTypeOperation(TypeOperation);
		this.setMontant(Montant);
		this.Aujourdhui=new Date();
	}
	public String getTypeOperation() {
		return TypeOperation;
	}
	public void setTypeOperation(String typeOperation) {
		TypeOperation = typeOperation;
	}
	public double getMontant() {
		return Montant;
	}
	public void setMontant(double montant) {
		Montant = montant;
	}
}
