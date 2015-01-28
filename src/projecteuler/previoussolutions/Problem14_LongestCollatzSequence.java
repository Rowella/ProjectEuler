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
        long highChainLength = 0;
        long highStartNo = 0;
        for (long i = 0; i <= 1000000; i++) {
            if (collatz(i, 0) > highChainLength) {
                highChainLength = collatz(i, 0);
                highStartNo = i;
            }
        }
        System.out.println(highStartNo);
        
        
        // TODO code application logic here
    }

    public static long collatz(long num, long chainLength) {
        if ((num == 1)||(num == 0)) {
            chainLength++;
            return chainLength;
        }
        else if (num%2 == 0) {
            chainLength++;
            chainLength = collatz(num/2, chainLength);
            return chainLength;
        } else {
            chainLength++;
            chainLength = collatz(3*num + 1, chainLength);
            return chainLength;
        }
    }
    
    
        
    

}

