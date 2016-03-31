import java.util.Scanner;

public class Test {

	public static boolean NumeroLindo(int n) {
		return (n % 2 == 0);
	}
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		int a, b, i, j, n, steps = 0;
		
		i = 1;
		j = 2;
		n = S.nextInt();
		
		for (a = 1; a <= n; a++) {
			steps++;
			if(NumeroLindo(a)) {
				for (b = a; b <= n; b++) {
					i *= 3;
					steps++;
				}
				for (b = 1; b <= a; b++) {
					j *= 2;
					steps++;
				}
			} else {
				i *= 2;
				steps++;
			}
		}
		
		S.close();
	}

}
