// Kyle Chan
// APCS 3rd Period
// November 3,2019
package fracCalc;
import java.util.Scanner;
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
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"7
    public static String produceAnswer(String input) {
    // TODO: Implement this function to produce the solution to the input
    	String temp =input;
    	String operand1= temp.substring(0, temp.indexOf(' '));
    	temp= temp.substring(temp.indexOf(' ')+1);
    	String operator = temp.substring(0, temp.indexOf(' '));
    	temp= temp.substring(temp.indexOf(' ')+1);
    	String operand2 = temp;
    	
    	String opWhole = findWhole(operand2);
    	String opNum = findNum(operand2);
    	String opDenom = findDenom(operand2);
    	
    	String Answer= "whole:" + opWhole + " numerator:"+ opNum + " denominator:" +opDenom;
    	return Answer;
    
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static String findWhole(String str) {
    	if (str.contains("_")) {
    		return str.substring(0, str.indexOf('_'));
    	}else if (str.contains("/")) {
    		return "0";
    	}else return str;
    }
    
    public static String findNum(String str){
    	if (str.contains("_")) {
    		return str.substring(str.indexOf('_')+1, str.indexOf('/'));
    	}else if (str.contains("/")){
    		return str.substring(0, str.indexOf('/'));
    	}else {
    		return "0";
    	}
    }
    		
    public static String findDenom(String str) {
    	if(str.contains("/")) {
    		return str.substring(str.indexOf("/")+1);
    	}else {
    		return "1";
    	}    	
    }
}