
public class Fraction {

	private int numerador;
	private int denominador;
	
	public Fraction(int numerador, int denominador) throws FractionException{
		
		if (denominador == 0)
			throw new FractionException("El denominador no pude ser cero.");
		
		this.numerador = numerador;
		this.denominador = denominador;
	}
}
