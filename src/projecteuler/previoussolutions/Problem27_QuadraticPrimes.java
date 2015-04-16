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
public class Problem27_QuadraticPrimes {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(quadraticPrimes());
        
        
        // TODO code application logic here
    }
    
    public static boolean prime(int num){
        for(int i = (int) -Math.sqrt(Math.abs(num)) + 1; i<=Math.sqrt(Math.abs(num)); i++){
            if((i == 0) || (i == 1) || (i == -1)){
                continue;
            }
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static int quadraticPrimes(){
        int productOfCoeff = 0;
        int highest = 0;
        for(int a=-999; a < 1000; a++){
            for(int b = -999; b < 1000; b++){
                if(true){
                    int n = -1;
                    boolean stillPrime = true;
                    while(stillPrime){
                        n++;
                        int num = (int) (Math.pow(n, 2) + a*n + b);
                        if(!prime(num)){
                            stillPrime = false;
                        }
                    }
                    if (n > highest){
                        highest = n;
                        productOfCoeff = a*b;
                    }
                }
                
            }
        }
         return productOfCoeff;
    }
       
}

