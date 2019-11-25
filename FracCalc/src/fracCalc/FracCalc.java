//Kyle Chan
//Period 3
//November 19, 2019
package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner console = new Scanner(System.in);
    	String stop = "";
    	String expression = "";
    	while (!stop.equals("quit")) {
    		System.out.println("Input your expression");
    		expression = console.nextLine();
    		System.out.println(produceAnswer(expression));
    		System.out.println("Continue? Enter \"quit\" to quit and \"y\" to continue");
    		stop = console.nextLine();
    	}
    	console.close();
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        String[] fracOpFrac = input.split(" ");
        String[] wholeNumDen1 = new String[3];
        String[] wholeNumDen2 = new String[3];
        fracSplit(fracOpFrac[0], wholeNumDen1);
        fracSplit(fracOpFrac[2], wholeNumDen2);
        int[] wholeNumDenInts1 = {Integer.parseInt(wholeNumDen1[0]), Integer.parseInt(wholeNumDen1[1]), Integer.parseInt(wholeNumDen1[2])};//Won't work with EC
        int[] wholeNumDenInts2 = {Integer.parseInt(wholeNumDen2[0]), Integer.parseInt(wholeNumDen2[1]), Integer.parseInt(wholeNumDen2[2])};//Won't work with EC
        if(fracOpFrac[1].equals("+") || fracOpFrac[1].equals("-")) {
        	return addSubtract(wholeNumDenInts1, wholeNumDenInts2, fracOpFrac[1]);//Won't work with EC
        }
        else if (fracOpFrac[1].equals("*") || fracOpFrac[1].equals("/")) {
        	return multiplyDivide(wholeNumDenInts1, wholeNumDenInts2, fracOpFrac[1]);//Won't work with EC
        }
        else {
        	return "ERROR: Input is in an invalid format." + fracOpFrac[1];//Error handling Extra Credit
        }
    }
    public static void fracSplit(String operand, String[] ans) {
    	String whole = "";
        String num = "";
        String den = "";
        if(operand.contains("_") == false) {
        	if (operand.contains("/") == false) {
        		whole = operand;
        		num = "0";
        		den = "1";
        	}
        	else {
        		String[] numDen = operand.split("/");
        		whole = "0";
        		num = numDen[0];
    	        den = numDen[1];
        	}
        }
        else {
	        String[] wholeFrac = operand.split("_");
	        whole = wholeFrac[0];
	        String[] numDen = wholeFrac[1].split("/");
	        num = numDen[0];
	        den = numDen[1];
        }
        ans[0] = whole;
        ans[1] = num;
        ans[2] = den;
    }
    public static String addSubtract(int[] mixedFrac1, int[] mixedFrac2, String operator) {//Won't work with EC
    	if (mixedFrac1[0] < 0) {
    		mixedFrac1[1] *= -1;
    	}
    	if (mixedFrac2[0] < 0) {
    		mixedFrac2[1] *= -1;
    	}
    	int improperNum1 = mixedFrac1[0] * mixedFrac1[2] + mixedFrac1[1];
    	int improperNum2 = mixedFrac2[0] * mixedFrac2[2] + mixedFrac2[1];
    	int totalNum = 0;
    	int newDen = mixedFrac1[2];
    	if(operator.equals("-")) {
    		improperNum2 *= -1;
    	}
    	if(mixedFrac1[2] != mixedFrac2[2]) {
    		newDen *= mixedFrac2[2];
    		improperNum1 *= mixedFrac2[2];
    		improperNum2 *= mixedFrac1[2];
    	}
    	totalNum = improperNum1 + improperNum2;
    	return reduceAndConvert(totalNum, newDen);
    }
    public static String multiplyDivide(int[] mixedFrac1, int[] mixedFrac2, String operator) {//Won't work with EC, unless call this each time
    	if(mixedFrac1[0] < 0) {
    		mixedFrac1[1] *= -1;
    	}
    	if(mixedFrac2[0] < 0) {
    		mixedFrac2[1] *= -1;
    	} 
    	int num1 = (mixedFrac1[0] * mixedFrac1[2] + mixedFrac1[1]);
    	int num2 = (mixedFrac2[0] * mixedFrac2[2] + mixedFrac2[1]);
    	int den1 = mixedFrac1[2];
    	int den2 = mixedFrac2[2];
    	int temporary = 0;
    	if(operator.equals("/")) {
    		temporary = den2;
    		den2 = num2;
    		num2 = temporary;
    		if(den2 < 0) {
    			den2 *= -1;
    			num2 *= -1;
    		}
    	}
    	return reduceAndConvert(num1 * num2, den1 * den2);
    }
    public static String reduceAndConvert(int totalNum, int newDen) {
    	int biggerPart = 0;
    	if (totalNum > newDen) {
    		biggerPart = totalNum;
    	}
    	else {
    		biggerPart = newDen;
    	}
    	for (int i = biggerPart; i > 0; i-- ) {
    		if (totalNum % i == 0 && newDen % i == 0) {
    			totalNum /= i;
    			newDen /= i;
    		}
    	}
    	if(newDen == 1) {
    		return totalNum + "";
    	}
    	else if (Math.abs(totalNum) < newDen) {
    		if (totalNum == 0) {
    			return totalNum + "";
    		}
    		else {
    			return totalNum + "/" + newDen;
    		}
    	}
    	else {
    		return totalNum/newDen + "_" + Math.abs(totalNum % newDen) + "/" + newDen;
    	}
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}