package challengequestions;

import java.math.BigInteger;
import java.util.Scanner;

public class primality {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        BigInteger ans = new BigInteger(num);


        if (ans.isProbablePrime(100)){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        

       
        sc.close();

    }

}
