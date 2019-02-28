/*
    Matthew Ludwig
    28 February
 */

package eratosthenes;

/**
 *
 * @author malud0519
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean numbers [] = new boolean[1000];
       
        for (int i = 1; i < numbers.length; i++) {
           numbers[i] = true;
           for (int j = i + i + 1; j < numbers.length; j++) {
               if (j % i + 1  == 0) {
                  numbers[i] = false;
               }
           }
 // could use a while statements
          System.out.println(i + 1);
      }  
    }
}
