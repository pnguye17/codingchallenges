package challengequestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMapProblem {

    public static void main(String[] args) {

		//add Person obj to Map
    	
    	Scanner sc = new Scanner(System.in);
    	int entry = sc.nextInt();
    	
    	Map<String, String> phoneBook = new HashMap<>();
		
		sc.nextLine();
    	for (int i = 1; i <= entry; i++) {
			String name = sc.nextLine().toLowerCase();
    		String phone = sc.nextLine();
    		phoneBook.put(name, phone);
    	}
    	
		while (entry >= 1) {
			String search = sc.nextLine().toLowerCase();
			if (phoneBook.containsKey(search)) {
				System.out.println(search+ "=" + phoneBook.get(search));
			} else {
				System.out.println("Not found");
			}
			entry--;
		}
    	sc.close();

       
    }
}
