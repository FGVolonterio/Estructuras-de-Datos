
public class LinkedStackTest {

	public static void main(String[] args) {
		
		Stack<Integer> S = new LinkedStack<Integer>();
		
		try {
			
			for (int i = 0; i < 100; i++)
				S.push(i);
			
			while(!S.isEmpty())
				System.out.println(S.pop());
			
		} catch (EmptyStackException e) {
			System.out.println(e.getMessage());
		} catch (FullStackException e) {
			System.out.println(e.getMessage());
		}

	}

}
