package Carros;

public class CarroSoma extends CarroDeCorrida{
	
	protected int potencia;
	
	CarroSoma(String nome, int potencia, int velocidadeMaxima ){
		super( nome, velocidadeMaxima );
		this.potencia = potencia;
	}
	
	@Override
	public void acelerar() {
		velocidade += potencia;
		if ( velocidade > velocidadeMaxima ) velocidade = velocidadeMaxima;
	}
	
	
}
