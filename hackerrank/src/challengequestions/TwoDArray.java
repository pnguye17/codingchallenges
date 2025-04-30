package challengequestions;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfInput = Integer.parseInt(input.nextLine());

        int[] list = new int[numberOfInput];

        for (int i = 0 ; i < numberOfInput; i++){
             list[i] = input.nextInt();

        }

        System.out.println(augmenterLesArrays(list));

        input.close();

    }

    private static int augmenterLesArrays(int[] list) {
        int count = 0;
        int currentSum;
        
        // Look all the possible subArrays and check it sums
        for(int i = 1; i <= list.length; i++) {
            for(int j = 0; j <= list.length - i; j++) {
                currentSum = 0;
                for(int z = 0; z < i; z++) {
                    currentSum += list[j + z];
                }
                
                if(currentSum < 0)
                    count++;
            }
        } 
    
    return count;
      
    }
}