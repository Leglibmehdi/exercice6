package emp;
import java.util.Date;
public class te {
	public static void main(String[] args) {
    Date dn = new Date(2000,4,7);
    Date de = new Date ( 2017, 5,9);
    Ouvrier o = new Ouvrier("A233445", "simo", "ett",dn, de);
    Cadre c = new Cadre("A233445", "simo", "ett",dn, 3 );
    Associe a = new Associe("A233445", "simo", "ett",dn, 2344, 12);
    Ouvrier o1 = new Ouvrier("A23345", "sio", "ett",dn, de);
    System.out.println(o.toString() + " smig = " + Ouvrier.smig );
    System.out.println(o1.toString() + " smig =  " + Ouvrier.smig  );
    
	}

}
