
public class CircularQueueTest {

	public static void main(String[] args) {
		
		Queue<Integer> Q = new CircularQueue<Integer>(100);

		try {
			for (int i = 0; i < 1000; i++)
				Q.enqueue(i);
			
			while (!Q.isEmpty())
				System.out.println(Q.dequeue());
			
		} catch (FullQueueException e) {
			System.out.println(e.getMessage());
		} catch (EmptyQueueException e) {
			System.out.println(e.getMessage());
		}
	}

}
