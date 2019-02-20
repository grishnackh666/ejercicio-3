
package perfectprimefactorlist;

import java.util.Scanner;


public class PerfectPrimeFactorList {

    
        public int[] isProductOfPrimeFactors(int aPosInt) {
        int n = aPosInt;
        int factorprime[] = new int[aPosInt];
        for (int i = 2; i <= n/i; i++) {
            while (n % i == 0) {
                factorprime [i] = i;
                n /= i;
            }
        }
        return factorprime;
    }

    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("Introduzca el límite superior: ");
        int aPosInt = ac.nextInt();
        
        for(int i = 0; i < factorprime.length; i++){
            System.out.println("Estos números son iguales al producto de factores primos: ");
            System.out.println(" "+factorprime[i]);
    } 
        
        
        
        
        
        
        
        
        
        
        
        }
    }
    
   
