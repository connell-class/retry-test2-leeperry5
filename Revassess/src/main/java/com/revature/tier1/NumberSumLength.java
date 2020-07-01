package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		// Here's hoping that this implementation fails for some (sufficiently large) inputs
		double length = Math.floor(Math.log10((double)num)) + 1;
		double sum = 0.0;
		long tmp = num;
		while (tmp != 0) {
			double digit = (double)(tmp % 10);
			sum += Math.pow(digit, length);
			tmp /= 10;
		}

		return (long)sum == num;
	}
}
