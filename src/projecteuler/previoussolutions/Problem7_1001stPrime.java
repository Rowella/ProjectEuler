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
public class Problem7_1001stPrime {
    public static long primes(){
        long primeNo = 0;
        long currentPrime = 1;
        
        while (primeNo < 10001){
            currentPrime++;
            boolean prime = true;
            for (long i = 2; i< currentPrime/2; i++){
               if ((currentPrime%i == 0) && (i!= currentPrime)){
                    prime = false;
                    break;
                }
            }
            if (prime == true) {
                primeNo++;
            }
        }
        return (currentPrime);
    }
    
}

