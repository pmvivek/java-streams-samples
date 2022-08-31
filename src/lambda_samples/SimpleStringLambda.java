package lambda_samples;
import java.util.*;
public class SimpleStringLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> books = List.of("SpringBoot In Action", "Learn Java", "AWS", "Azure", "GCP", "kubernetes");
		
		printAllBooks(books);
		printSpringBooks(books);
		
	}

	private static void printSpringBooks(List<String> books) {
		System.out.println("___________________ ");
		System.out.println("Spring books ");

		books.stream().filter(s->s.contains("Spring")).forEach(System.out::println);
	}

	private static void printAllBooks(List<String> bookList) {
		
		bookList.stream().forEach(System.out::println);
       		
	}

}
