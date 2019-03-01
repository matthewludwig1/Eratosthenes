/*
    Matthew Ludwig
    28 February 2019
    This program displays a list of prime numbers in between 2 and another integer
*/
package eratosthenes;
import java.util.Scanner; 
import java.util.Arrays;

/**
 *
 * @author malud0519
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Enter the largest number: ");
        int range = Integer.parseInt(inputNum.nextLine());
        boolean numbers [] = new boolean[range]; // prime numbers denoted as true
        System.out.println("The prime numbers in between 2 and " + range );
        Arrays.fill(numbers,true); // default state
        
        for (int j = 2;  j<= numbers.length; j++) {
            // if the number is prime
            if (numbers[j-1] == true) {
                System.out.println(j);
                // if the number at each index is not prime
                for (int k = (int)Math.pow(j, 2); k <= numbers.length; k +=j) {  // every square of j is eliminated
                    numbers[k-1] = false; // each index that isn't prime is eliminated 
                }
            }
        }
    }
}
