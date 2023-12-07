package concurso;

public class Candidato implements Comparable<Candidato> {

	private int nota;
	private boolean definiente;
	private int idade;
			
	public Candidato(int nota, boolean definiente, int idade) {
		super();
		this.nota = nota;
		this.definiente = definiente;
		this.idade = idade;
	}

	public int getNota() {
		return nota;
	}

	public boolean isDefiniente() {
		return definiente;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public int compareTo(Candidato outro) {
		if ( nota == outro.getNota() ) {
			if ( definiente == outro.isDefiniente() ) {
				return idade - outro.getIdade();
			}else if ( definiente ){
				return 1;
			}else {
				return -1;
			}
		}else {
			return nota - outro.getNota();
		}
	}

	@Override
	public String toString() {
		return nota + "; " + definiente + "; " + idade;
	}
	
	

}
