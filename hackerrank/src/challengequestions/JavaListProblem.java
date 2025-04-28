package challengequestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaListProblem {

    private static final String STRING_INSERT = "Insert";

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numOfElements = sc.nextInt();
        List<Integer> nums = new ArrayList<>();;
        while (numOfElements > 0){
            nums.add(sc.nextInt());
            numOfElements--;
        }

        int numOfQueries = sc.nextInt();
        sc.nextLine();

        while (numOfQueries > 0){
            String query = sc.nextLine();
            if (query.equalsIgnoreCase(STRING_INSERT)){
                String[] xy = sc.nextLine().split(" ");
                nums.add(Integer.parseInt(xy[0]), Integer.parseInt(xy[1]));
            } else {
                int n = sc.nextInt();
                nums.remove(n);
            }
            numOfQueries--;

        }    
        sc.close();

    }


}
