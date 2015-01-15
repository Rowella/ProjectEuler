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
public class Problem2_EvenFibbonnacci {
    public static int evenFib(int range){
        int sum = 0;
        int n = 0;
        int currentFib = 0;
        while ((currentFib < range)) {
            n++;
            if (currentFib%2 == 0) {
                sum += currentFib;
            }
            currentFib = fib(n);
        }
        return sum;
    }
    public static int fib (int num) {
        if ((num == 1) || (num == 0)){
            return 1;
        } else {
            return fib(num-1) + fib(num-2);
        }
    }
}
