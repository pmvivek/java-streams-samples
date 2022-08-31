package lambda_samples;

import java.util.*;


public class SimpleLambda {

	public static void main(String[] args) {
		
		Integer[] numbers = new Integer[] {10,20,50,35,65};
		
		List<Integer> numbersList = Arrays.asList(numbers);
		printAllNumber(numbersList);
		printAllEvenNumbers(numbersList);

	}

	
	private static void printAllNumber(List<Integer> numbers) {
		
		numbers.stream().forEach(System.out::println);
		System.out.println("-------------------------");
	}
	
	private static void printAllEvenNumbers(List<Integer> numbers) {
		System.out.println("Even Numbers ");
		numbers.stream().filter(x->x%2==0).forEach(System.out::println);
		System.out.println("-------------------------");

	}
	
	private static void printSortedNumbers(List<Integer> numbers) {
		System.out.println("Even Numbers ");
		System.out.println("-------------------------");

	}
}
