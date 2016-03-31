
public class LinkedList<E> implements List<E> {

	private class Node<E> implements Position<E> {
		
		private Node<E> prev;
		private E element;
		private Node<E> next;
		
		public Node(Node<E> prev, E element, Node<E> next) {
			this.prev = prev;
			this.element = element;
			this.next = next;
		}
		
		public Node(E element) {
			this(null, element, null);
		}
		
		public Node() {
			this(null, null, null);
		}
		
		public E getElement() {
			return element;
		}
		
		public Node<E> getPrev() {
			return prev;
		}
		
		public Node<E> getNext() {
			return next;
		}
		
		public void setElement(E element) {
			this.element = element;
		}
		
		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}
		
		public void setNext(Node<E> next) {
			this.next = next;
		}
	} // End of nested class
	
	// << Class Attributes >>
	private Node<E> head, tail;
	private int size;
	
	// << Class Constructor >>
	public LinkedList() {
		head = new Node<E>(); 
		tail = new Node<E>(head, null, null);
		head.setNext(tail);
		size = 0;
	}
	
	// << Class Private Methods >>
	private Position<E> addBetween(Node<E> prev, E element, Node<E> next) {
		
		Node<E> aux = new Node<E>(prev.getNext(), element, next.getPrev());
		
		return aux;
	}
	
	private Node<E> toNode(Position<E> p) {
		
		return (Node<E>) p;
	}
	
	// << Class Operations >>
	public E head() throws EmptyListException {
		
		if (size == 0)
			throw new EmptyListException("Empty list.");
		
		return head.getNext().getElement();
	}
	
	public E tail() throws EmptyListException {
		
		if (size == 0)
			throw new EmptyListException("Empty list.");
		
		return tail.getPrev().getElement();
	}
	
	public int sizeOf() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Position<E> addFirst(E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> addLast(E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> addBefore(Position<E> p, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> addAfter(Position<E> p, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(Position<E> p, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getPos(Position<E> p) {
		// TODO Auto-generated method stub
		return null;
	}
}
