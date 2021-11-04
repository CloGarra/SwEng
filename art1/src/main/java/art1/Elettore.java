package art1;

public class Elettore extends Utente {
	
	public Elettore(String cognome, String nome, int idCode) {
		this.cognome=cognome;
		this.nome=nome;
		this.idCode=idCode;
	}
	
	@Override
	public String toString() {
		return cognome+" "+nome+" "+idCode;
	}

}
