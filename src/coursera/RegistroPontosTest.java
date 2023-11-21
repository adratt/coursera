package coursera;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RegistroPontosTest {

	@Test
	void pontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos( cb );
		rp.criarUmTopico( u );
		assertEquals(u.pontos, 5);
	}
	
	@Test
	void pontosCriarTopicoVip() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos( cb );
		rp.criarUmTopico( u );
		assertEquals(u.pontos, 25);
	}

	@Test
	void pontosCriarTopicoBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3;
		RegistroPontos rp = new RegistroPontos( cb );
		rp.criarUmTopico( u );
		assertEquals(u.pontos, 15);
	}
	
	@Test
	void pontosCriarTopicoVipBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 2;
		RegistroPontos rp = new RegistroPontos( cb );
		rp.criarUmTopico( u );
		assertEquals(u.pontos, 50);
	}

}
