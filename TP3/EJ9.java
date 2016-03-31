
public class EJ9 {

	public static boolean str(Queue<Character> W, char c) {
		
		Queue<Character> Q = new LinkedQueue<Character>();
		Stack<Character> S = new LinkedStack<Character>();
		char c1;
		
		try {
			while ((c1 = W.dequeue()) != c)
				Q.enqueue(c1);
			
			if (W.isEmpty())
				return false;
			
			while ((c1 = W.dequeue()) != c) 
				S.push(c1);
			
		} catch (FullQueueException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(8);
		} catch (EmptyQueueException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(8);
		} catch (FullStackException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(8);
		}
		
		return Q.equals(S);
	}
	
	public static void main(String[] args) {
		
		Queue<Character> Q = new LinkedQueue<Character>();

		try {
			Q.enqueue('a');
			Q.enqueue('b');
			Q.enqueue('b');
			Q.enqueue('a');
			Q.enqueue('b');
			Q.enqueue('a');
			Q.enqueue('w');
			Q.enqueue('a');
			Q.enqueue('b');
			Q.enqueue('a');
			Q.enqueue('b');
			Q.enqueue('b');
			Q.enqueue('a');
			
			System.out.println(str(Q, 'w'));
		} catch (FullQueueException e) {
			System.out.println(e.getMessage());
		}
	}

}
