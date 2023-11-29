package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ContaEspecialTest extends ContaCorrente{

	static ContaEspecial c; 
			
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		c = new ContaEspecial(200);
		c.depositar(200);
	}

	@Test
	public void deposito() {
		System.out.println("Saldo: " + c.saldo);
	}
	
	@Test
	public void saque() {
		int valorSacado = c.sacar(250);
		System.out.println("Saldo: " + c.saldo + ", sacado: " + valorSacado);
	}

}
