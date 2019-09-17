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
	public static String foil(int a, int b, int c, int d, String x) {
		return (a*c+"x^2 + "+(a*b + b*c) + "x + " +b*d);
}
	//A call to isDivisibility determines whether or not one integer is evenly divisible by another. 
	//The method accepts two integers and returns a boolean.
	public static boolean isDivisibleBy(int x, int y) {
		if(x % y == 0) {
			return true; 
		}   else  {
			return false;
    }
}
	//A call to absValue returns the absolute value of the number passed.
	//The method accepts a double and return a double.
	public static double absValue(double x) {
		if(x>=0) {
			return x;
		} else {
			return x*-1;
	}
}
	//A call to max returns the larger of the values passed.
	//The method accepts two doubles and returns a double.
	public static double max(double x, double y) {
		if(x>y) {
			return x;
		} else {
			return y;
	}
}
	//Overload the max method.
	//This one accepts three doubles and returns a double.
	public static double max(double x, double y, double z) {
		if(x>y && x>z) {
			return x;
		} else if (y>x && y>z) {
			return y;
		} else { 
			return z;
	}
}
	//A call to min returns the smaller of the values passed. 
	//The method accepts two integers an int. 
	public static int min(int x, int y) {
		if(x>y) {
			return y;
		} else {
			return x;
	}
}
	//A call to round2 rounds a double correctly to 2 decimal places and return a double.
	public static double round2(double x) {
		x= (x*100); 
		x= (x+.5);
		x= (int)x;
		x= (x/100);
		x= (double)x;
		return x;	
}
	//A call to exponent raises a value to a positive integer power. 
	//The method accepts a double and an integer and returns a double. 
	public static double exponent(double num, int x) {
	int i=1;
	double result = num;
	while (i !=x) {
		result*= num;
		i++;
	}
	return result;		
}
	//A call to factorial returns the factorial of the value passed.
	//The method accepts an integer and returns an interger. 
	public static int factorial(int x) {
		int answer=x; 
		for (int i= x-1; i>0 ; i--) {
			answer=answer * 1; 
		}
		return answer;
}
	//A call to isPrime determines whether or not an integer is prime. 
	//The method accepts an integer and returns a boolean. 
	public static boolean isPrime(int x) {
		
	}
	//A call to gcf finds the greatest common factor of two integers.
	//The method accepts two positive integers and returns an integer.
	public static int gcf(int x, int y) {
		
		
		
	}
	
}	
