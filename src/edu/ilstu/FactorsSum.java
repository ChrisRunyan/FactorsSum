package edu.ilstu;

import java.util.Scanner;

/**This is a simple tool to fund the sum of all factors of any amount of numbers, up to another given number. For example; the sum of all factors
 * of 5, 9, and 14 between 0 and 150. The program always begins at zero, and is non-inclusive of the max value of a factor.
 * 
 * @author Christopher Runyan
 */
public class FactorsSum {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int numInt=0;
		int[] nums;
		int max=0;
		int sum=0;
		boolean foundFactor=false;
		
		System.out.print("Welcome to the Factor Sum tool. It will find the sum of all factors of given numbers up to (but not including) a given number.\n");
		System.out.print("Enter the number of integers you wish to calculate the sum of factors of: ");
		numInt=kb.nextInt();
		nums=new int[numInt];
		
		for(int i=0; i<numInt; i++) {
			System.out.print("Enter number "+(i+1)+": ");
			nums[i]=kb.nextInt();
		}
		
		System.out.print("Enter max value for a factor (non-inclusive): ");
		max=kb.nextInt();
		
		for(int i=0; i<max; i++) {
			for(int j=0; j<nums.length; j++) {
				if(i%nums[j]==0&&foundFactor==false) {
					sum+=i;
					foundFactor=true;
				}
			}
			foundFactor=false;
		}
		
		System.out.println("Sum: "+sum);
		
		kb.close();
	}
}
