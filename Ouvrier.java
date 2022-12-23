package emp;
import java.util.Date;
public class Ouvrier extends Employe {
  Date de ;
  public static final double smig = 3000;
  public Ouvrier(String m, String n, String p, Date dn, Date de) {
	  super(m, n, p, dn);
	  this.de = de;
  }
  
	public double getSalaire() {
		Date da = new Date();    	
		salaire = (smig + (da.getYear() - de.getYear()+1900)*100);
       if (salaire <=  smig*2) 
    	   salaire = salaire;
       else salaire = smig*2;
       return salaire;
          }
	public String toString() {
		return super.toString() + "[ date entree: "+ de + " ]";
	}
}
