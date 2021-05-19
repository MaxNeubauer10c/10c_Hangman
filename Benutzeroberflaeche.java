import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Benutzeroberflaeche {
    
    public static void doInitialisieren() {
        System.out.println("Hangman");
    }

    public static int getAnzahlBuchstaben() {
        System.out.print("Anzahl: ");
        int buchstaben = 0;
        try {
            InputStreamReader r = new InputStreamReader(System.in);  
            BufferedReader br = new BufferedReader(r);  
            String eingabe = br.readLine();
            buchstaben = Integer.parseInt(eingabe);
        } 
        catch (IOException e){
            System.out.println("Fehler: "+e.toString());
        }
        return buchstaben;
    }

    public static char getBuchstabeRaten() {
        System.out.print("Buchstaben: ");
        char buchstabe = '?';
        try {
            InputStreamReader r = new InputStreamReader(System.in);  
            BufferedReader br = new BufferedReader(r);  
            String eingabe = br.readLine();
            buchstabe = eingabe.toLowerCase().charAt(0);
        } 
        catch (IOException e){
            System.out.println("Fehler: "+e.toString());
        }
        return buchstabe;
    }

    public static void doWortAnzeigen(String wort) {
        System.out.println("Wort = "+wort);
    }

    public static void doGalgenAnzeigen(int fehler) {
        System.out.println("Galgen = "+fehler);
    }

    public static void doEingabeRichtig() {
        System.out.println("richtig");
    }

    public static void doEingabeFalsch() {
        System.out.println("falsch!");
    }

    public static void doSpielGewonnen() {
        System.out.println("gewonnen");
    }

    public static void doSpielVerloren() {
        System.out.println("verloren!");
    }
    
}