import java.util.Scanner;
// imports the scanner "library" just like including libraries

public class TestClass {

		public static void main(String[] args) {
			
			double tempF = 100.0;
			
			double tempC = 5 * (tempF - 32) / 9.0;
			
			// cout << tempC << endl;
			System.out.println(tempC);
			

			System.out.println("Enter a temperature in C: ");
			Scanner sc = new Scanner(System.in);
			
			// trying to find the double so use the next line to find the "next double"
			// will throw out exceptions if there is a string.
			tempF = sc.nextDouble();
			
			
			System.out.println("Result is: " + convertF2C(tempF));
			
			// cin << tempF << endl;
			
		}
		
		public static double convertF2C(double f)
		{
			return 5 * (f - 32) / 9.0;
		}
}
