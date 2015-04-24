/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currentprojecteuler;


import static java.lang.Math.sqrt;
import java.util.Arrays;

/**
 *
 * @author alex
 */
public class ProjectEuler {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[100];
        amiciableNumbers(numbers, 10000);
        System.out.println(Arrays.toString(numbers));
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    //Will probably provide the answer but I realised while the program was running that it is faster to just calculate permuatations of 40 objects (20 of one, 20 of the other)
        
        
        // TODO code application logic here
    }

    public static int[] findFactors(int num) {
        int[] factors = new int[5000];
        int j = 0;
        for (int i = 1; i < num; i++){
            if (num%i == 0) {
              factors[j] = i;
              j++;
            }
        }
        return factors;
    }
    
    public static void amiciableNumbers(int[] numbers, int num) {
        int j = 0;
        for (int i = 0; i <=num; i++) {
            int[] factors = findFactors(i);
            int sum = 0;
            for (int k = 0; k < factors.length; k++) {
                sum += factors[k];
            }
            int[] newFactors = findFactors(sum);
            int newSum = 0;
            for (int k = 0; k < newFactors.length; k++) {
                newSum += newFactors[k];
            }
            if ((newSum == i) && (newSum != sum)) {
                numbers[j] = i;
                j++;
            }
        }
}
    
    
        
    

}

