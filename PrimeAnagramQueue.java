package com.bridgelabz.datastructure;
import com.datastructure.utility.Utility;
public class PrimeAnagramQueue
{
	public static void main(String[] args)
	{
		Utility utility=new Utility();
		int [][]primes=utility.primeNumbersArray(0, 1000);
		int [][]primeAnagrams = utility.anagramChecking(primes);
		utility.generateAnagramQueue(primeAnagrams);
	}
}


