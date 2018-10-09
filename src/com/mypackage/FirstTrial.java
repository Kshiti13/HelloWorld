package com.mypackage;

public class FirstTrial {

	public static void main(String[] args) {
		double[] arr = {19, 12.89, 16.5, 200, 13.7};
		double total = 0;
		int a=10;
	    double c=(double)(total/a);

		for(int i=0; i<arr.length; i++){
			total = total + arr[i];
		}
		int ab;

		double average = total / arr.length;
		System.out.println("Hello");

		System.out.format("The average is: %.3f", average);
	}
}
