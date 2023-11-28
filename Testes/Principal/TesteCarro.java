package Principal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCarro {

	@Test
	void test() {
		Carro c = new Carro();
		c.potencia = 10;
		c.acelerar();
		assert c.velocidade == 10;
	}

}
