package it.unical.PrimeGenerator;

import java.util.LinkedList;
import java.util.List;

public class MathClass {
	
	public List<Integer> primeNumbersGenerator(int n){
		List<Integer> primeNumbers = new LinkedList<Integer>();
		if(n>=2) {
			primeNumbers.add(2);
		}
		for(int i=3;i<=n;i+=2) {
			if(isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}
	
	public boolean isPrime(int n) {
		if(n<2)
			return false;
		for(int i=3;i<n;i++)
			if(n%i==0)
				return false;
		return true;
		
	}

}
