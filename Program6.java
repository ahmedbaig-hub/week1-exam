import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=scanner.next().charAt(0); 
		scanner.close();
		switch(ch)
		{
		   case 'a' :
			   System.out.println("its a vowel");
			   break;
		   case 'e' :
			   System.out.println("its a vowel");
			   break;
	       case 'i' :
	    	   System.out.println("its a vowel");
			   break;
		   case 'o' :
			   System.out.println("its a vowel");
			   break;
		   case 'u' :
			   System.out.println("its a vowel");
			   break;
			   default:
				   System.out.println("its a consonent");
		   
		}
	}
}