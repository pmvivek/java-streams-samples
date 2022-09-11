package lambda_samples;

import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Collectors;
public class SampleCollect {

	public static void main(String[] args) {
		
      List<String> fruitList = List.of("Apple", "Orange", "Kiwi", "Guava", "Pome", "Sapote", "apple", "guava");
      
      List<Integer> priceList= List.of(001, 003,100,3001,3373, 16868);
      
      List<Double> priceListDouble= List.of(12.89,20.0,15.01, 120.01, 30.0, 16.0, 40.0, 20.0, 100.00);
      


      // convert the list to a set
      
      Set<String> fruitSet = fruitList.stream().collect(Collectors.toSet());
      
      System.out.println("Fruit list converted to set");
      System.out.println(fruitSet);
      
      // Distinct fruit list -- Ignore case
      
      List<String> distinctFruitList = fruitList.stream().map(fruit->fruit.toLowerCase()).distinct().
    		  collect(Collectors.toList());
      
      System.out.println(MessageFormat.format("Distinct fruit list {0}", distinctFruitList));
      
      // Aggregation using collect
      
      //count
      System.out.println( "Count : "+ priceList.stream().count());
      
      //min
      System.out.println( "Min  : "+ priceList.stream().min(Comparator.comparingInt(Integer::intValue)).get());

      //max 
      
      System.out.println( "Max  : "+ priceList.stream().max(Comparator.comparingInt(Integer::intValue)).get());

      
      //Sum
      int totalPrice = priceList.stream().collect(Collectors.summingInt(Integer::intValue));
      
      System.out.println("Total Price " + totalPrice);
      
      
      // Double 
      //Average
      Double averagePrice = priceList.stream().collect(Collectors.averagingInt(Integer::intValue));
      
      System.out.println("Average Price " + averagePrice);
      
       double totalPriceDouble = priceListDouble.stream().collect(Collectors.summingDouble(Double::doubleValue));
      
      System.out.println("Total Price List (In double) " + totalPriceDouble);   
      
      System.out.println(priceList.stream().collect(Collectors.summarizingDouble(Integer::intValue)));
      
      
      
      
	}

}
