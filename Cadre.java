package emp;

import java.util.Date;

public class Cadre extends Employe{
int i;
public Cadre(String m, String n, String p, Date dn, int i) {
	super(m,n,p,dn);
	this.i = i;	
}


public double getSalaire() {
	switch (i) {
	  case 1 :  salaire = 12000;
	  break;
	  case 2 :  salaire = 14000;
	  break;
	 case 3 :  salaire = 16000;
      break;               
	  case 4 :  salaire = 18000;
      break;                 
	 default : System.out.println("indice incorrect");
	}
	return salaire;
}
public String toString() {
	return super.toString()+ " indice = " + i; 
}

}
