// Spiel Hangman – Woerterbuch - Gruppenarbeit Florian, Manuel, Maxi, Jacob 
import java.util.Random; 
import java.lang.Exception; 
public class Woerterbuch { 
// Woerterbuch für Spiel Hangman ermittelt zufällige Begriffe 
// https://www.wort-suchen.de/wortlisten/woerter-mit-2-buchstaben
 
public static final int MIN_BUCHSTABEN = 2; // minimale Anzahl Buchstaben 
public static final int MAX_BUCHSTABEN = 3; // maximale Anzahl Buchstaben 
private int getZufallszahl(int min, int max) { 
// Zufallszahl im Bereich [min,max] generieren. 
// Zufallsgenerator abhängig von der Uhrzeit initialisieren. 
Random zufallsgenerator = new Random(); 
zufallsgenerator.setSeed(System.currentTimeMillis()); 
int zufallszahl = zufallsgenerator.nextInt((max - min) + 1) + min; 
return zufallszahl; 
} 
public String getZufallswort(int buchstaben) 
throws Exception { 
// Zufallswort mit Anzahl [buchstaben] generieren. 
// Fehler, wenn kein Wort gefunden werden konnte. 
String zufallswort = null; 
int zufallszahl = getZufallszahl(1,9); 
switch(buchstaben) {
case 0:
case 1:
return getZufallswort();
case 2:
switch(zufallszahl) {
case 1: zufallswort = "ab"; break;
case 2: zufallswort = "du"; break;
case 3: zufallswort = "in"; break;
case 4: zufallswort = "ja"; break;
case 5: zufallswort = "ob"; break;
case 6: zufallswort = "so"; break;
case 7: zufallswort = "um"; break;
case 8: zufallswort = "wo"; break;
default: zufallswort = "zu"; break;
}
break;
case 3:
switch(zufallszahl) {
case 1: zufallswort = "Axt"; break;
case 2: zufallswort = "Bus"; break;
case 3: zufallswort = "Dom"; break;
case 4: zufallswort = "Eis"; break;
case 5: zufallswort = "Fan"; break;
case 6: zufallswort = "Gut"; break;
case 7: zufallswort = "Job"; break;
case 8: zufallswort = "Klo"; break;
default: zufallswort = "Lok"; break;
}
case 4:
switch(zufallszahl) {
case 1: zufallswort = "Bahn"; break;
case 2: zufallswort = "Auto"; break;
case 3: zufallswort = "Haus"; break;
case 4: zufallswort = "Maus"; break;
case 5: zufallswort = "Hand"; break;
case 6: zufallswort = "Lohn"; break;
case 7: zufallswort = "Kiwi"; break;
case 8: zufallswort = "Nein"; break;
default: zufallswort = "Kopf"; break;
}
case 5:
switch(zufallszahl) {
case 1: zufallswort = "Tante"; break;
case 2: zufallswort = "Onkel"; break;
case 3: zufallswort = "Manga"; break;
case 4: zufallswort = "Filme"; break;
case 5: zufallswort = "Spiel"; break;
case 6: zufallswort = "Handy"; break;
case 7: zufallswort = "Wagen"; break;
case 8: zufallswort = "Salat"; break;
default: zufallswort = "Zange"; break;
}

case 6:
switch(zufallszahl) {
case 1: zufallswort = "Cabrio"; break;
case 2: zufallswort = "Backen"; break;
case 3: zufallswort = "hacker"; break;
case 4: zufallswort = "brillen"; break;
case 5: zufallswort = "kaktus"; break;
case 6: zufallswort = "Barren"; break;
case 7: zufallswort = "Ausruf"; break;
case 8: zufallswort = "Aufzug"; break;
default: zufallswort = "Banane"; break;
}
case 7:
switch(zufallszahl) {
case 1: zufallswort = "puzzels"; break;
case 2: zufallswort = "komisch"; break;
case 3: zufallswort = "tablett"; break;
case 4: zufallswort = "absturz"; break;
case 5: zufallswort = "beamter"; break;
case 6: zufallswort = "sportler"; break;
case 7: zufallswort = "boxclub"; break;
case 8: zufallswort = "polizei"; break;
default: zufallswort = "eckball"; break;
}


break; 
default: 
throw new Exception("Kein Wort gefunden!"); 
} 
return zufallswort; 
} public String getZufallswort() 
throws Exception { 
// Zufallswort mit zufälliger Anzahl Buchstaben generieren. 
// Fehler, wenn kein Wort gefunden werden konnte. 
int zufallszahl = getZufallszahl(MIN_BUCHSTABEN,MAX_BUCHSTABEN); 
return getZufallswort(zufallszahl); 
} 
 
 
}