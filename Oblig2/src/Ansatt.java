import java.util.GregorianCalendar;

public class Ansatt extends Kort implements Konstanter {

	private GregorianCalendar tidAnsatt;
	private double timeLonn;

	public Ansatt(String fornavn, String etternavn, int pin,
			GregorianCalendar tidAnsatt, double timeLonn) {
		super(fornavn, etternavn, pin);
		this.tidAnsatt = tidAnsatt;
		this.timeLonn = timeLonn;

	}

	@Override
	public boolean sjekkPin(int pin) {

		GregorianCalendar tidspunkt = new GregorianCalendar();

		int time = tidspunkt.get(GregorianCalendar.HOUR_OF_DAY);
		int dag = tidspunkt.get(GregorianCalendar.DAY_OF_WEEK);

		if (time < 7 || time > 17 || dag == 1 || dag == 7
				&& !super.isSperretKort())
			if (pin == super.getPin())
				return true;
			else
				return false;

		if (!super.isSperretKort())
			return true;

		return false;
	}

	@Override
	public String getNavn() {
		return super.getFornavn() + " " + super.getEtternavn();
	}

	@Override
	public void setNavn(String navn) {
		String[] navnSplittet = navn.split("\\s");
		super.setFornavn(navnSplittet[0]);
		super.setEtternavn(navnSplittet[1]);

	}

	@Override
	public double calculateCredit() {
		return FACTOR * timeLonn;
	}

	@Override
	public double calculateBonus() {
		GregorianCalendar sjekkTid = new GregorianCalendar();
		
		int detteAar = sjekkTid.get(GregorianCalendar.YEAR);
		int ansattAar = tidAnsatt.get(GregorianCalendar.YEAR);
		
		int aarAnsatt = detteAar - ansattAar;
		
		return aarAnsatt * FACTOR;
	}

}