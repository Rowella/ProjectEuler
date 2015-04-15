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
public class ProjectEulr {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = abundants(28123, 6965);
        System.out.println(nonAbundantSums(28123, numbers));
        
        
        // TODO code application logic here
    }
    
    public static int[] abundants(int max, int arrayLength){
        int[] numbers = new int[arrayLength];
        int numberAlong = 0;
        for(int i = 0; i < max; i++){
            int sum = 0;
            for(int j=1; j<i; j++){
                if(i%j == 0){
                    sum += j;
                }
            }
            if(sum > i){
                numbers[numberAlong] = i;
                numberAlong++;
            }
        }
        return numbers;
    }
    
    public static int nonAbundantSums(int max, int[] abundants){
        int sum = 0;
        for(int i = 0; i <= max; i++){
            boolean abundantSum = true;
            for(int j = 0; j < abundants.length; j++){
                for(int k=0; k<abundants.length; k++){
                    if(abundants[k]+abundants[j] == i){
                        abundantSum = false;
                        break;
                    }
                }
            }
            if (abundantSum == true){
                sum += i;
                System.out.println(i);
            }
        }
        return sum;
    }
    
    
        
    

}

