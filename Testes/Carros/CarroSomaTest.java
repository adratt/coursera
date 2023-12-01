package Carros;
import org.junit.Before;
import org.junit.Test;

import Carros.CarroDeCorrida;
import Carros.CarroSoma;

public class CarroSomaTest {

	CarroDeCorrida c;
	
	@Before
	public void setUp() {
		c = new CarroSoma("teste", 10, 100 );
	}

	@Test
	public void testeCarroParado() {
		System.out.println( "Carro Parado: " + c.getVelocidade() );
		assert c.getVelocidade() == 0;
	}
	
	@Test
	public void testeAcelerar() {
		c.acelerar();
		System.out.println( "Acelerar: " + c.getVelocidade() );
		assert c.getVelocidade() == 10;
	}
	
	@Test
	public void testeFrear() {
		c.acelerar();
		c.frear();
		System.out.println( "Frear: " + c.getVelocidade() );
		assert c.getVelocidade() == 5;
	}
	
	@Test
	public void testeFrearAteZero() {
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		System.out.println( "Frear Até Zero: " + c.getVelocidade() );
		assert c.getVelocidade() == 0;
	}
	
	@Test
	public void testeAcelerarAteVelocidadeMaxima() {
		for ( int i = 0; i <14; i++) {
			c.acelerar();
			System.out.println( "Acelerar Até Velocidade Máxima: " + c.getVelocidade() );
		}
		assert c.getVelocidade() == 100;
	}

}
