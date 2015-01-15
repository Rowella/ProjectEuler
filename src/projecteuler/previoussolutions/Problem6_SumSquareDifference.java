/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.previoussolutions;

/**
 *
 * @author alex
 */
public class Problem6_SumSquareDifference {
    public static int sumOfSquares(int range) {
        int sum = 0;
        for (int i=0; i<=range; i++) {
           sum += i*i;
        }
        return sum;
    }
    
    public static int squareOfSums(int range) {
        int sum = 0;
        for (int i=0; i<=range; i++){
            sum += i;
        }
        return sum*sum;
    }
    
}
