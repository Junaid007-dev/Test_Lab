/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

import java.util.ArrayList;

/**
 *
 * @author chaudhary_k
 */
public class mySubject{
    private ArrayList<myObserver> observers = new ArrayList<myObserver>();

    public void addObserver( myObserver obs ){
        observers.add(obs);
    }

    public void removeObserver(myObserver obs){
        observers.remove(obs);
    }

    protected void notifyObservers() {
        for (int i=0; i < observers.size(); i++)
            observers.get(i).update();
    }
}