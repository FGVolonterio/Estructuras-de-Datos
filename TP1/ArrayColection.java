
public class ArrayColection<E> implements Colection<E> {

	private E[] array;
	private int size, idx;
	
	@SuppressWarnings("unchecked")
	public ArrayColection(int length) {
		array = (E[]) new Object[length];
		size = idx = 0;
	}
	
	public void Add(E element) {
		
		if (size == array.length)
			return;
		
		array[idx++] = element;
		size++;
	}
	
	public void Del(E element) throws InvalidElementException {
		
		boolean found = false;
		
		if (size == 0)
			return;
		
		for (int i = 0; i < array.length; i++)
			if (array[i] == element) {
				array[i] = null;
				found = true;
				size--;
			}
		
		if (!found)
			throw new InvalidElementException("Element "+element+" not found.");
	}
	
	public int Size() {
		return size;
	}
	
	public boolean Contain(E element) {
		
		boolean ret = false;
		
		for (int i = 0; i < array.length; i++)
			if (array[i] == element)
				ret = true;
		
		return ret;
	}
}
