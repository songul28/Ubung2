/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karadeniz_u2.Karadeniz_U2;

/**
 *
 * @author SoNGuL
 */
public class Wasserfahrzeug extends Fahrzeug {

    private double tiefgang;
    private short schrauben;
    private double ladung;

    public Wasserfahrzeug(short reifen, short ps, color farbe, short tueren, short geschwindigkeit, double tiefgang, short schrauben, double ladung) {
        super(reifen, ps, farbe, tueren, false, geschwindigkeit);
        this.tiefgang = tiefgang;
        this.schrauben = schrauben;
        this.ladung = ladung;
    }

    public void entladen() throws InterruptedException {
        ladung = 0;
        Thread.sleep(5000);
    }

    public void setTiefgang(double tiefgang) {
        this.tiefgang = tiefgang;
    }

    public void setSchrauben(short schrauben) {
        this.schrauben = schrauben;
    }

    public void setLadung(double ladung) {
        this.ladung = ladung;
    }

    public double getTiefgang() {
        return tiefgang;
    }

    public short getSchrauben() {
        return schrauben;
    }

    public double getLadung() {
        return ladung;
    }
}
