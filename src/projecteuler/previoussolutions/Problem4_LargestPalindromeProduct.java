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
public class Problem4_LargestPalindromeProduct {
    public static String palindromic(){
        String finalnum = "0";
        for (int i = 100; i <= 999; i++){
            for (int j = 100; j<= 999; j++){
                String product = Integer.toString(i*j);
                int[] numbers = new int [product.length()];
                for(int k=0; k<product.length(); k++){
                    numbers[k] = Integer.parseInt(Character.toString(product.charAt(k)));
                }
                boolean palindrome = true;
                for (int l = 0; l<product.length(); l++) {
                    if (numbers[l] != numbers[product.length()-l-1]) {
                        palindrome = false;
                    }
                }
                if (palindrome == true) {
                    System.out.println(product);
                    finalnum = product;
                }
                
            }
        }
        return finalnum;
    }
        
    
}
