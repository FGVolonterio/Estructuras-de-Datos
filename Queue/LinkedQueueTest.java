
public class LinkedQueueTest {

	public static void main(String[] args) {
		Queue<Character> Q = new LinkedQueue<Character>();
		
		try {
			for (char c = 'a'; c <= 'z'; c++) {
				Q.enqueue(c);
			}
			
			while (!Q.isEmpty())
				System.out.println(Q.dequeue());

		} catch (EmptyQueueException e) {
			e.printStackTrace();
		} catch (FullQueueException e) {
			e.printStackTrace();
		}
	}
}
