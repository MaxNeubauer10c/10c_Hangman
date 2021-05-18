
/**
 * Beschreiben Sie hier die Klasse Spielregeln.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spielregeln
// Spiel Hangman - Spielregeln
// Gruppenarbeit Florian, Manuel, Maxi, Jacob

public class Spielregeln {

    private static String zufallswort;
    private static String anzeigewort;
    private static int fehlerzaehler;

    public static void doSpielZuruecksetzen() {
        zufallswort = "";
        anzeigewort = "";
        fehlerzaehler = 0;
    }        
    
    public static void setSpielStarten(String wort) {
        zufallswort = wort;
        anzeigewort = "";
        for (int i = 0; i < wort.length(); i++) {
            anzeigewort = anzeigewort + "-";
        }
        fehlerzaehler = 0;
    }        

    public String getAnzeigewort() {
        return anzeigewort;
    }        
    
    public boolean isBuchstabeRichtig(char buchstabe) {
        int position_buchstabe = zufallswort.indexOf(buchstabe);
        if (position_buchstabe < 0) {
            fehlerzaehler = fehlerzaehler + 1;
            return false;
        } 
        String anzeigewort_neu = "";
        for (int i = 0; i < zufallswort.length(); i++) {
            if (zufallswort.charAt(i) == buchstabe) {
                anzeigewort_neu = anzeigewort_neu + zufallswort.charAt(i);
            } else {
                anzeigewort_neu = anzeigewort_neu + anzeigewort.charAt(i);
            }
        }
        anzeigewort = anzeigewort_neu;
        return true;
    }        

    public static int getFehlerzaehler() {
        return fehlerzaehler;
    }        

    public boolean isSpielBeendet() {
        if (fehlerzaehler >= 7) {
            return true;
        }
        if (anzeigewort.equals(zufallswort)) {
            return true;
        }
        return false;
    }

    public boolean isSpielVerloren() {
        if (fehlerzaehler >= 7) {
            return true;
        }
        return false;
    }

}