//Kyle Chan
//Period 3
//November 19, 2019

package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args){
    	
    	Scanner userInput = new Scanner(System.in);
    	
    	String end = "quit";
    	System.out.println("Enter an equation with spaces between numbers and the operator...");
    	String problem = userInput.nextLine();
    	
    	while(!end.equals(problem)) {
    		System.out.println(produceAnswer(problem));
    		System.out.println("type \"quit\" to exit or type the next equation to continue...");
    		problem = userInput.nextLine();
    	}
    	userInput.close();
 
        // TODO: Read the input from the user and call produceAnswer with an equation
    	//takes in the inputed equation and calls different methods to produce the answer
    	//uses a while loop and asks user to continue or quit
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    
    public static String produceAnswer(String input) { 
  
    	String[] splitEquation = input.split(" ");
    	int[] firstOperand = toFraction(splitEquation[0]);
    	int[] secondOperand = toFraction(splitEquation[2]);
    	String operator = splitEquation[1];
    	int[] impropFrac = math(firstOperand,operator,secondOperand);
    	int[]answer = toMixedNum(impropFrac[0], impropFrac[1]);
    	
    	if (Math.abs(answer[0]) > 0) {
    		if (answer[1] == 0) {
    			return answer[0] + "";
    		}
    		return answer[0] +"_" + answer[1] + "/" + answer[2];
    	}
    	if (answer[0] == 0 && answer[1] == 0 && answer[2] == 0) {
    		return "0";
    	}
    	else {
    		if (answer[2] == 1) {
    			return answer[1] + "";
    		}
    		return answer[1] + "/" + answer[2];
    		//takes equation and calculates answer. The answer, now an array, is formatted correctly with _ or / 
    	}
    	
        // TODO: Implement this function to produce the solution to the input
    }
    // TODO: Fill in the space below with any helper methods that you think you will need
    public static int[] toFraction(String operand) {
    	int[] intFrac = {0,0,1};
    	
    	if(operand.contains("_")) {
    		String[] wholeAndFrac = operand.split("_");
    		intFrac[0] = Integer.parseInt(wholeAndFrac[0]);
    		operand = wholeAndFrac[1];
    	} 
    	if(operand.contains("/")) {
    		String[] numAndDenom = operand.split("/");
    		intFrac[1] = Integer.parseInt(numAndDenom[0]);
    		intFrac[2] = Integer.parseInt(numAndDenom[1]);
    	}
    	else {
    		intFrac[0] = Integer.parseInt(operand);
    	}
    	
		return toImproperFrac(intFrac);	
		//splits operand into whole number, numerator, and denominator and stores it into am array
		//uses toImproperFrac to convert mixed numbers into improper fractions
    }  
    
	public static int[] toImproperFrac(int[]frac) {
		if (frac[0] < 0) {
			int negSign = -1;
			frac[0] *= -1;
			frac[1] += frac[0] * frac[2];
			frac[1] *= negSign;
			frac[0] = 0;
		}
		else {
			frac[1] += frac[0] * frac[2];
			frac[0] = 0;
		}
		return frac;
		//converts mixed numbers into improper fractions
	}

    public static int[] math(int[] frac1, String operator, int[] frac2) {
    	
    	int[] answer = {0,0};
    	int num1 = frac1[1];
    	int den1 = frac1[2];
    	int num2 = frac2[1];
    	int den2 = frac2[2];
    	
		if (operator.equals("+")) {
			answer[0] = (num1 * den2) + (num2 * den1);
			answer[1] = (den1 * den2);
		}
		if (operator.equals("-")) {
			answer[0] = (num1 * den2) - (num2 * den1);
			answer[1] = (den1 * den2);
		}
		if (operator.equals("*")) {
			answer[0] = num1 * num2;
			answer[1] = den1 * den2;
		}
		if (operator.equals("/")) {
			answer[0] = num1 * den2;
			answer[1] = den1 * num2;
		}
			
		return answer;
		//determines what math to use and calculates the equation, result is an improper fraction
    }
  
    public static int[] toMixedNum(int num, int den) {
    	int[] mixNum = {0,0,1};
    	
    	int whole = num/den;
    	mixNum[0] = whole;
    	
    	if (num != 0) {
    		num = Math.abs(num) % den;
    		int factor = gcf(num, Math.abs(den));
    		mixNum[1] = num / factor;
    		mixNum[2] = Math.abs(den) / factor;
    		return mixNum;
    	}
    	return mixNum;
    	// converts a fraction into a mixed number if possible and reduces it to its simplest form
    }

    public static int gcf(int num1, int num2) {
		int bigger = Math.max(num1,num2);
		int smaller = Math.min(num1,num2);
		int testnum = smaller;
		while(testnum > 1) {
			if(bigger % testnum == 0 && smaller % testnum == 0) {
				return testnum;
			}
			else {
				testnum--;
			}
			//finds the greatest common factor of two numbers
		}
		return 1;
	}
}