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
public class Tripoteur {
    //le tripoteur peut trippoter un meuble et un animale

    public void tripote(Tripotable a) {
        System.out.println(this.getClass().getSimpleName() + " " + this.getClass().getDeclaredMethods()[0].getName() + " " + a.getClass().getSimpleName());
        if (a instanceof Animal) {
            ((Animal) a).emettreSon();
            System.out.println(this.getClass().getSimpleName() + " Force " + a.getClass().getSimpleName());
            ((Animal) a).son = " hurle";
        }

    }
}