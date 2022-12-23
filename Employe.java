package emp;
import java.util.Date;
public abstract class Employe {
	double salaire;
    public String m, n, p;
    Date dn ;
    public Employe()  {
    	  
      }
      public Employe(String m, String n, String p, Date dn) {
    	  this.m=m;
    	  this.n=n;
    	  this.p=p;
    	  this.dn = dn;
      }
      public String toString() {
    	  return "Employe [ matricule = " + m + " , nom = " + n + " , prenom = " + p + " dn = " + dn.getYear()  +"]"; 
      }
      public abstract double getSalaire();
}
