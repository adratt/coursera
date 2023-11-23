package pizza;
import java.util.Locale;

public class CarrinhoDeCompras {

	static int quantidadeIngredientes = 0;
	static int quantidadeTotal = 0;
	static int valorTotal = 0;
	
	public static void adicionarCompra( Pizza p ) {
		if ( p.quantidadeIngredientesDaPizza == 0 ) {
			System.out.println("ERRO - Pizza: " + p.nomeDaPizza + " não possui ingredientes adicionados, portanto não será feita!!!!!");
		}else {
			imprimePizza( p );
			quantidadeTotal++;
			valorTotal += p.valorDaPizza;
			quantidadeIngredientes += p.quantidadeIngredientesDaPizza;
		}
	}
	
	static void imprimePizza( Pizza p ) {
		String lista = p.listaIngredientesDaPizza.toString().replace("=", ": ").replace("{", "").replace("}", "");
		System.out.println("Adicionado - Pizza de: " + p.nomeDaPizza + ", utilizado os ingredientes: " + lista + 
				", ficando no valor de: " + converteParaMoeda(p.valorDaPizza) + ".");
	}
	
	
	/**
	 * Adicionei aqui o métido imprime para poder utilizar no teste do JUnit.
	 * Bem como, usar no teste executando a classe principal.
	 */
	
	
	static void imprime() {
		System.out.println("\n--------------------- TOTAL CONTABILIZADO ---------------------\n");
		System.out.println("Possui total de " + 
				( CarrinhoDeCompras.quantidadeTotal == 1 ? "1 pizza" : (CarrinhoDeCompras.quantidadeTotal + " pizzas") ) + 
				", no valor total de: " + converteParaMoeda(CarrinhoDeCompras.valorTotal) + ".");
		System.out.println("Lista de ingredientes utilizados: " + Pizza.listaIngredientes.toString()
			.replace("=", ": ").replace("{", "").replace("}", "") + ". Total de: " + quantidadeIngredientes + ".");
		
	}
	
	static String converteParaMoeda( int str ){
	     return java.text.NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(str);
	}
}
