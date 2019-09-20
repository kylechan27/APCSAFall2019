//Kyle Chan
// APCS 3rd Period
// August 29,2019
// Call the code from Calculate Class
//(aka client or runner)
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(2));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(2,4.5));
		System.out.println(Calculate.average(2,4,6));
		System.out.println(Calculate.toDegrees(3.14159));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(2,4,6));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2,3,6,-7,"x"));
		System.out.println(Calculate.isDivisibleBy(4,5));
		System.out.println(Calculate.absValue(-7));
		System.out.println(Calculate.max(10,100));
		System.out.println(Calculate.max(10,100,100000));
		System.out.println(Calculate.min(1,2));
		System.out.println(Calculate.round2(3.275));
		System.out.println(Calculate.exponent(2,3));
		System.out.println(Calculate.factorial(4));
		System.out.println(Calculate.isPrime(231));
	}
}
