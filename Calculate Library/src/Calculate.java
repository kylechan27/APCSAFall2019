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
	//A call to discriminant provides the coefficents of a quadratic equation in standard form.
	}