// Spiel Hangman - Spielregeln 
// Gruppenarbeit Florian, Manuel, Maxi, Jacob 
public class Spielregeln { 
// Interne statische Variablen für Daten: 
// zufallswort = das gesuchte zufällig ermittelte Wort 
// anzeigewort = Wort mit Lücken bzw. was erraten wurde 
// fehlerzaehler = Anzahl der falsch geratenen Buchstaben 
private static String zufallswort; 
private static String anzeigewort; 
private static int fehlerzaehler; 
public static void doSpielZuruecksetzen() 
throws Exception { 
// Variablen auf definierten Startwert setzen 
zufallswort = ""; 
anzeigewort = ""; 
fehlerzaehler = 0; 
} 
 
public static void setSpielStarten(String wort) 
throws Exception { 
// startet das Spiel neu und übernimmt das Zufallswort. 
// Beim Anzeigewort werden alle Buchstaben durch "-" ersetzt. 
// Der Fehlerzähler wird auf Null gesetzt. 
zufallswort = wort; 
anzeigewort = ""; 
for (int i = 0; i < wort.length(); i++) { 
anzeigewort = anzeigewort + "-"; 
} 
fehlerzaehler = 0; 
} public String getAnzeigewort() { 
// Gibt das Anzeigewort mit Platzhaltern zurück 
return anzeigewort; 
} 
 
public boolean isBuchstabeRichtig(char buchstabe) { 
// Überprüft, ob der Buchstabe im Wort enthalten ist. 
// Vergleich beider Seiten als kleine Buchstaben. 
// Fehlerzähler erhöhen, wenn Buchstabe nicht vorhanden. 
// Rückgabe falsch, wenn Buchstabe nicht vorhanden. 
String zufallswort_klein = zufallswort.toLowerCase(); 
char buchstabe_klein = Character.toLowerCase(buchstabe); 
int position_buchstabe = zufallswort_klein.indexOf(buchstabe_klein); 
if (position_buchstabe < 0) { 
fehlerzaehler = fehlerzaehler + 1; 
return false; 
} 
// Wenn Buchstabe vorhanden ist, dann Platzhalter im Anzeigewort ersetzen. 
// Jeden Buchstaben einzeln durchgehen und 
// wenn richtig geraten, dann Buchstabe aus Zufallswort übernehmen 
// sonst beleibt Buchstabe aus dem Anzeigewort gleich. 
String anzeigewort_neu = ""; 
char zufallsbuchstabe_klein; 
for (int i = 0; i < zufallswort.length(); i++) { 
zufallsbuchstabe_klein = Character.toLowerCase(zufallswort.charAt(i)); 
if (zufallsbuchstabe_klein == buchstabe_klein) { 
anzeigewort_neu = anzeigewort_neu + zufallswort.charAt(i); 
} else { 
anzeigewort_neu = anzeigewort_neu + anzeigewort.charAt(i); 
} 
} 
anzeigewort = anzeigewort_neu; 
return true; 
} 
public static int getFehlerzaehler() { 
// Fehlerzähler zurückgeben 
return fehlerzaehler; 
} 
public boolean isSpielBeendet() { 
// Prüft, ob das Spielende erreicht wurde. 
// Wahr, wenn Fehlerzähler größer oder gleich 7 
// Wahr, wenn Anzeigewort gleich Zufallswort 
// Sonst ist das Spielende noch nicht erreicht 
if (fehlerzaehler >= 7) { 
return true; 
} 
if (anzeigewort.equals(zufallswort)) { 
return true; 
} 
return false; 
} 
public boolean isSpielVerloren() { 
// Prüft, ob das Spiel verloren wurde. 
// Wahr, wenn Fehlerzähler größer oder gleich 7 
// Sonst wurde das Spielende gewonnen 
if (fehlerzaehler >= 7) { 
return true; 
} 
return false; 
} 
} 
