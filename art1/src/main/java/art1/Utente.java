package art1;

public abstract class Utente {
	protected String nome, cognome;
	protected int idCode;
	
	public abstract String toString();

	public String getCognome() {
		return cognome;
	}
}
