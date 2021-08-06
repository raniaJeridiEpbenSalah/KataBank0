package kataBankPackage;

public class Compte {
	private String NumCompte;
	private double SoldeCompte;
	public Compte(String NumCompte,double SoldeCompte) {
		// TODO Auto-generated constructor stub
		this.NumCompte=NumCompte;
		this.SoldeCompte=SoldeCompte;
	}
	public String getNumCompte() {
		return NumCompte;
	}
	public void setNumCompte(String numCompte) {
		NumCompte = numCompte;
	}
	public double getSoldeCompte() {
		return SoldeCompte;
	}
	public void setSoldeCompte(double soldeCompte) {
		SoldeCompte = soldeCompte;
	}
	public void retrait (double montant)
	
	{
		this.SoldeCompte-=montant;
	}
public void versement (double montant)
	
	{
		this.SoldeCompte+=montant;
	}
}
