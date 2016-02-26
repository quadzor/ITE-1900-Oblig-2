public interface Konstanter {

	static final double FACTOR = 1.25;

	public String getFornavn();

	public void setFornavn(String fornavn);

	public String getEtternavn();

	public void setEtternavn(String etternavn);

	public String getNavn();

	public void setNavn(String navn);

	public double calculateCredit();

	public double calculateBonus();

}