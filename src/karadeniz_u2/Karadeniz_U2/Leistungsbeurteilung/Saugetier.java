/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karadeniz_u2.Karadeniz_U2.Leistungsbeurteilung;

/**
 *
 * @author SoNGuL
 */
public abstract class Saugetier {
    String name;
    int alter;
    String geschlecht;
    public abstract String printAll();

    public Saugetier(String name, int alter, String geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }
    
}
