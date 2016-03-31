
public interface List<E> {

	public E head() throws EmptyListException;
	public E tail() throws EmptyListException;
	
	public Position<E> addFirst(E element);
	public Position<E> addLast(E element);
	public Position<E> addBefore(Position<E> p, E element);
	public Position<E> addAfter(Position<E> p, E element);
	public void set(Position<E> p, E element);
	
	public E getFirst();
	public E getLast();
	public E getPos(Position<E> p);
	
	public int sizeOf();
	public boolean isEmpty();
}
