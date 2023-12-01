package compras;

public class CompraParcelada extends Compra {

	int quantidadeParcelas;
	double taxaJuros;
	
	CompraParcelada( double valorDaCompra, int quantidadeParcelas, double taxaJuros ) {
		super( valorDaCompra );
		this.quantidadeParcelas = quantidadeParcelas;
		this.taxaJuros = taxaJuros;
	}
	
	@Override
	double total() {
		if ( quantidadeParcelas == 1 ) return valorDaCompra;
		double montante = valorDaCompra * Math.pow((1 + taxaJuros), quantidadeParcelas);
		//double valorJurosAplicados = montante - valorDaCompra;
		return Math.round(montante * 100.0) / 100.0;
	}
}
