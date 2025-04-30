package challengequestions;

import java.math.BigInteger;

class Prime {
    
    public void checkPrime(int ... numbers) {
        StringBuilder message = new StringBuilder();
        for (int number : numbers) {
            if (BigInteger.valueOf(number).isProbablePrime(100)) {
                 message.append(number).append(" ");
            }
        }
        System.out.println(message);
    }
    
}
