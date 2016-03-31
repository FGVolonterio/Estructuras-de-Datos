
public class CircularQueue<E> implements Queue<E> {

	private E[] array; // Queue
	private int idx;   // Front element
	private int size;  // Queue's size
	
	public CircularQueue(int length) {
		array = (E[]) new Object[length];
		idx = 0;
		size = 0;
	}
	
	public void enqueue(E element) throws FullQueueException {
		
		if (size == array.length)
			throw new FullQueueException("enqueue: Full queue.");
		
		int i = (idx + size) % array.length;
		array[i] = element;
		size++;
	}
	
	public E dequeue() throws EmptyQueueException {
		
		if (size == 0)
			throw new EmptyQueueException("dequeue: Empty queue.");
		
		E elem = array[idx];
		array[idx] = null;
		idx = (idx + 1) % array.length;
		size--;
		
		return elem;
	}

	public E head() throws EmptyQueueException {
		
		if (size == 0)
			throw new EmptyQueueException("dequeue: Empty queue.");
		
		return array[idx];
	}

	public int sizeOf() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}
