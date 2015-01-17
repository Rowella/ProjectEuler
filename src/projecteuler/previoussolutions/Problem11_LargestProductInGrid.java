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
public class Problem11_LargestProductInGrid {
    public static long gridProduct(String grid) {
        long highestProduct = 0;
        long currentProduct = 0;
        long[] numbers = new long[400];
        String[] splitGrid = grid.split(" ");
        for (int i = 0; i<400; i++) {
            System.out.println(splitGrid[i]);
        }
        for (int i=0; i<399; i++) {
            numbers[i] = Integer.parseInt(splitGrid[i]);
        }
        for (int i=0; i<400; i++) {
            if (i<397) {
                currentProduct = numbers[i]*numbers[i+1]*numbers[i+2]*numbers[i+3];
                if (currentProduct > highestProduct) {
                    highestProduct = currentProduct;
                    System.out.println(highestProduct);
                }
            }
            if (i < 400) {
                currentProduct = numbers[i]*numbers[i+20]*numbers[i+40]*numbers[i+60];
                if (currentProduct > highestProduct) {
                    highestProduct = currentProduct;
                    System.out.println(highestProduct);
                }
            }
            if (i < 400) {
                currentProduct = numbers[i]*numbers[i+21]*numbers[i+42]*numbers[i+63];
                if (currentProduct > highestProduct){
                    highestProduct = currentProduct;
                    System.out.println(highestProduct);
                }
            }
            if (i < 400) {
                currentProduct = numbers[i]*numbers[i+19]*numbers[i+38]*numbers[i+57];
                if (currentProduct> highestProduct){
                    highestProduct = currentProduct;
                    System.out.println(highestProduct);
                }
            }
        }
        return highestProduct;
    }
        
    
}
