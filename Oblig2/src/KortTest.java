import java.util.ArrayList;
import java.util.GregorianCalendar;

public class KortTest {
	public static void main(String[] args) {

		ArrayList<Kort> reg = new ArrayList<Kort>();

		Kort k1 = new Ansatt("Ole", "Olsen", 1234, new GregorianCalendar(2004, 9, 18), 234.67);
		Kort k2 = new Gjest("Marit", "Olsen");
		reg.add(k1);
		reg.add(k2);
		for (int i = 0; i < reg.size(); i++) {
			Kort kort = (Kort) reg.get(i);
			System.out.print(kort);
			System.out.println("\nTest av kort: med kode 1234 er" + (kort.sjekkPin(1234) ? " gyldig" : " ugyldig"));
			System.out.println("Test av kort: med kode 9999 er" + (kort.sjekkPin(9999) ? " gyldig\n" : " ugyldig\n"));
		}

		Ansatt a1 = (Ansatt) k1;

		System.out.println("Bonus er " + a1.calculateBonus());
		System.out.println("Kreditt er " + a1.calculateCredit());

		a1.setNavn("Mikael Sundby");
		System.out.println(a1);
	}
}