public class Hangman {
// interne Unterklassen für Funktionalität:
private static Woerterbuch woerterbuch; // zufälliges Wort ermitteln
private static Spielregeln spielregeln; // Regeln und Spielstand
private static Benutzeroberflaeche benutzeroberflaeche; // Ein- und Ausgaben
// interne Variablen für Daten:
private static int anzahlbuchstaben; // Buchstaben des zu ratenden Wortes
private static String zufallswort; // gesuchtes zufälliges Wort im Klartext
private static char buchstabe; // eingegebener geratener Buchstabe
private static int fehlerzaehler; // Anzahl falsch geratener Buchstaben
public static void main(String[] args)
throws Exception {
// Objekte erzeugen
woerterbuch = new Woerterbuch();
spielregeln = new Spielregeln();
benutzeroberflaeche = new BenutzeroberflaecheKonsole();
// Spiel initialisieren
spielregeln.doSpielZuruecksetzen();
benutzeroberflaeche.doInitialisieren();
// Zufallswort ermitteln (solange wiederholen, bis kein Eingabefehler)
zufallswort = null;
while (zufallswort == null) {
try { // Fehler Benutzeroberfläche+Wörterbuch abfangen
anzahlbuchstaben = benutzeroberflaeche.getAnzahlBuchstaben();
zufallswort = woerterbuch.getZufallswort(anzahlbuchstaben);
}
catch (Exception e) {
benutzeroberflaeche.doFehlermeldung(e.toString());
}
}
spielregeln.setSpielStarten(zufallswort);
// Buchstaben raten (solange wiederholen, bis Spielende)
benutzeroberflaeche.doAusgabeLoeschen();
benutzeroberflaeche.doGalgenAnzeigen(0);
do {
// Wort mit Platzhaltern anzeigen und Buchstabe eingeben
benutzeroberflaeche.doWortAnzeigen(spielregeln.getAnzeigewort());
buchstabe = 0;
while (buchstabe == 0) {
try { // Fehler von Benutzeroberfläche abfangen
buchstabe = benutzeroberflaeche.getBuchstabeRaten();
}
catch (Exception e) {
benutzeroberflaeche.doFehlermeldung(e.toString());
}
}
// Buchstabe prüfen und Galgen ausgeben
benutzeroberflaeche.doAusgabeLoeschen();
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