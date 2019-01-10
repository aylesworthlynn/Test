import java.util.Scanner;

public class TestClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please give me an integer");
		Scanner sc = new Scanner(System.in);
		
		numberReader(sc.nextInt());
		
	}
	
	public static int numberReader(int num) {
		/*if (num < 10)
			System.out.println(num);
		else*/
		if (num >= 10)
			numberReader(num/10);
		System.out.println(num % 10);
	return num;
	}
	

}
