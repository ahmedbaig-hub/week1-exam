
public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows = 9;
System.out.println("here is your pattern");
        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}