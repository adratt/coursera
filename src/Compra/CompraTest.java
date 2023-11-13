package Compra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompraTest {

	@Test
	void testCompraInt() {
		Compra c = new Compra(500);
		assertEquals(1, c.getNumeroParcelas());
		assertEquals(500, c.getValorParcela());
	}

	@Test
	void testCompraIntInt() {
		Compra c = new Compra(4,250);
		assertEquals(4, c.getNumeroParcelas());
		assertEquals(250, c.getValorParcela());
		assertEquals(1000, c.getValorTotal());
	}

}
