package challengequestions;


public class Prime {

    public static void checkPrime(int n) {
        if (n == 1 ) {
            System.out.println("Not a prime");
        } 
        if (n % n == 0 && n % 1 == 0) {
            System.out.println(n);
        }
    } 
}
