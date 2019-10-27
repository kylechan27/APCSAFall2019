
public class Quadratic {
	/* Kyle Chan
	 * September 27 2019
	 * Returns vertex, direction of the parabola, and intercepts. 
	 */
		//a call to quadrDescriber returns a description of the direction in which a parabola opens, its vertex, and its intercepts
		//quadrDescriber accepts three doubles and returns a String description of the quadratic
		public static String quadrDescriber(double a, double b, double c) {
			String openDirection = "";
			double vertexX = (-1 * a) / (2 * b);
			double vertexY = a * square(vertexX) + b * vertexX + c;
			String vertexString = "(" + vertexX + ", " + vertexY + ")";
			
			if (a < 0) {
				openDirection = "negative";
			}
			else {
				openDirection = "positive";
			}
			return "Description of the Graph of:\ny = " + a + "x^2 + " + b + "x + " + c + "\n\n" + "Opens: " + openDirection +
					"\n" + "Axis of Symmetry: " + vertexX + "\n" + "Vertex: " + vertexString + "\n" + "x-intercept(s): " + quadForm(a, b, c) +
					"\n" + "y-intercept: " + c;
		}

		//A call to square returns the square of the value passed.
		//It accepts and returns an integer
		public static double square(double a) {
			double answer = a * a;
			return answer;	
		}
		//A call to round2 rounds a double to 2 decimal places
		//Accept 1 double and returns a double
			public static double round2(double a) {
				a = (a * 100);
				if (a < 0) {
					a = (a - 0.5);
					a = (int)a;
				}
				else {
					a = (a + 0.5);
					a = (int)a;
				}
				return a / 100;
			}
		//A call to sqrt square roots a number
		//Accept 1 double and returns a double
			public static double sqrt(double a) {
				double educatedGuess = a / 2;
				if (a < 0) {
					throw new IllegalArgumentException("Number must be greater than 0"); 
				}
				while (((educatedGuess * educatedGuess) - a) >= .005 || ((educatedGuess * educatedGuess) - a) <= -.005) {
					educatedGuess = 0.5 * (a / educatedGuess + educatedGuess);
				}
				return round2(educatedGuess);
			}
		/*A call to discriminant calculates the discriminant of the coefficients of a standard 
		quadratic equation.*/
		//It accepts 3 doubles and returns 1 double.
		public static double discriminant(double a, double b, double c) {
			double answer = (b * b) - (4 * a * c);
			return answer;
		}
		//A call to quadForm finds the roots of a quadratic equation
		//Accepts 3 integers and returns 1 String
		public static String quadForm(double a, double b, double c) {
			double root1 = 0;
			double root2 = 0;
			if (discriminant(a, b, c) < 0) {
				return "no real roots";
			}
			else if (discriminant(a, b, c) > 0) {
				root1 = (-b + sqrt(discriminant(a, b, c)))/ (2 * a);
				root2 = (-b - sqrt(discriminant(a, b, c)))/ (2 * a);
				return round2(root1) + " and " + round2(root2);
			}
			else {
				root1 = -b / (2 * a);
				return round2(root1) + "";
			}
		}
	}

