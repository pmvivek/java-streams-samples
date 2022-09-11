package lambda_samples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionSamples {

	public static void main(String[] args) {

      List<Product> productList = List.of(
    		                            new Product(001, "Printed Shirt", 2000.00, "Green", "M")
    		  						  , new Product(002, "Polo Shirt", 700.00, "Blue", "L")
								      , new Product(003, "Jeans Pant", 1700.00, "Dark Blue", "34")
								      , new Product(004, "Printed Skirt", 1000.00, "Yellow", "XL")
								      , new Product(005, "Round T-Shirt", 900.00, "Purple", "XS")
								      , new Product(006, "Formal Shirt", 2700.00, "Orange", "L")
								      , new Product(007, "Printed Shirt", 2000.00, "Green", "L")
								      );
      
  	// partition by
      
      Map<Boolean, List<Product>> productGroupedByColor = productList. 
    		   											 stream().
    		                                             collect(Collectors.partitioningBy(p1 -> p1.getColor().equals("Green")));
      
      System.out.println("productGroupedByColor " + productGroupedByColor);
      
      
   // Group by
  	
  	Map<String, List<Product>> productListGroupedByName = productList. 
  				 stream().
                   collect(Collectors.groupingBy(Product::getName));
  	
  	System.out.println("productListGroupedByName ");
  	System.out.println(productListGroupedByName);
      
  	
  	// Group by / count
  	
	Map<String, Long> productListGroupedByCount = productList. 
				 stream().
              collect(Collectors.groupingBy(Product::getName, Collectors.counting()));
	
	System.out.println("productListGroupedByCount ");
	System.out.println(productListGroupedByCount);
  	
      
		
	}

	
	
	
	
	
}
