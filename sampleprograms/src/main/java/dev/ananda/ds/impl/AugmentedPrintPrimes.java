package dev.ananda.ds.impl;


import java.util.Arrays;

public class AugmentedPrintPrimes {

	public int printPrimes(int n){
		int [] primes = new int[n];
		primes[0]=2;
		int noOfPrimes = 1;
		int number = 3;
		boolean isPrime=true;
		int noOfIterations = 0;
		while(noOfPrimes < n){
			isPrime=true;
			for(int i=2; i<=number/2;i++){
				noOfIterations++;
				if(number % i == 0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				primes[noOfPrimes]=number;
				noOfPrimes++;
			}
			number++;
		}
		System.out.println("Primes are");
		System.out.println(Arrays.toString(primes));
		return noOfIterations;
	}
	
	public int printPrimesOptimized(int n){
		System.out.println("Augmented method");
		int noOfIterations = 0;
		int [] primes=new int[n];
		
		primes[0] = 2;
		int noOfPrimes = 1;
		int number = 3;
		boolean isPrime=true;
		while(noOfPrimes < n){
			isPrime=true;
			int iterator = 1;
			int primeIterator=0;
			while(primes[primeIterator] <= number/2){
				noOfIterations++;
				int i =primes[primeIterator];
				if(number % i == 0){
					isPrime=false;
					break;
				}
				primeIterator++;
			}
			
			if(isPrime){
				primes[noOfPrimes] = number;
				noOfPrimes++;
			}
			number++;
		}
		System.out.println("Primes are");
		System.out.println(Arrays.toString(primes));
		return noOfIterations;
	}
	
}

