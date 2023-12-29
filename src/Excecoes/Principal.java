package Excecoes;

public class Principal {

	public static void main(String[] args) {
		a( 100 );

	}
	
	public static void a( int i ) {
		System.out.println("Excecutando a com " + i);
		try {
			b( i );
		} catch (Exception e) {
			System.out.println("Tratando a exceção: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void b( int i ) throws Exception {
		System.out.println("Excecutando b com " + i);
		throw new Exception("mensagem");
	}

}
