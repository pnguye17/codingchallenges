package challengequestions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BigDecimalQuestion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer countOfEntry = sc.nextInt();
        ArrayList<BigDecimal> list = new ArrayList<>();
        while (countOfEntry >= 1){
            list.add(sc.nextBigDecimal());
            countOfEntry--;
        }
        
        sc.close();
        Collections.sort(list);
        Collections.reverse(list);

        for (int i = 0 ; i < list.size(); i++){
        System.out.println(list.get(i));
        }

    }
}
