package lambda_samples;

import java.util.List;

public class ReduceSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lstNumbers = List.of(24,46,32,54,12);
		
		printSumOfNumbers(lstNumbers);
		System.out.println("Largest Number in the above list ");
		printLargestNumber(lstNumbers);
		
		List<Integer> lstMixed = List.of(22,-34,57,60,0,-190);

		System.out.println("Smallest Number in the above list ");
		printSmallestNumber(lstMixed);

	}

	private static void printSmallestNumber(List<Integer> lstMixed) {
	   int minNumber;
	   minNumber= lstMixed.stream().reduce(Integer.MAX_VALUE,(x,y) -> x <y ? x:y);
	   System.out.println(minNumber);
	}

	private static void printLargestNumber(List<Integer> lstNumbers) {
		
		int biggestNumber;
		biggestNumber= lstNumbers.stream().reduce(0,(x,y)-> y>x?y:x);
		System.out.println("------------------- ");

		System.out.println(biggestNumber);
	}

	private static void printSumOfNumbers(List<Integer> lstNumbers) {
         
		 int sum =0;
         sum = lstNumbers.stream().reduce(0,(x,y)-> x+y);
         
         System.out.println(sum);
	}

}
