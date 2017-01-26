/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage.animaux.entities;

import exercices.heritage.Tripotable;

/**
 *
 * @author hicham
 */
public abstract class Animal implements Tripotable{
    public String son = "";
    public void emettreSon(){
        System.out.println("Le " + this.getClass().getSimpleName()+" "+ son);
    }
}
