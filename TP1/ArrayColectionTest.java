
public class ArrayColectionTest {

	public static void main(String[] args) {
		ArrayColection<Integer> A = new ArrayColection<Integer>(150);
		
		try {
			for (int i = 0; i < 150; i++)
				A.Add(i);
		
			A.Del(-2);
			
			System.out.println(A.Size());
			System.out.println(A.Contain(16));
		} catch (InvalidElementException e) {
			System.out.println(e.getMessage());
		}
	}

}
