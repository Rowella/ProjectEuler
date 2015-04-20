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
        System.out.println(diagonalSpiralSum(1001));
        
        
        // TODO code application logic here
    }
    
    public static int diagonalSpiralSum(int length){
        int sum = 1;
        int distance = 2;
        int num = 1;
        while (num < Math.pow(length, 2)){
            for(int i = 0; i<4; i++){
                num += distance;
                sum += num;
            }
            distance += 2;
        }
        return sum;
    }
       
}

