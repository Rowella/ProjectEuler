/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.previoussolutions;

import static java.lang.Math.sqrt;

/**
 *
 * @author alex
 */
public class Problem10_SumOfPrimes {
    public static long primes(){
        long primeNo = 0;
        long currentPrime = 1;
        long allPrimes=0;
        
        while (currentPrime < 2000000){
            currentPrime++;
            boolean prime = true;
            for (long i = 2; i<= sqrt(currentPrime); i++){
               if ((currentPrime%i == 0) && (i!= currentPrime)){
                    prime = false;
                    break;
                }
            }
            if (prime == true) {
                primeNo++;
                System.out.println(currentPrime);
                allPrimes += currentPrime;
            }
        }
        return (allPrimes);
    }
    
}
