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
public class Problem12_HighlyDivisibleTriangularNumber {
    public static long triangleNumber(long num) {
        if (num == 1) {
            return 1;
        } else {
            return num + triangleNumber(num-1);
        }
    }
    
    public static long triangleDivisors(long divisorNo) {
        long divisors = 0;
        long num = 1;
        long currentNo = 0;
        while (divisors < divisorNo) {
            divisors = 0;
            currentNo += num;
            num++;
            for (long i = 1; i<=(currentNo); i++){
                if (currentNo%i == 0) {
                    divisors++;
                }
            }
            System.out.println(currentNo);
            System.out.println(divisors);
        }
        return currentNo;
    }
}
