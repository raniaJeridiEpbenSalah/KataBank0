package kataBankPackage;

public class Client {
	private String IdClient;
	private String NomClient;
	private String PrenomClient;
	private String AdrClient;
	private String TelClient;
	public Client(String IdClient,String NomClient,String PrenomClient,String AdrClient,String TelClient) {
		// TODO Auto-generated constructor stub
		this.IdClient=IdClient;
		this.NomClient=NomClient;
		this.PrenomClient=PrenomClient;
		this.AdrClient=AdrClient;
		this.TelClient=TelClient;
	}
	public String getIdClient() {
		return IdClient;
	}
	public void setIdClient(String idClient) {
		IdClient = idClient;
	}
	public String getNomClient() {
		return NomClient;
	}
	public void setNomClient(String nomClient) {
		NomClient = nomClient;
	}
	public String getPrenomClient() {
		return PrenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		PrenomClient = prenomClient;
	}
	public String getAdrClient() {
		return AdrClient;
	}
	public void setAdrClient(String adrClient) {
		AdrClient = adrClient;
	}
	public String getTelClient() {
		return TelClient;
	}
	public void setTelClient(String telClient) {
		TelClient = telClient;
	}
	

}
