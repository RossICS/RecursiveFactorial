/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursivefactorial;

/**
 *
 * @author rkaune
 */
public class RecursiveFactorial {

    public static void main(String[] args) {
       long num = 26;
       System.out.println("Factorial (" + num + "!) is " + fact(num));
    }

    static public long fact (long n) {
        if (n == 0 || n ==1) {
            return 1;
        } else {
            return (n * fact(n-1));
        }
    }
    
}
