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
        System.out.println(pythagTriplet(1000));
        
        // TODO code application logic here
    }
    
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

