package pizza;
import java.util.HashMap;
import java.util.Map.Entry;

public class Pizza {
	
	static HashMap<String, Integer> listaIngredientes = new HashMap<String, Integer>();
	HashMap<String, Integer> listaIngredientesDaPizza = new HashMap<String, Integer>();
	int quantidadeIngredientesDaPizza = 0;
	int valorDaPizza = 0;
	String nomeDaPizza;
	
	Pizza( String nomeDaPizza ){
		this.nomeDaPizza = nomeDaPizza;
	}
	
	public void adicionaIngrediente( String ingrediente, int quantidade ) {
		listaIngredientesDaPizza.put( ingrediente, quantidade );
		quantidadeIngredientesDaPizza += contabilizaIngrediente( ingrediente, quantidade );
		valorDaPizza = getPreco( quantidadeIngredientesDaPizza );
	}
	
	//Este método não precisava ser estático aqui. A contabilização dos ingredientes, entendo que seria mais correto estar no carrinho.
	//Para não fugir do escopo, criei ele conforme definição.
	public static int contabilizaIngrediente( String ingrediente, int quantidade ) {
		int quantidadeAtual = quantidade;
		for ( Entry<String, Integer> listaDaPizza : listaIngredientes.entrySet() ) {
			if ( listaDaPizza.getKey() == ingrediente ) {
				quantidadeAtual = listaDaPizza.getValue();
				quantidadeAtual += quantidade;
			}
		}
		listaIngredientes.put( ingrediente, quantidadeAtual );
		return quantidade;
	}
	
	public static int getPreco( int quantidade ) {
		HashMap <Integer, Boolean> tabela = getTabelaPrecos( quantidade );
		for ( Entry<Integer, Boolean> preco : tabela.entrySet() ) {
			if ( preco.getValue()  ) return preco.getKey();
		}
		return 0;
	}
	
	public static HashMap<Integer, Boolean> getTabelaPrecos(int quantidade) {
		HashMap<Integer, Boolean> tabela = new HashMap<>();
		tabela.put( 15, ( quantidade <= 2 ) );
		tabela.put( 20, ( quantidade > 2 && quantidade <= 5 ) );
		tabela.put( 23, ( quantidade > 5 ) );
		return tabela;
	}
}
