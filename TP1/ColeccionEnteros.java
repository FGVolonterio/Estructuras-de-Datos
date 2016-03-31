
public interface ColeccionEnteros {

	public void Insertar(int elemento) throws ColeccionLlena;
	public void Eliminar(int elemento) throws ColeccionVacia;
	public int cantidadElementos();
	public boolean Pertenece(int elemento);
	public void print();
}
