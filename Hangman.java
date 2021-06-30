// Spiel Hangman – Hauptprogrammklasse - Gruppenarbeit Florian, Manuel, Maxi, Jacob 
import java.lang.Exception; 
import java.io.IOException; 
public class Hangman { 
 
// Interne statische Subklassen für Funktionalität: 
// Wörterbuch = zufälliges Wort ermitteln 
// Benutzeroberfläche = Eingabe und Ausgabe für Benutzer 
// Spielregeln = Regeln und Spielzustand von Hangmen 
private static Woerterbuch woerterbuch; 
private static Benutzeroberflaeche benutzeroberflaeche; 
private static Spielregeln spielregeln; 
// Interne statische Variablen für Daten: 
// anzahlbuchstaben = Anzahl Buchstaben des zu ratenden Wortes 
// zufallswort = das gesuchte zufällig ermittelte Wort 
// buchstabe = vom Benutzer geratener Buchstabe 
// fehlerzaehler = Anzahl der falsch geratenen Buchstaben 
private static int anzahlbuchstaben; 
private static String zufallswort; 
private static char buchstabe; 
private static int fehlerzaehler; 
 
public static void main(String[] args) 
throws Exception { 
// Objekte erzeugen 
woerterbuch = new Woerterbuch(); 
benutzeroberflaeche = new Benutzeroberflaeche(); 
spielregeln = new Spielregeln(); 
// Spiel initialisieren 
spielregeln.doSpielZuruecksetzen(); 
benutzeroberflaeche.doInitialisieren(); 
 
// Zufallswort ermitteln 
anzahlbuchstaben = benutzeroberflaeche.getAnzahlBuchstaben(); 
zufallswort = woerterbuch.getZufallswort(anzahlbuchstaben); 
spielregeln.setSpielStarten(zufallswort); 
// Buchstaben raten 
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
 
// Spielende 
benutzeroberflaeche.doWortAnzeigen(zufallswort); 
if (spielregeln.isSpielVerloren()) { 
benutzeroberflaeche.doSpielVerloren(); 
} else { 
benutzeroberflaeche.doSpielGewonnen(); 
} 
} 
}