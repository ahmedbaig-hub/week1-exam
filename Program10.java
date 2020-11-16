import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
        long num,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers) :");
        while(true)
               {
                       num=sc.nextLong(); 
                       if(num<0)
                       break;
                       sum +=num;
               }
                       System.out.println( "Sum is : " +sum);
      }
}
		


