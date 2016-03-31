
public interface Colection<E> {

	public void Add(E element);
	public void Del(E element) throws InvalidElementException;
	public int Size();
	public boolean Contain(E element);
}
