package art1;

public class Scrutinatore extends Utente {
	
	public Scrutinatore(String cognome, String nome, int idCode) {
		this.cognome=cognome;
		this.nome=nome;
		this.idCode=idCode;
	}
	
	@Override
	public String toString() {
		return cognome+" "+nome+" "+idCode;
	}

}
