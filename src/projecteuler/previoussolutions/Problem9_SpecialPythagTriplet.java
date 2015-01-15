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
public class Problem9_SpecialPythagTriplet {
    public static int pythagTriplet(int sum) {
        for (int i = 1; i<= sum; i++){
            for (int j = 1; j <= sum; j++) {
                if (((i*i)+(j*j)) == ((sum-i-j)*(sum-i-j))) {
                    return i*j*(sum-i-j);
                }
            }
        }
        return 0;
    }
    
}
