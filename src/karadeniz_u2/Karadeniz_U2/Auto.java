/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karadeniz_u2.Karadeniz_U2;

/**
 *
 * @author SoNGuL
 */
public class Auto extends Fahrzeug implements Comparable<Auto> {

    private boolean klimaanlage;
    private short airbags;

    public Auto(short reifen, short ps, color farbe, short tueren, short geschwindigkeit, short airbags) {
        super(reifen, ps, farbe, tueren, false, geschwindigkeit);
        this.klimaanlage = false;
        this.airbags = airbags;

    }

    public void klimaanlageAn() {

        if (klimaanlage = false) {
            klimaanlage = true;
        } else {
            System.out.println("Klimaanlage läuft bereits");
        }
    }

    public void klimaanlageAus() {
        if (klimaanlage = true) {
            klimaanlage = false;
        } else {
            System.out.println("Klimaanlage ist bereits aus");
        }
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    @Override
    public String toString() {
        //return "Auto{" + "klimaanlage=" + klimaanlage + ", airbags=" + airbags + '}';
        return "PS = "+ super.getPs() ;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }

    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    //Aufgabe 4
    @Override
    public int compareTo(Auto x) {
        
        if (this.getPs() < x.getPs()){
            return 1;
        }
        else if (this.getPs() > x.getPs()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
