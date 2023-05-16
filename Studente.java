package ese;

public class Studente {
	public String nome;
	private int annoDiNascita;
	
	public Studente(String nome, int annoDiNascita) {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnnoDiNascita() {
		return annoDiNascita;
	}

	public void setAnnoDiNascita(int annoDiNascita) {
		this.annoDiNascita = annoDiNascita;
	}
	public String toString() {
		return "Il nome dello studente è "+nome+" ed è nato nel "+annoDiNascita;
		
	}


}
