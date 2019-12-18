/* Kyle Chan
 * Period 3
 * Library of math functions
 * August 29, 2019
 */
public class Calculate {
	// A call to square returns the square of the value passed. The method accepts an integer and returns an integer.
	public static int square(int number) {
		return number*number;
}
	//A call to cube returns the square of the value passed. The method accepts an integer and returns an integer.
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
	//The method accepts a three integers and returns a string.
	public static String toImproperFrac(int number1, int number2, int number3) {
		return ((number1*number3+number1)/number3 + " ");
}
	//A call toMixedNum converts an improper fraction (with its pieces provided separately in the order numerator the denominator) into a mixed number.
	// The method accepts a two integers and returns a String. 
	public static String toMixedNum(int number1, int number2) {
		return ((number1/number2) +" " +number1%number2 + "/" + number2);
}
	//A call foil converts a binomial multiplication of the form (ax+b)(cx+d) into a quadratic equation of the form ax^2+bx+c.
	//The method accepts a four integers and a String and then returns a String. 
	public static String foil(int a, int b, int c, int d, String x) {
		return (a*c+"x^2 + "+(a*b + b*c) + "x + " +b*d);
}
	//A call to isDivisibility determines whether or not one integer is evenly divisible by another. 
	//The method accepts two integers and returns a boolean.
	public static boolean isDivisibleBy(int x, int y) {
		if (y <0) {
			throw new IllegalArgumentException("Number must be greater than 0"); 
		}
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
	//The method accepts an integer and returns an integer. 
	public static int factorial(int x) {
		int answer=x; 
		if (x<0) {
		throw new IllegalArgumentException("Number must be greater than 0"); }
		for (int i= x-1; i<=x ; i++) {
			answer=answer * 1; 
		}
		return answer;
}
	//A call to isPrime determines whether or not an integer is prime. 
	//The method accepts an integer and returns a boolean. 
	public static boolean isPrime(int num) { 
		boolean answer = true;
		for(int i=2; i<num; i++) {
		boolean result= isDivisibleBy(num,i);
		if(result==true); {
		answer=false; 
		}
		}
		return answer;
	}
	//A call to gcf finds the greatest common factor of two integers.
	//The method accepts two positive integers and returns an integer.
	public static int gcf(int integer1, int integer2) {
		int cf = 1;
		double larger = max(integer1, integer2);
		double smaller = min(integer1, integer2);
		for (int i = 1; i <= (int)larger; i++) {
			if (isDivisibleBy((int)larger, i) == true) {
				if (isDivisibleBy((int)smaller, i) == true) {
					cf = i;
				}
			}
		}
		return cf;
		}
	//A call to sqrt returns an approximation of the square root of the value passed, rounded to two decimal places. 
	//The method accepts a double and returns a double.
	public static double sqrt(double x) {
		double answer = x / 2;
		if (x < 0) {
			throw new IllegalArgumentException("Number must be greater than 0"); 
		}
		while (((answer * answer) - x) >= .005 || ((answer * answer) - x) <= -.005) {
			answer = 0.5 * (x / answer + answer);
		}
		return round2(answer);
	}
	//A call to quadForm uses the coefficients of a quadratic equation in standard form and uses the quadratic formula to approximate the real roots, if any.
	//The method accepts three integers and returns a String. 
	public static String quadForm( int a, int b, int c) {
		double root1=0;
		double root2=0;
		if(discriminant(a,b,c)<0) {
			return "no real roots";
		}
		else if (discriminant(a,b,c)>0) {
			root1= (-b+sqrt(discriminant(a,b,c))/(2*a));
			root2= (-b+sqrt(discriminant(a,b,c))/(2*a));
			return round2(root1) + "and" + round2(root2);
		}
		else {
			root1 = -b/(2*a);
			return round2(root1) + "";
			}
		}
<<<<<<< HEAD
	}	
=======
	}
}	
>>>>>>> branch 'master' of https://github.com/kylechan27/APCSAFall2019.git
