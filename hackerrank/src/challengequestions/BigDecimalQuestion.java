package challengequestions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BigDecimalQuestion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer numberOfString = sc.nextInt();
        ArrayList<BigDecimal> list = new ArrayList<>();
        for (int i )
        sc.close();
        

        
    }
    
    public static void sortArrayOfDecimals(ArrayList<BigDecimal> list){

        //9, -100, 50

        //parse the list of numbers and sort them to value
        Collections.sort(list);
        Collections.reverse(list);


        System.out.println(list.toString());

    }

}
