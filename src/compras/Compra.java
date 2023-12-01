package compras;

public class Compra {

	double valorDaCompra;
	
	Compra( double valorDaCompra ){
		this.valorDaCompra = valorDaCompra;
	}
	
	double total() {
		return valorDaCompra;
	}
}
