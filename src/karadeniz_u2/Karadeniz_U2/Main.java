/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karadeniz_u2.Karadeniz_U2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import karadeniz_u2.Karadeniz_U2.Fahrzeug.color;

/**
 *
 * @author SoNGuL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Auto bmw = new Auto((short) 4, (short) 220, color.Silber, (short) 5, (short) 0, (short) 4);
        
        Auto audi = new Auto((short) 4, (short) 220, color.Schwarz, (short) 5, (short) 0, (short) 4);
        
        Wasserfahrzeug titanic = new Wasserfahrzeug((short) 0, (short) 51.000, color.Blau, (short) 0, (short) 0, (short) 10.54, (short) 3, (short) 100.000);
        
    System.out.println(bmw.getReifen() + " Reifen, Farbe " + bmw.getFarbe() + ", " + bmw.getPs() + "PS, " + bmw.getTueren() + " Tueren, " + bmw.getAirbags() + " Airbags.");
    System.out.println(audi.getReifen() + " Reifen, Farbe " + audi.getFarbe() + ", " + audi.getPs() + "PS, " + audi.getTueren() + " Tueren, " + audi.getAirbags() + " Airbags.");
    System.out.println(titanic.getReifen() + " Reifen, Farbe " + titanic.getFarbe() + ", " + titanic.getPs() + ", " + titanic.getTueren() + "Tueren, " + titanic.getTiefgang() + "m Tiefgang," + titanic.getSchrauben() + " Schrauben," + titanic.getLadung() + "kg Ladung"); bmw.toString();
        
        //Aufgabe 4
        Auto audi2 = new Auto((short) 4, (short) 200, color.Rot, (short) 5, (short) 0, (short) 4);
        Auto audi3 = new Auto((short) 4, (short) 180, color.Weiß, (short) 5, (short) 0, (short) 4);
        Auto audi4 = new Auto((short) 4, (short) 270, color.Blau, (short) 5, (short) 0, (short) 4);

        //Aufgabe 4
        List<Auto> liste = new ArrayList <>();
        
        liste.add(audi);
        liste.add(bmw);
        liste.add(audi2);
        liste.add(audi3);
        liste.add(audi4);
        
        Collections.sort(liste);


        for (Auto a : liste) {
            //System.out.println(a.getPs());
            
            System.out.println(a.toString());
        }


    }
}
