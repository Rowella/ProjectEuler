/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import static java.lang.Math.sqrt;

/**
 *
 * @author alex
 */
public class ProjectEuler {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(primes(600851475143L));
        
        // TODO code application logic here
    }
    
    public static long primes(long num){
        long primeNo = 0;
        long currentPrime = 1;
        long allPrimes=0;
        boolean prime = false;
        
        while (currentPrime < sqrt(num)){
            currentPrime++;
            if (num%currentPrime == 0){
                prime = true;
                for (long i = 2; i<= sqrt(currentPrime); i++){
                if ((currentPrime%i == 0) && (i!= currentPrime)){
                        prime = false;
                        break;
                    }
                }
            } else {
                prime = false;
            }
            
            if (prime == true) {
                primeNo++;
                System.out.println(currentPrime);
                allPrimes = currentPrime;
            }
        }
        return (allPrimes);
    }
    

}

