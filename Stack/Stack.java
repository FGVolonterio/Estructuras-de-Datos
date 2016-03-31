/**
 * Interfaz del TDA pila
 * @author Francisco Gomez Volonterio
 * @date 31/03/2016
 * @param <E> Tipo de los elementos
 */

public interface Stack<E> {

	/**
	 * Inserta un elemento en el tope de la pila
	 * @param element Elemento a insertar en el tope de la pila
	 * @throws FullStackException si la pila esta llena
	 */
	public void push(E element) throws FullStackException;
	
	/**
	 * Elimina el elemento del tope de la pila
	 * @return Elemento en el tope de la pila
	 * @throws EmptyStackException si la pila esta vacia
	 */
	public E pop() throws EmptyStackException;
	
	/**
	 * Obtiene el valor del elemento al tope de la pila, sin eliminarlo
	 * @return Elemento en el tope de la pila
	 * @throws EmptyStackException si la pila esta vacia
	 */
	public E top() throws EmptyStackException;
	
	/**
	 * Consulta la cantidad de elementos de la pila
	 * @return Tamaño de la pila
	 */
	public int sizeOf();
	
	/**
	 * Consulta si la pila esta vacia
	 * @return Verdadero si la pila esta vacia, falso en caso contrario
	 */
	public boolean isEmpty(); 
}
