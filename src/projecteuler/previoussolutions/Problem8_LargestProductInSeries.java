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
public class Problem8_LargestProductInSeries {
    public static int seriesProduct(String series){
        int highestProduct = 0;
        int[] seriesInt = new int[series.length()];
        for (int i = 0; i< series.length(); i++) {
            seriesInt[i] = (series.charAt(i)-48);
            System.out.println(seriesInt[i]);
        }
        for (int j = 12; j<series.length(); j++){
            if ((seriesInt[j] * seriesInt[j-1] * seriesInt[j-2] * seriesInt[j-3] * seriesInt[j-4] * seriesInt[j-5] * seriesInt[j-6] * seriesInt[j-7] * seriesInt[j-8] * seriesInt[j-9] * seriesInt[j-10] * seriesInt[j-11] * seriesInt[j-12]) > highestProduct) {
               highestProduct =  (seriesInt[j]* seriesInt[j-1] * seriesInt[j-2] * seriesInt[j-3] * seriesInt[j-4] * seriesInt[j-5] * seriesInt[j-6] * seriesInt[j-7] * seriesInt[j-8] * seriesInt[j-9] * seriesInt[j-10] * seriesInt[j-11] * seriesInt[j-12]);
               System.out.println(highestProduct);
               System.out.println(j);
               System.out.println(seriesInt[j]);
            }
        }
        return highestProduct;
    }
}
