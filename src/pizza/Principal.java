package pizza;

public class Principal {

	public static void main(String[] args) {
		
		Pizza p1 = new Pizza("Queijo");
		p1.adicionaIngrediente("Molho", 1);
		p1.adicionaIngrediente("Queijo", 1);
		
		Pizza p2 = new Pizza("Calabreza");
		p2.adicionaIngrediente("Molho", 2);
		p2.adicionaIngrediente("Cebola", 2);
		p2.adicionaIngrediente("Calabreza", 2);
		p2.adicionaIngrediente("Azeitona", 2);
		
		Pizza p3 = new Pizza("Tomate");
		
		CarrinhoDeCompras.adicionarCompra(p1);
		CarrinhoDeCompras.adicionarCompra(p2);
		CarrinhoDeCompras.adicionarCompra(p3);

		CarrinhoDeCompras.imprime();
		
	}
}


