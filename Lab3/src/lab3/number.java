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
public class number extends mySubject{
    private int value;

    public int getValue(){ return value; }
    
    public void setValue( int in ){
        value = in;
        notifyObservers();
    }
}

