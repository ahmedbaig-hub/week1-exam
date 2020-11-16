import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		String results = (num<200 && num%2 ==0 ) ? "less than 200 and even": "invalid";
		System.out.println("the number is " + results);
		

	}

}
