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
        String num = Double.toString(factorial(100, 2));
        System.out.println(num);
    //Will probably provide the answer but I realised while the program was running that it is faster to just calculate permuatations of 40 objects (20 of one, 20 of the other)
        
        
        // TODO code application logic here
    }

    public static double factorial(double i, double currentNo) {
        if (i == currentNo){
            return currentNo;
        }
        else{
            double number = currentNo*factorial(i, currentNo+1);
            System.out.println(number);
            return number;
        }
    }
    
    
        
    

}

