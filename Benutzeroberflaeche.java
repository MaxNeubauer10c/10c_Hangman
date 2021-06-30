// Spiel Hangman - Benutzeroberflaeche 
// Gruppenarbeit Florian, Manuel, Maxi, Jacob 
import java.io.InputStreamReader; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.lang.Exception; 
public class Benutzeroberflaeche { 
 
public static void doInitialisieren() 
throws Exception { 
// Begrüßung 
System.out.println("Willkommen bei Hangman"); 
} 
public static int getAnzahlBuchstaben() 
throws Exception { 
// Anzahl der Buchstaben eingeben 
System.out.print("Anzahl Buchstaben: "); 
int buchstaben; 
try { 
InputStreamReader r = new InputStreamReader(System.in); 
BufferedReader br = new BufferedReader(r); 
String eingabe = br.readLine(); 
buchstaben = Integer.parseInt(eingabe); 
if ((buchstaben<0) || (buchstaben>9)) { 
throw new Exception("Wertebereich ungueltig!"); 
 
} 
} 
 catch (IOException e){ 
throw new Exception("Eingabe ungueltig!"); 
 } 
return buchstaben; 
} 
public static char getBuchstabeRaten() 
throws Exception { 
// Buchstabe eingeben 
System.out.print("Rate einen Buchstaben: "); 
char buchstabe; 
try { 
InputStreamReader r = new InputStreamReader(System.in); 
BufferedReader br = new BufferedReader(r); 
String eingabe = br.readLine(); 
buchstabe = eingabe.charAt(0); 
if ((buchstabe<97) || (buchstabe>122)) { 
throw new Exception("Kein kleiner Buchstabe!"); 
 } 
} 
 catch (IOException e){ 
throw new Exception("Eingabe ungueltig!"); 
 } 
return buchstabe; 
} 
public static void doWortAnzeigen(String wort) 
throws Exception { 
// Anzeige ausgeben mit Platzhaltern 
System.out.println("Wort = "+wort); 
} 
public static void doGalgenAnzeigen(int fehler) 
throws Exception { 
// Anzeigen Fehler als Galgen 
System.out.println("Galten = "+fehler); 
switch(fehler) { 
case 7: 
System.out.println(" \n" 
+ " +------ \n" 
+ " | | \n" 
+ " | \\ O / \n" 
+ " | \\ | / \n" 
+ " | \\|/ \n" 
+ " | | \n" 
+ " | | \n" 
+ " | / \\ \n" 
+ " | / \\ \n" 
+ " | / \\ \n" 
+ " | \n" 
+ " +--------------- 7 Fehler / Tod !!! \n"); 
break; 
case 6: 
System.out.println(" \n" 
+ " +------ \n" 
+ " | | \n" 
+ " | \\ O / \n" 
+ " | \\ | / \n" 
+ " | \\|/ \n" 
+ " | | \n" 
+ " | | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " +--------------- 6 Fehler / 1 Versuch \n"); 
break; 
case 5: 
System.out.println(" \n" 
+ " +------ \n" 
+ " | | \n" 
+ " | \\ O / \n" 
+ " | \\ | / \n" 
+ " | \\|/ \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " +--------------- 5 Fehler / 2 Versuche \n"); 
break; 
case 4: 
System.out.println(" \n" 
+ " +------ \n" + " | | \n" 
+ " | O \n" 
+ " | | \n" 
+ " | | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " +--------------- 4 Fehler / 3 Versuche \n"); 
break; 
case 3: 
System.out.println(" \n" 
+ " +------ \n" 
+ " | | \n" 
+ " | O \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " +--------------- 3 Fehler / 4 Versuche \n"); 
break; 
case 2: 
System.out.println(" \n" 
+ " +------ \n" 
+ " | | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " +--------------- 2 Fehler / 5 Versuche \n"); 
break; 
case 1: 
System.out.println(" \n" 
+ " +------ \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " +--------------- 1 Fehler / 6 Versuche \n"); 
break; 
case 0: 
System.out.println(" \n" 
+ " + \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" 
+ " | \n" + " | \n" 
+ " | \n" 
+ " +--------------- 0 Fehler / 7 Versuche \n"); 
break; 
default: 
break; 
} 
} 
public static void doEingabeRichtig() { 
// Anzeigen, dass Eingabe richtig war 
System.out.println("Eingabe war richtig."); 
} 
public static void doEingabeFalsch() { 
// Anzeigen, dass Eingabe falsch war 
System.out.println("Eingabe war falsch! Du hast einen Versuch weniger!"); 
} 
public static void doSpielGewonnen() { 
// Anzeigen, dass Spiel gewonnen wurde 
System.out.println("Spiel gewonnen."); 
} 
public static void doSpielVerloren() { 
// Anzeigen, dass Spiel verloren wurde 
System.out.println("Spiel verloren!"); 
} 
 
} 