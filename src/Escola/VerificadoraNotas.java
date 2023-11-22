package Escola;

public class VerificadoraNotas {
	
	/**
	 * @param modelo estruturado e não usado em orientação de objetos
	 * Em orientação a objetos, esta classe é desnecessária, pois são informações do aluno
	 */
	
	public static int mediaAluno( Aluno a ) {
		int total = 0;
		total += a.bim1;
		total += a.bim2;
		total += a.bim3;
		total += a.bim4;
		return total / 4;
	}
	
	public static boolean alunoPassouDeAno( Aluno a ) {
		int media = mediaAluno(a);
		if ( media >= 60) return true;
		return false;
	}
}
