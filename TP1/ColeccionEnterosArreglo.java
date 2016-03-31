
public class ColeccionEnterosArreglo implements ColeccionEnteros {

	private int[] coleccion;
	private int indice;
	private int tamaño;
	
	public ColeccionEnterosArreglo(int tamaño) {
		coleccion = new int[tamaño];
		this.tamaño = this.indice = 0;
	}
	
	public void Insertar(int elemento) throws ColeccionLlena {
		
		if (coleccion.length == tamaño)
			throw new ColeccionLlena("Coleccion llena.");
		
		coleccion[indice++] = elemento;
		tamaño++;
	}
	
	public void Eliminar(int elemento) throws ColeccionVacia {
		
		if (tamaño == 0)
			throw new ColeccionVacia("Coleccion vacia.");
		
		for (int i = 0; i < coleccion.length; i++)
			if (coleccion[i] == elemento) {
				indice = i;
				coleccion[i] = 0;
				tamaño--;
			}
	}
	
	public int cantidadElementos() {
		return tamaño;
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
