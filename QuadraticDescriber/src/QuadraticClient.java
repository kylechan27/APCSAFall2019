
	import java.util.*;
	public class QuadraticClient {
		public static void main(String[] args) {
			Scanner console = new Scanner(System.in);
			double aInput = 0.0;
			double bInput = 0.0;
			double cInput = 0.0;
			String keepGoing = " ";
			System.out.println("Welcome to the Quadratic Describer");
			System.out.println("Provide values for coefficients a, b, and c.");
			while (!keepGoing.equals("quit")) {
				System.out.print("a: ");
				aInput = console.nextDouble();
				System.out.print("b: ");
				bInput = console.nextDouble();
				System.out.print("c: ");
				cInput = console.nextDouble();
				System.out.println(Quadratic.quadrDescriber(aInput, bInput, cInput));
				System.out.println("Do you want to keep going?? (Type \"quit\" to end)");
				keepGoing = console.next();
				keepGoing = keepGoing.toLowerCase();
			}
			console.close();
		}
	}

