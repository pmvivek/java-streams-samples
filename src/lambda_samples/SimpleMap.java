package lambda_samples;

import java.util.List;

public class SimpleMap {

	public static void main(String[] args) {

      List<Integer> lstNumbers = List.of(3,5,2,9,10,20);
		List<String> books = List.of("SpringBoot In Action", "Learn Java", "AWS", "Azure", "GCP", "kubernetes");

      printSquareOfEvenNumbers(lstNumbers);
      printNumberofCharacters(books);
	}

	private static void printNumberofCharacters(List<String> books) {
     
		 books.stream().map(x->x.length()).forEach(System.out::println);
		
	}

	private static void printSquareOfEvenNumbers(List<Integer> lstNumbers) {
		
		lstNumbers.stream().filter(number-> number%2==0).map(x->x*x).forEach(System.out::println);
	}

}
