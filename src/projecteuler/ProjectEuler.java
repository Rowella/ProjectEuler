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
        System.out.println(triangleDivisors(500));
        // TODO code application logic here
    }
    
    public static long triangleNumber(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + triangleNumber(num-1);
        }
    }
    
    public static long triangleDivisors(int divisorNo) {
        int divisors = 0;
        int num = 0;
        long currentNo = 0;
        while (divisors < divisorNo) {
            divisors = 0;
            num++;
            currentNo = triangleNumber(num);
            for (int i = 1; i<=(currentNo); i++){
                if (currentNo%i == 0) {
                    divisors++;
                }
            }
            System.out.println(currentNo);
        }
        return currentNo;
    }
        
    

}

