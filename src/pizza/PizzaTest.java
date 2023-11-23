package pizza;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PizzaTest {

	/**
	 * EXECUTAR somente 1 por vez, devido ao método estatico solicitado no escopo. 
	 * Este item de testes não foi solicitado, é um adendo a atividade.
	 */

	@Test
	void testeComPizzasNoCardapio() {
		Pizza p1 = new Pizza("4 Queijos");
		p1.adicionaIngrediente("Molho", 1);
		p1.adicionaIngrediente("Queijo", 4);
		
		Pizza p2 = new Pizza("Calabreza");
		p2.adicionaIngrediente("Molho", 2);
		p2.adicionaIngrediente("Cebola", 2);
		p2.adicionaIngrediente("Calabreza", 2);
		p2.adicionaIngrediente("Azeitona", 6);
		
		Pizza p3 = new Pizza("Tomate Seco");
		p3.adicionaIngrediente("Molho", 1);
		p3.adicionaIngrediente("Cebola", 1);
		p3.adicionaIngrediente("Tomate", 2);
		CarrinhoDeCompras.adicionarCompra(p1);
		CarrinhoDeCompras.adicionarCompra(p2);
		CarrinhoDeCompras.adicionarCompra(p3);
		
		CarrinhoDeCompras.imprime();
		
		assertEquals(3, CarrinhoDeCompras.quantidadeTotal);
		assertEquals(63, CarrinhoDeCompras.valorTotal);
	}

	@Test
	void testeSemPizzaNoCardapio() {
		Pizza p1 = new Pizza("Mexicana");
		p1.adicionaIngrediente("Molho", 1);
		p1.adicionaIngrediente("Milho Verde", 4);
		p1.adicionaIngrediente("Pimenta", 4);
		
		Pizza p2 = new Pizza("Frango");
		p2.adicionaIngrediente("Molho", 1);
		p2.adicionaIngrediente("Frango Desfiado", 4);
		
		Pizza p3 = new Pizza("Presunto");
		CarrinhoDeCompras.adicionarCompra(p1);
		CarrinhoDeCompras.adicionarCompra(p2);
		CarrinhoDeCompras.adicionarCompra(p3);
	
		CarrinhoDeCompras.imprime();
		
		assertEquals(2, CarrinhoDeCompras.quantidadeTotal);
		assertEquals(43, CarrinhoDeCompras.valorTotal);
	}
}
