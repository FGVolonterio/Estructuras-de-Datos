
public interface Queue<E> {

	/**
	 * Agrega un elemento al final de la cola
	 * @param element Elemento a agregar
	 * @throws FullQueueException si la cola esta llena
	 */
	public void enqueue(E element) throws FullQueueException;
	
	/**
	 * Elimina el primer elemento de la cola
	 * @return Primer elemento de la cola
	 * @throws EmptyQueueException si la cola esta vacia
	 */
	public E dequeue() throws EmptyQueueException;
	
	/**
	 * Consulta el primer elemento de la cola, sin eliminarlo
	 * @return Primer elemento de la cola
	 * @throws EmptyQueueException si la cola esta vacia
	 */
	public E head() throws EmptyQueueException;
	
	/**
	 * Consulta el tamaño de la cola
	 * @return Tamaño de la cola
	 */
	public int sizeOf();
	
	/**
	 * Consulta si la cola esta vacia
	 * @return True si la cola esta vacia, False en caso contrario
	 */
	public boolean isEmpty();
}
