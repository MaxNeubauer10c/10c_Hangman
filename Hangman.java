import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Hangman {
    
    private static Woerterbuch woerterbuch;
    private static Benutzeroberflaeche benutzeroberflaeche;
    private static Spielregeln spielregeln;
    
    private static int anzahlbuchstaben;
    private static String zufallswort;
    private static char buchstabe;
    private static int fehlerzaehler;
    
    public static void main(String[] args) {

        woerterbuch = new Woerterbuch();
        benutzeroberflaeche = new Benutzeroberflaeche();
        spielregeln = new Spielregeln();

        spielregeln.doSpielZuruecksetzen();
        benutzeroberflaeche.doInitialisieren();
        
        anzahlbuchstaben = benutzeroberflaeche.getAnzahlBuchstaben(); 
        zufallswort = woerterbuch.getZufallswort(anzahlbuchstaben);
        spielregeln.setSpielStarten(zufallswort);

        do {
            benutzeroberflaeche.doWortAnzeigen(spielregeln.getAnzeigewort());
            buchstabe = benutzeroberflaeche.getBuchstabeRaten();
            if (spielregeln.isBuchstabeRichtig(buchstabe)) {
                benutzeroberflaeche.doEingabeRichtig();
            } else {
                benutzeroberflaeche.doEingabeFalsch();
            }
            fehlerzaehler = spielregeln.getFehlerzaehler();
            benutzeroberflaeche.doGalgenAnzeigen(fehlerzaehler);
        }
        while (spielregeln.isSpielBeendet()==false);
        
        benutzeroberflaeche.doWortAnzeigen(zufallswort);
        if (spielregeln.isSpielVerloren()) {
            benutzeroberflaeche.doSpielVerloren();
        } else {
            benutzeroberflaeche.doSpielGewonnen();
        }

    }
    
}