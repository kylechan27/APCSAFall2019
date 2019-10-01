import java.util.Scanner;
public class ProcessingNumbers {
private static final Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
	System.out.print("how many numbers?");
	int numNums= scanner.nextInt();
	int[] numbers = new int[numNums];
	System.out.print("enter number:");
	numbers[0] = scanner.nextInt();
	for(int i=1; i<numNums;i++);
		System.out.print("enter number");
		numbers[i] = scanner.nextInt();
}
		int smallest = numbers[0];
		int biggest = numbers[0];
		int biggestEven = -1;
		int sum =0; 
		for (int i: numbers) {
			if(i<smallest) smallest=i;
			if(i>biggest) biggest=i;
			sum+= i;
			if(i%2==0) {
				sum += i;
		}
	}	
}
}
