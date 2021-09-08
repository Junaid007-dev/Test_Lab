/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author chaudhary_k
 */
public class Lab3 {
  /**
   * @param args the command line arguments
   */
  public static void main( String[] args ) {
    number n = new number();
    Scanner in = new Scanner(System.in);

    System.out.print("\nEnter an integer to convert in the program.");
    System.out.print("\nEnter a string to exit the program.");

    new BinNumber(n);
    new OctoNumber(n);
    new HexNumber(n);
    new Radix3(n);
    
    while (true) {
      System.out.print( "\n\nEnter a number: " );

      try {
        n.setValue( in.nextInt() );
      } 

      catch (InputMismatchException input_ecep) {
        System.out.println("\nExiting program !!!");
        System.exit(0);
      }
    }
  } 
}
