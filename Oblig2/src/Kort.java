public abstract class Kort {

	private static int antallKort;
	private String fornavn;
	private String etternavn;
	private int pin;
	private int kortnummer;
	private boolean sperretKort;

	public Kort(String fornavn, String etternavn, int pin) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.pin = pin;
		kortnummer = ++antallKort;
		sperretKort = false;
	}

	public abstract boolean sjekkPin(int pin);

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public static int getAntallKort() {
		return antallKort;
	}

	public int getPin() {
		return pin;
	}

	public int getKortnummer() {
		return kortnummer;
	}

	public boolean isSperretKort() {
		return sperretKort;
	}

	public void toggleSperret() {
		sperretKort = !sperretKort;
	}

	@Override
	public String toString() {
		return "Kort [Fornavn =" + fornavn + ", Etternavn =" + etternavn + ", pin =" + pin + ", Kortnummer ="
				+ kortnummer + ", Sperret kort =" + sperretKort + "]";
	}

}