package kataBankPackage;
import java.text.DateFormat;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		Client us1=new Client("1","aaaa","bbbb","zzzzzzzzzzz","123");
		Compte cmp1=new Compte("123",100);
		Client us2=new Client("2","cccc","dddd","yyyyyyyyyyy","456");
		Compte cmp2=new Compte("456",200);
		Client us3=new Client("3","eeee","ffff","xxxxxxxxxxx","789");
		Compte cmp3=new Compte("789",300);
		Operation op11=new Operation ("versement",100);
		cmp1.versement(100);
		Operation op21=new Operation ("retrait",100);
		cmp2.retrait(100);
		Operation op31=new Operation ("retrait",100);
		cmp3.retrait(100);
		Operation op32=new Operation ("versement",300);
		cmp3.versement(300);
		System.out.println(us1.getNomClient()+"  "+us1.getPrenomClient()+"  "+cmp1.getNumCompte()+"  "+cmp1.getSoldeCompte());
		System.out.println(us2.getNomClient()+"  "+us2.getPrenomClient()+"  "+cmp2.getNumCompte()+"  "+cmp2.getSoldeCompte());
		System.out.println(us3.getNomClient()+"  "+us3.getPrenomClient()+"  "+cmp3.getNumCompte()+"  "+cmp3.getSoldeCompte());
		//d1=shortDateFormat.format(aujourdhui)
		System.out.println(op31.getTypeOperation()+"  "+op31.getMontant()+"  "+shortDateFormat.format(op31.Aujourdhui));
		System.out.println(op32.getTypeOperation()+"  "+op32.getMontant()+"  "+shortDateFormat.format(op32.Aujourdhui));
	}

}
