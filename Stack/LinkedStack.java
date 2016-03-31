public class LinkedStack<E> implements Stack<E> {

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
		
		public Node() {
			this(null, null);
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
	
	private Node<E> top;
	private int size;
	
	public LinkedStack() {
		top = null;
		size = 0;
	}
	
	public void push(E element) {
		
		Node<E> n = new Node<E>(element, top);
		
		top = n;
		size++;
	}
	
	public E pop() throws EmptyStackException {
		
		if (size == 0)
			throw new EmptyStackException("Empty stack.");
		
		E elem = top.getElement();
		top = top.getNext();
		size--;
		
		return elem;
	}
	
	public E top() throws EmptyStackException {
		
		if (size == 0)
			throw new EmptyStackException("Empty stack.");
		
		return top.getElement();
	}
	
	public int sizeOf() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void invert() throws EmptyStackException {
		
		
	}
}
