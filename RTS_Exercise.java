import java.util.Scanner;

public class RTS_Exercise {
	/* function takes in an array and an int value, loops through given array, and stores
		numbers above and below the specified int. Print the result*/
	public static void printInts(int [] array, int num) {
		int above = 0;
		int below = 0;
		for (int point : array) {
			if (point > num) {
				above++;
			}
			else below++;
		}
		System.out.println("above: " + above + ", below: " + below);
	}
	/* function rotates characters in a string by a specified number; overflow brought
		to the front of the string. No return value or print statement */
	public static void rotateChar(String x, int num) {
		int len = x.length();
		String temp = x.substring(0, len-num);
		String overflow = x.substring(len-num, len);
		String ans = overflow+temp;
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		/*read in input from user for first function*/
		System.out.println("Enter length of array:");
		int len = x.nextInt();
		int [] array = new int[len];
		System.out.println("Enter array values:");
		int i = 0;
		while (i < len) {
			array[i] = x.nextInt();
			i++;
		}
		System.out.println("Enter number for comparison:");
		int num = x.nextInt();
		printInts(array, num);

		/*read in input from user for second function*/
		System.out.println("Enter string:");
		String y = x.next();
		System.out.println("Enter rotation amount:");
		int rotate = x.nextInt();
		rotateChar(y, rotate);
	}
}