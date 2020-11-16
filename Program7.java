import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ticket number: ");
		char ch=scanner.next().charAt(0);
		int num=scanner.nextInt();
		scanner.close();
		switch(ch)
		{
		case 'a':
			System.out.println("fairfax corner");
			break;
		case 'b':
			System.out.println("herndon center");
			break;
		case 'c':
			System.out.println("tysons corner");
			break;}
		switch(num) 
		{
		case '1':
			System.out.println("hercules");
			break;
		case '2':
			System.out.println("thor");
			break;
		case '3':
			System.out.println("rampage");
			break;
			default:
				System.out.println("wrong ticket number");
		    
		}
	}

}
