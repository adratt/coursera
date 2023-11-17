package coursera;
import java.util.HashMap;
import java.util.Map.Entry;

public class Paciente {
	
	double peso;
	double altura;
	
	Paciente( double peso, double altura ){
		this.peso = peso;
		this.altura = altura;
	}
	
	double calcularIMC() {
		return peso / ( altura * altura );
	}
	
	String diagnostico() {
		double IMC = calcularIMC();
		HashMap<String, Boolean> tabela = getTabelaDiagnostico( IMC );
		
		for ( Entry<String, Boolean> diagnosticoEncontrado : tabela.entrySet() ) {
			if ( diagnosticoEncontrado.getValue() ) {
				return diagnosticoEncontrado.getKey();
			}
		}
		return "";
	}
	
	public HashMap<String, Boolean> getTabelaDiagnostico( double IMC ) {
		HashMap<String, Boolean> tabela = new HashMap<>();
		tabela.put( "Baixo peso muito grave", ( IMC < 16 ) );
		tabela.put( "Baixo peso grave", ( IMC >= 16 && IMC < 17 ) );
		tabela.put( "Baixo peso", ( IMC >= 17 && IMC < 18.5 ) );
		tabela.put( "Peso normal", ( IMC >= 18.5 && IMC < 25 ) );
		tabela.put( "Sobrepeso", ( IMC >= 25 && IMC < 30 ) );
		tabela.put( "Obesidade grau I", ( IMC >= 30 && IMC < 35 ) );
		tabela.put( "Obesidade grau II", ( IMC >= 35 && IMC < 40 ) );
		tabela.put( "Obesidade grau III (obesidade mórbida)", ( IMC >= 40 ) );
		return tabela;
	}
}
