
public class ColeccionEnterosArreglo implements ColeccionEnteros {

	private int[] coleccion;
	private int indice;
	private int tama�o;
	
	public ColeccionEnterosArreglo(int tama�o) {
		coleccion = new int[tama�o];
		this.tama�o = this.indice = 0;
	}
	
	public void Insertar(int elemento) throws ColeccionLlena {
		
		if (coleccion.length == tama�o)
			throw new ColeccionLlena("Coleccion llena.");
		
		coleccion[indice++] = elemento;
		tama�o++;
	}
	
	public void Eliminar(int elemento) throws ColeccionVacia {
		
		if (tama�o == 0)
			throw new ColeccionVacia("Coleccion vacia.");
		
		for (int i = 0; i < coleccion.length; i++)
			if (coleccion[i] == elemento) {
				indice = i;
				coleccion[i] = 0;
				tama�o--;
			}
	}
	
	public int cantidadElementos() {
		return tama�o;
	}
	
	public boolean Pertenece(int elemento) {
		
		boolean pertenece = false;
		
		for (int i = 0; i < coleccion.length; i++)
			if (coleccion[i] == elemento)
				pertenece = true;
		
		return pertenece;
	}
	
	public void print() {
		for (int i = 0; i < coleccion.length; i++) {
			if (coleccion[i] != 0)
				System.out.println(coleccion[i]);
		}
	}
}
