package challengequestions;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContenExtractor {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0){
			String line = in.nextLine(); 
            
            Pattern pattern = Pattern.compile("<([^<>]+)>([^<>]+)<\\/\\1>"); 
            Matcher matcher = pattern.matcher(line); 
            Stack<String> stack = new Stack<>();  
             
            List<String> strsFound = new LinkedList<>();
            while (matcher.find()) {   
                
                 if (matcher.group(2).length() > 0) strsFound.add(matcher.group(2)); 
            }
			if (strsFound.size() == 0) {
                System.out.println("None"); 
            }
            else {
                for (String str: strsFound) {
                    System.out.println(str); 
                }
            }
			testCases--;
		}
        in.close();
	}
      

}
