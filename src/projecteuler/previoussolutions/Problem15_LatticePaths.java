/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler.previoussolutions;


import static java.lang.Math.sqrt;

/**
 *
 * @author alex
 */
public class Problem15_LatticePaths {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(latticePath(20,0,0)); 
    //Will probably provide the answer but I realised while the program was running that it is faster to just calculate permuatations of 40 objects (20 of one, 20 of the other)
        
        
        // TODO code application logic here
    }

    public static long latticePath(long gridSize, long currentX, long currentY) {
        long permutations = 0;
        if(currentX < gridSize) {
            permutations += latticePath(gridSize, currentX + 1, currentY);
        }
        if (currentY < gridSize) {
            permutations += latticePath(gridSize, currentX, currentY + 1);
        }
        if ((currentX == gridSize) && (currentY == gridSize)) {
            permutations++;
        }
        System.out.println(permutations);
        return permutations;
    }
    
    
        
    

}

