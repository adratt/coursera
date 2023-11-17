package coursera;

public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente( 60, 1.60 );
		
		Paciente p2 = new Paciente( 80, 1.70 );
		
		Paciente p3 = new Paciente( 120, 1.80 );
		
		System.out.println( "Paciente 1: possui IMC: " + p1.calcularIMC() + " kg/m² e o diagnóstico é de: " + p1.diagnostico() );
		
		System.out.println( "Paciente 2: possui IMC: " + p2.calcularIMC() + " kg/m² e o diagnóstico é de: " + p2.diagnostico() );
		
		System.out.println( "Paciente 3: possui IMC: " + p3.calcularIMC() + " kg/m² e o diagnóstico é de: " + p3.diagnostico() );

	}
}