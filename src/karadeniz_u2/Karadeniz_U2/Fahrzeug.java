/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karadeniz_u2.Karadeniz_U2;

/**
 *
 * @author SoNGuL
 */
public class Fahrzeug {

    private short reifen;
    private short ps;
    private color farbe;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    public static int anzahl;
 // Aufgabe 5
    public enum color {

        Silber, Rot, Schwarz, Blau, Weiß
    }

    public Fahrzeug(short reifen, short ps, color farbe, short tueren, boolean gestartet, short geschwindigkeit) {
        this.reifen = reifen;
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = gestartet;
        this.geschwindigkeit = geschwindigkeit;
        anzahl++;

    }

    public void starten() {
        gestartet = true;
    }

    public void stoppen() {
        gestartet = false;
    }

    public void beschleunigen(short geschwindigkeit) {
        if (gestartet) {
            this.geschwindigkeit += geschwindigkeit;
        }

        if (geschwindigkeit > 250) {
            this.geschwindigkeit = 250;
        }
    }

    public void bremsen(short geschwindigkeit) {
        if (gestartet) {
            this.geschwindigkeit -= geschwindigkeit;
        }

        if (geschwindigkeit < 0) {
            this.geschwindigkeit = 0;
        }
    }

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static void setAnzahl(int anzahl) {
        Fahrzeug.anzahl = anzahl;
    }

    public short getReifen() {
        return reifen;
    }

    public short getPs() {
        return ps;
    }

    public short getTueren() {
        return tueren;
    }

    public boolean isGestartet() {
        return gestartet;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public void setFarbe(color farbe) {
        this.farbe = farbe;
    }

    public color getFarbe() {
        return farbe;
    }
}