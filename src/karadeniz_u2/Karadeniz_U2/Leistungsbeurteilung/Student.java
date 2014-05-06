/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package karadeniz_u2.Karadeniz_U2.Leistungsbeurteilung;

/**
 *
 * @author SoNGuL
 */
public class Student extends Kind {
    int matrikelnummer; 
    String studiengang;
    
    public Student(int matrikelnummer, String studiengang, String vorname, String nachname, int alter) {
        super(vorname, nachname, alter);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }
    
    @Override
    public void Status(){
        System.out.println("Es handelt sich um einen Studenten "+ vorname+ " "+ nachname+ " "+ alter+" "+matrikelnummer+ " "+studiengang);
    }
    
    
    // main Methode
    
    public static void main (String [] args){
        
        
        Kind k = new Kind ("Muster", "Mann", 20);
        k.Status();
        
        k = new Student (123456789, "WEB Business & Technology","Muster", "Mann", 20);
        k.Status();
        
    }
}