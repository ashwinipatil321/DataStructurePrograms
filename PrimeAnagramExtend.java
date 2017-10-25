package com.bridgelabz.datastructure;

import com.datastructure.utility.Utility;

public class PrimeAnagramExtend 
{	public static void main(String[] args) {
	Utility utility=new Utility();
	int [][]primes=utility.primeNumbersArray(0, 1000);
	int [][]primeAnagrams = utility.anagramChecking(primes);
	System.out.println("prime Number between 0 to 1000");
	System.out.println();
	utility.display1(primes);
	System.out.println();
	System.out.println("Anagram Number between 0 to 1000");
	System.out.println();
	utility.display2(primeAnagrams);
}
}
