package challengequestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMapProblem {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int numOfQuery = sc.nextInt();
    	
    	Map<String, String> phoneBook = new HashMap<>();
    	
    	for (int i = 0; i < numOfQuery; i++) {
			sc.next();
    		String name = sc.nextLine();
    		String phone = sc.nextLine();
    		phoneBook.put(name, phone);
    	}
    	
    	sc.close();
    	
		System.out.println(phoneBook.toString());
    	
    	
   
    }
}
