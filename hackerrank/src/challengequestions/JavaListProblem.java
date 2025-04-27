package challengequestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaListProblem {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numOfElements = sc.nextInt();
        List<Integer> nums = new ArrayList<>();;
        while (numOfElements > 0){
            nums.add(sc.nextInt());
            numOfElements--;
        }

        int numOfQueries = sc.nextInt();

        if ( numOfQueries == 2){
            System.out.println("Insert");
            sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            nums.set(y, x);
            // System.out.println("Delete");
            // int z = sc.nextInt();
            // nums.remove(z);
        }

        System.out.println(nums.toString());
        sc.close();


    }


}
