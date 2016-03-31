
public class ArrayStack<E> implements Stack<E> {

	private static int MAX_LEN = 1000;
	
	private E[] array;
	private int idx;
	private int size;
	
	public ArrayStack(int length) {
		array = (E[]) new Object[length];
		idx = length;
		size = 0;
	}
	
	public ArrayStack() {
		this(MAX_LEN);
	}
	
	public void push(E element) throws FullStackException {
		
		if (size == array.length)
			throw new FullStackException("push: Full stack."+size);
		
		array[--idx] = element;
		size++;
	}
	
	public E pop() throws EmptyStackException {
		
		if (size == 0)
			throw new EmptyStackException("pop: Empty stack.");
		
		E elem = array[idx];
		array[idx] = null;
		idx++;
		size--;
		
		return elem;
	}
	
	public E top() throws EmptyStackException {
		
		if (size == 0)
			throw new EmptyStackException("pop: Empty stack.");
		
		return array[idx];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int sizeOf() {
		return size;
	}
	
	public void invert(ArrayStack<E> P) {
		
	}
	
	public void invert() throws EmptyStackException {
		
		E[] aux = (E[]) new Object[size];
		int i = size;
		
		while (!isEmpty()) {
			aux[--i] = pop();
		}
		
		for (i = 0; i < aux.length; i++) {
			System.out.println(aux[i]);
			array[i] = aux[i];
		}
	}
	
}
