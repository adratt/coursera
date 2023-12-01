package compras;
import org.junit.After;
import org.junit.Test;

public class CompraParceladaTest {

	double taxaJuros = 0.28;
	double valorDaCompra = 2000;
	Compra c;
	
	@Test
	public void testeUmaParcela() {
		c = new Compra( valorDaCompra );
		
		assert c.total() == valorDaCompra;
	}
	
	@Test
	public void testeUmaParcelaUsandoCompraParcelada() {
		int quantidadeParcelas = 1;
		c = new CompraParcelada( valorDaCompra, quantidadeParcelas, taxaJuros );
		
		assert c.total() == valorDaCompra;
	}
	
	@Test
	public void testeDuasParcelas() {
		int quantidadeParcelas = 2;
		c = new CompraParcelada( valorDaCompra, quantidadeParcelas, taxaJuros );
		
		assert c.total() == 3276.8;
	}
	
	@Test
	public void testeCincoParcelas() {
		int quantidadeParcelas = 5;
		c = new CompraParcelada( valorDaCompra, quantidadeParcelas, taxaJuros );
		
		assert c.total() == 6871.95;
	}
	
	@Test
	public void testeDezParcelas() {
		int quantidadeParcelas = 10;
		c = new CompraParcelada( valorDaCompra, quantidadeParcelas, taxaJuros );
		
		assert c.total() == 23611.83;
	}
	
	
	
/**
 * ###############################################################################
 */
	@After
	public void after() {
		System.out.println("Valor Total: " + c.total());
	}
}