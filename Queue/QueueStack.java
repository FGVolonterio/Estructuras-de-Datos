
public class QueueStack<E> implements Queue<E> {

	private ArrayStack<E> queue;
	
	public QueueStack(int length) {
		queue = new ArrayStack<E>(length);
	}
	
	public void enqueue(E element) {
		
		try {
			
			queue.invert();
			try {
				queue.push(element);
			} catch (FullStackException e) {
				System.out.println(e.getMessage());
			}
			queue.invert();
			
		} catch (EmptyStackException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public E dequeue() {
		
		E elem;
		
		try {
			elem = queue.pop();
		} catch (EmptyStackException e) {
			elem = null;
			System.out.println(e.getMessage());
		}
		
		return elem;
	}
	
	public E head() {
		
		E elem;
		try {
			elem = queue.top();
		} catch (EmptyStackException e) {
			elem = null;
			System.out.println(e.getMessage());
		}
		
		return elem;
	}
	
	public int sizeOf() {
		return queue.sizeOf();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
}
