package exercices.heritage;

import exercices.core.Application;
import exercices.heritage.animaux.entities.Animal;
import exercices.heritage.animaux.entities.Tripoteur;
import exercices.heritage.animaux.entities.impl.Chat;
import exercices.heritage.animaux.entities.impl.Chien;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hicham
 */
public class Heritage extends Application{

    @Override
    public void start() {
        Animal chien = new Chien();
        Animal chat = new Chat();
        Tripoteur t = new Tripoteur();

        chien.emettreSon();
        t.tripote(chien);
        chien.emettreSon();
        chat.emettreSon();
        t.tripote(chat);
        chat.emettreSon();
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
