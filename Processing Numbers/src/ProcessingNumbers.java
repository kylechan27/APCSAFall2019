import java.util.Scanner;
public class ProcessingNumbers {
private static final Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {		
			Scanner userInput = new Scanner(System.in);
			System.out.println("How many numbers would you like to input?");
			int run = userInput.nextInt();
			int num = userInput.nextInt();
			
			int max = num;
			int evenMax = -10000000;
			int min = num;
			int evenSum = 0;
			if(num % 2 == 0) {
				evenMax = num;
				evenSum = num;
			}		
			for(int i = 0; i < run - 1; i++) {
				int newNum = userInput.nextInt();
				if(newNum < min) {
					min = newNum;
				} else if(newNum > max) {
					max = newNum;
				}
				if(newNum % 2 == 0) {
					evenSum += newNum;
					if(newNum > evenMax) {
						evenMax = newNum;
						}
					}
				}
			{
				System.out.println("The smallest number is " + min);
				System.out.println("The largest number is " + max);
				System.out.println("The sum of the even numbers is " + evenSum);
				System.out.println("The largest even number is " + evenMax);
			}
		}
	}

