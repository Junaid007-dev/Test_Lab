package lab3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chaudhary_k
 */
public class BinNumber implements myObserver {
    private number n;

    private BinNumber( ) {
        ;
    }

    public BinNumber( number in ) {
        this.n = in;
        n.addObserver( this );
    }

    public void update() {
        System.out.print("Integer value in Binary is ");
        System.out.print( " " + Integer.toBinaryString(n.getValue() ) );
    }
} 