/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karadeniz_u2.Karadeniz_U2.Leistungsbeurteilung;

/**
 *
 * @author SoNGuL
 */
public class Mensch extends Saugetier{

    public Mensch(String name, int alter, String geschlecht){
        super (name, alter, geschlecht);
    }
    
    public String printAll(){
        return name + " # " + alter + " # " + geschlecht;
    }
    
    //Main Methode
    
    public static void main (String [] args){
        
        Mensch m = new Mensch ("Songül", 100, "W");
        System.out.println(m.printAll());
    } 
}
