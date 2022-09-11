package lambda_samples;

import java.text.MessageFormat;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class VarArgs {
	
    private static String LOG_PREFIX = "Allocation ::";
    
   // private static List<String> namesList =List.of("One", "two", "three");

    private static String namesList = "ONE, TWO, THREE";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		debug("Single value","Product Id : ",StringUtils.join(namesList,","));
		
	}
	
	private static void printMultivalues(Object...args) {
		
		System.out.println(MessageFormat.format("Final Result{0}" , args));
	}

	public static void debug(String format, Object...objects)
    {
            debugLog(LOG_PREFIX, format, objects);
        
    }

	   public static void debugLog(String preFix, String format, Object... objects)
	    {
	        try
	        {
	            String finalFormat = format;
	            System.out.println( MessageFormat.format(" [ProductId:" 
                + "] :: Step:" +  " :: {1}" , finalFormat, StringUtils.join(objects,"")));
	        }
	        catch (Exception e)
	        {
	           System.out.println(e.toString());
	        }
	    }
}
