package Carros;
import org.junit.Before;
import org.junit.Test;

import Carros.CarroDeCorrida;
import Carros.CarroMultiplica;

public class CarroMultiplicaTest {

	CarroDeCorrida c;
	
	@Before
	public void setUp() {
		c = new CarroMultiplica("teste", 1.5, 100 );
	}

	@Test
	public void testeCarroParado() {
		System.out.println( "Carro Parado: " + c.getVelocidade() );
		assert c.getVelocidade() == 0;
	}
	
	@Test
	public void testeAcelerarUmaVez() {
		c.acelerar();
		System.out.println( "Acelerar Uma Vez: " + c.getVelocidade() );
		assert c.getVelocidade() == 10;
	}
	
	@Test
	public void testeAcelerarDuasVezes() {
		c.acelerar();
		c.acelerar();
		System.out.println( "Acelerar Duas Vezes: " + c.getVelocidade() );
		assert c.getVelocidade() == 15;
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
