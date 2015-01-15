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
public class Problem1_MultiplesOf3And5 {
    public static int multipleSum(int num1, int num2, int range){
        int sum = 0;
        for (int i = 0; i<range; i++) {
            if ((i%num1 == 0) || (i%num2 == 0)) {
                sum += i;
            }
        }
        return sum;
    }
    
}
