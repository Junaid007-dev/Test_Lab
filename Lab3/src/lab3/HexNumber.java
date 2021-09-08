/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

/**
 *
 * @author chaudhary_k
 */
public class HexNumber implements myObserver {
    private number n;

    public HexNumber( number in ) {
        this.n = in;
        n.addObserver( this );
    }

    public void update() {
        System.out.print("\nInteger value in Hexadecimal is ");
        System.out.print(" " + Integer.toHexString(n.getValue() ) );
    }
} 
