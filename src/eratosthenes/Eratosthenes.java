/*
    Matthew Ludwig
    28 February 2019
    This program displays a list of prime numbers in between 1 and 1000
*/
package erastothenes;

/**
 *
 * @author malud0519
 */
public class Erastothenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean numbers [] = new boolean[1000]; // prime numbers denoted as true
        // sets each value to be true
        System.out.println("The prime numbers in between 1 and 1000 are: ");
        for (int i = 1; i < numbers.length; i++) {
           numbers[i] = true;
        }  
       
        for (int j = 2;  j<= numbers.length; j++) {
            // if the number is prime
            if (numbers[j-1] == true) {
                System.out.println(j);
                // if the number at each index is not prime
                for (int k = (int)Math.pow(j, 2); k <= numbers.length; k +=j) {
                    numbers[k-1] = false;
                }
            }
        }
    }
}
