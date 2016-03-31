import java.util.Scanner;

public class Ej2C {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long divisor, dividendo;

		try {
			divisor = s.nextLong();
			dividendo = s.nextLong();
			System.out.println(divisor/dividendo);
		} catch (ArithmeticException e) {
			System.out.println("El divisor no puede ser cero");
		} finally {
			s.close();
		}
	}

}
