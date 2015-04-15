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
public class ProjectEule {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sundays());
        
        
        // TODO code application logic here
    }
    
    public static int sundays(){
        int day = 2;
        int sundays = 0;
        for (int i = 1901; i < 2001; i++){
            for (int j = 1; j < 13; j++){
                if (day ==  0){
                    sundays++;
                }
                if ((j == 2) && (i%4 == 0) && ((!(i%100==0)) || (i%400 == 0))){
                    day += 29;
                } else{
                    switch(j){
                        case 1: day += 31;
                            break;
                        case 2: day += 28;
                            break;
                        case 3: day += 31;
                            break;
                        case 4: day += 30;
                            break;
                        case 5: day += 31;
                            break;
                        case 6: day += 30;
                            break;
                        case 7: day += 31;
                            break;
                        case 8: day += 31;
                            break;
                        case 9: day += 30;
                            break;
                        case 10: day += 31;
                            break;
                        case 11: day += 30;
                            break;
                        case 12: day += 31;
                            break;
                    }
                }
                day = day%7;
            }
        }
        return sundays;
    }
    
    
        
    

}

