
public class Ej3 {

	private static void w(String m) {
		System.out.println(m);
	}
	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new Pair<>(35, "ASD");
		Pair<Float, Long> p2 = new Pair<>(3.14f, 64l);
		Pair<Boolean, Character> p3 = new Pair<>(false, 'w');
		
		w(p1.toString());
		w(p2.toString());
		w(p3.toString());

	}

}
