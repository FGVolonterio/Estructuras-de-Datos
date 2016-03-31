import java.util.Scanner;

public class TT {

	public static int s = 0;
	
	public static int pot(int n) {
		
		if (n <= 0) {
			System.out.println(s);
			return 1;
		} else {
			s++;
			return pot(n-1) + pot(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		int n, steps;
		
		n = S.nextInt();
		
		steps = pot(n);
		
		//System.out.println("N: "+n+"\nN2: "+n*n+"\nSteps: "+steps);
		
		S.close();
	}

}
