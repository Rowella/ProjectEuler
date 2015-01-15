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
public class Problem5_SmallestMultiple {
    public static int smallMultiple(int divisors) {
       int smallestNo = 0;
       int no = 20;
       while (smallestNo == 0) {
           no++;
           boolean multiple = true;
           for(int i=2; i<=20; i++) {
               if (!(no%i == 0)) {
                   multiple = false;
               }
           }
           if (multiple == true) {
               smallestNo = no;
           }
       }
       return smallestNo;
    }
    
}
