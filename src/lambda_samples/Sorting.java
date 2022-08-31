package lambda_samples;

import java.util.Comparator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		
      List<String>lstNames  = List.of("Iniya", "Vika", "Vivek", "Sumi");
      System.out.println(" Sorted Names");
      printSortedString(lstNames);
      System.out.println(" ------------------");
      System.out.println(" Reverse Sorting");

      printReverseSorting(lstNames);
      System.out.println(" ------------------");
      System.out.println(" Sorting Prices");
      List<Double> lstPrices = List.of(20.48,90.43,27.0,42.87) ;
      sortDoubleValues(lstPrices);
	}

	private static void sortDoubleValues(List<Double> lstPrices) {
		lstPrices.stream().sorted().forEach(System.out::println);		
	}

	private static void printReverseSorting(List<String> lstNames) {
		lstNames.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}

	private static void printSortedString(List<String> lstNames) {

		lstNames.stream().sorted().forEach(System.out::println);
	}

}
