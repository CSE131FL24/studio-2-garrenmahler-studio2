package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you have?");
		double startAmount = in.nextDouble();
		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit");
		double winLimit = in.nextDouble();
		
		
		while (startAmount<winLimit && startAmount>0) {
			if (winChance >= Math.random()) {
				startAmount++;
			}
			else {
				startAmount--;
			}
			
		System.out.println(startAmount);	
		}
		if (startAmount == 0) {
			System.out.println("ruin");
		}
		if (startAmount == winLimit) {
			System.out.println("Success");
		}}}

	