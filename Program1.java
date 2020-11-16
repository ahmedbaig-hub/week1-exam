import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		String results = (num > 100) ? "greater than 100" : "less than 100" ;
		System.out.println("the number is "+ results);

	}

}
