package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.NumberSeriesInterfaces;

public class NumberSeriesImplemantation implements NumberSeriesInterfaces{
	
	 public  int fibonacci(int n) {
	        if (n <= 1)
	        	return n;
	        else 
	        	return fibonacci(n-1) + fibonacci(n-2);
	    }
	 
	 public int findSquareNumber(int num) {
			return num * num;
		}
	 
	 public int findFactorial(int number) {
	        int result = 1;

	        for (int factor = 2; factor <= number; factor++) {
	            result *= factor;
	        }

	        return result;
	    }
	 
	 public boolean findPrime(int checker) {
		 boolean result = false;
		 
		 for (int i = 2; i <= checker/2;) {
			 //condition for non-prime numbers
			 if(checker % i == 0) {
				 result = true;
				 return result;
			 }
			 break;

		 }
		 
		 return result;
		/* if(!result) {
			 System.out.println(checker + " is a prime number");
		 }
		 else {
			 System.out.println(checker + " is not a prime number");
		 }*/
	 }
	 
/*	 public int findMax(int no1, int no2) {
			if (no1> no2) {
				return no1;
			}
			else {
				return no2;
			}
		}
		
		public int findMin(int no1, int no2) {
			if (no1> no2) {
				return no2;
			}
			else {
				return no1;
			}
		}*/

}
