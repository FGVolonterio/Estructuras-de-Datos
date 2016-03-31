
public class LinkedQueue<E> implements Queue<E> {

	private class Node<E> {
		
		private E element;
		private Node<E> next;
		
		public Node(E element, Node<E> next) {
			this.element = element;
			this.next = next;
		}
		
		public Node(E element) {
			this(element, null);
		}
		
		public E getElement() {
			return element;
		}
		
		public Node<E> getNext() {
			return next;
		}
		
		public void setElement(E element) {
			this.element = element;
		}
		
		public void setNext(Node<E> next) {
			this.next = next;
		}
	}
	
	private Node<E> first, last;
	private int size;
	
	public LinkedQueue() {
		this.first = this.last = null;
		size = 0;
	}

	public void enqueue(E element) {
		
		Node<E> n = new Node<E>(element);
		
		if (size == 0)
			first = n;
		else
			last.setNext(n);
		
		last = n;
		size++;
	}
	
	public E dequeue() throws EmptyQueueException {
		
		if (size == 0)
			throw new EmptyQueueException("Empty queue.");
		
		E ret;
		
		ret = first.getElement();
		first = first.getNext();
		size--;
		
		return ret;
	}
	
	public E head() {
		return first.getElement();
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int sizeOf() {
		return size;
	}
	
	public boolean equals(ArrayStack<E> S) throws EmptyStackException, EmptyQueueException {
		
		boolean eq = true;
		
		while (!S.isEmpty() && eq)
			if (S.pop() != dequeue())
				eq = false;
		
		return eq;
	}
}
