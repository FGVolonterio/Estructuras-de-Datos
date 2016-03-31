import java.util.Scanner;

public class Ej2F {

	public static void main(String[] args) {
		
		int numerador, denominador;
		Scanner s = new Scanner(System.in);
		Fraction f;
		
		try {
			numerador = s.nextInt();
			denominador = s.nextInt();
			f = new Fraction(numerador, denominador);
		} catch (FractionException e) {
			System.out.println(e.getMessage());
		} finally {
			s.close();
		}

	}

}
