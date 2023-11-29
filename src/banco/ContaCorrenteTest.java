package banco;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {

	@Test
	public void deposito() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		System.out.println("Saldo: " + cc.saldo);
	}
	
	@Test
	public void saque() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		int valorSacado = cc.sacar(50);
		System.out.println("Saldo: " + cc.saldo + ", sacado: " + valorSacado);
	}
	
	@Test
	public void saqueMaioQueSaldo() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		int valorSacado = cc.sacar(250);
		System.out.println("Saldo: " + cc.saldo + ", sacado: " + valorSacado);
	}

}
