
public class ArrayStackTest {

	public static void main(String[] args) {
		
		ArrayStack<Integer> S = new ArrayStack<Integer>(100);
		
		try {
			
			for (int i = 0; i < 100; i++)
				S.push(i);
			
			S.invert();
			
			while (!S.isEmpty())
				System.out.println(S.pop());
			
		} catch (FullStackException e) {
			System.out.println(e.getMessage());
		} catch (EmptyStackException e) {
			System.out.println(e.getMessage());
		}

	}

}
