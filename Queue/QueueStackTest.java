
public class QueueStackTest {

	public static void main(String[] args) {
		
		Queue<Integer> S = new QueueStack<Integer>(100);
		
		try {
			for (int i = 0; i < 100; i++)
				S.enqueue(i);
			
			while (!S.isEmpty())
				System.out.println(S.dequeue());
				
		} catch (EmptyQueueException e) {
			System.out.println(e.getMessage());
		} catch (FullQueueException e) {
			System.out.println(e.getMessage());
		}

	}

}
