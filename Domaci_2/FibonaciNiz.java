package domaci3;


// Napisati program koji ce ispisati n brojeva Fibonacijevog niza.



import java.util.Scanner;

public class FibonaciNiz {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.println("Unesite broj ");
		int broj = sc.nextInt();
		
		
		System.out.print(a + " " + b);
	
		for(int i = 2; i < broj; i++) {
			
			
		c = a + b;
		 
		System.out.print(" " + c);
		
		a = b;
		b = c;
		
		}
		
		}
		
	}


