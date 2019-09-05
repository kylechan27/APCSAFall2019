/* Kyle Chan
 * Period 3
 * Library of math functions
 * August 29, 2019
 */
public class Calculate {
	// A call to square returns the square of the value passsed. The method accepts an integer and returns an integer.
	public static int square(int number) {
		return number*number;
	}
	//A call to cube returns the square of the value passsed. The method accepts an integer and returns an integer.
	public static int cube(int number) {
		return number*number*number;
	}
	//A call to average returns the average of the values passed to it.
	//This method accepts two doubles and returns a double.
	public static double average(double number1,double number2) {
		return (number1+number2)/2; 
	}
	//Another average method. This one accepts three doubles and returns a double.
	public static double average(double number1,double number2,double number3) {
		return (number1+number2+number3)/3; 
	}
	//A call toDegrees converts an angle measure given in radians into degrees. 
	//This method accepts a double and returns a double. 
	public static double toDegrees(double radians) {
		return ( radians*180/3.14159);
	}
	//A call toRadians converts an angle measure given in degrees into radians.
	//This method accepts a double and returns a double.
	public static double toRadians(double degrees) {
		return (degrees*3.14159/180);
	}
	//A call to discriminant provides the coefficents of a quadratic equation in standard form (a,b, and c) and returns the value of the discriminant.
	public static double discriminant(double number1, double number2, double number3) {
		return (-(number2*number2)-(4*number1*number3));
	}
	//A call toImproperFrac converts mixed number (with its pieces provided separately in the order whole number, numerator, then denominator) into an improper fraction.
	//The method accepts a three intergers and returns a string.
	public static String toImproperFrac(int number1, int number2, int number3) {
		return ((number1*number3+number1)/number3 + " ");
}
	//A call toMixedNum converts an improper fraction (with its pieces provided separately in the order numerator the denominator) into a mixed number.
	// The method accepts a two intergers and returns a String. 
	public static String toMixedNum(int number1, int number2) {
		return ((number1/number2) +" " +number1%number2 + "/" + number2);
	}
	//A call foil converts a binomial multiplication of the form (ax+b)(cx+d) into a quadratic equation of the form ax^2+bx+c.
	//The method accepts a four intergers and a String and then returns a String. 
	public static String foil(int number1, int number2, int number3, int number4, String variable) {
		return ((number1*variable)*(number3*variable))+((number1*variable*number4)+(number3*varaible*number2))+(number2*number4);
	}
}