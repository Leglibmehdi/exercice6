package emp;

import java.util.Date;

public class Associe extends Employe {
	public static double ca;
	public double bn;
	public double x;
	public Associe(String m, String n, String p, Date dn, double bn, double x ) {
		super(m, n, p, dn);
		this.bn=bn;
		this.x=x;
	}
public double getSalaire()  {
	salaire = bn*x;
	return salaire;
}
public String toString() {
	return super.toString() + " [ bn = "+ bn + " , x="+ x + "]";
}
}
