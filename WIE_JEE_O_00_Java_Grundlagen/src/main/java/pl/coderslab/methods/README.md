## Aufgabe 1 - zum Lösen mit dem Kursleiter

In der Datei `Main01.java` erstellen Sie eine Methode `public static int multiply(int multipler, int index)`,
die den Wert der Variable `multipler` multipliziert mit dem Wert des Arguments `index` zurückgibt.


## Aufgabe 2

In der Datei `Main02.java` erstellen Sie eine Methode `public static int square(int num)`,
die den Wert `num` hoch zwei zurückgibt.


## Aufgabe 3

In der Datei `Main03.java` erstellen Sie eine öffentliche Methode `convertToUsd`, die den Parameter `eur`, also den Betrag in EUR, annimmt:
Die Methode soll den angegebenen Betrag in US-Dollar zurückgeben. Nehmen Sie den Wechselkurs 1.21 EUR = 1 USD an.


## Aufgabe 4

In der Datei `Main04.java` erstellen Sie eine öffentliche Methode `createName`, die die folgenden Parameter annimmt:

* name: Vorname,
* surname: Nachname,
* nickname: Pseudonym.

Die Methode soll eine Textkette mit Parametern zurückgeben, in der Form: `Vorname Pseudonym Nachname`.


## Aufgabe 5

In der Datei `Main05.java` erstellen Sie eine öffentliche Methode `calculateNet`, die die folgende Argumente annimmt:

* gross: Bruttobetrag des Kaufpreises,
* vat: Wert der Mehrwertsteuer Sie können annehmen, dass VAT eine Fließkommazahl aus dem Bereich 0 &ndash; 1 sein soll.

Die Methode soll den Nettowert des Preises zurückgeben. Schreiben Sie im Kommentar, welche Berechnungen Sie durchführen müssen.


## Aufgabe 6

In der Datei `Main06.java` erstellen Sie eine öffentliche Methode `checkMaturity`, die:

* einen numerischen Parameter `age` annimmt, der das Alter des Benutzers angibt,
* prüft, ob der Benutzer volljährig ist,
* den Wert `true` zurückgibt, wenn der Benutzer volljährig ist,
* den Wert `false` zurückgibt, wenn der Benutzer nicht volljährig ist.


## Aufgabe 7

In der Datei `Main07.java` erstellen Sie eine öffentliche Methode `checkEvenOdd`, die:

* den numerischen Parameter `number` annimmt,
* einen Wert vom Typ `String` zurückgibt,
* das Ergebnis `even` zurückgibt, wenn die Zahl gerade ist,
* das Ergebnis `odd` zurückgibt, wenn die Zahl ungerade ist,


## Aufgabe 8

In der Datei `Main08.java` erstellen Sie eine öffentliche Methode `maxOfThree`, die drei numerische Parameter annimmt. Die Methode soll die größte Zahl zurückgeben.


## Aufgabe 9

In der Datei `Main09.java` erstellen Sie eine öffentliche Methode `factorial`, die als Parameter eine natürliche Zahl `n` annimmt. Die Methode soll den Wert *n!* zurückgeben,
d.h. das Ergebnis der Multiplikation aller natürlichen Zahlen im Bereich 1...n.


## Aufgabe 10 (zusätzlich)

Wenn Fußballverein A ein Hin- und Rückspiel gegen Fußballverein B spielt, bedeutet dies, dass ein Spiel auf dem Spielfeld der Mannschaft A und ein Spiel auf dem Spielfeld der Mannschaft B stattfindet.

Die Mannschaft, die in beiden Spielen mehr Tore erzielt, gewinnt.

Wenn beide Mannschaften die gleiche Anzahl an Toren erzielt haben, zählen Auswärtstore als wichtiger
und die Mannschaft, die mehr Auswärtstore erzielt hat, gewinnt.

Ein Unentschieden in einem Hin- und Rückspiel liegt vor, wenn beide Mannschaften die gleiche Anzahl von Toren und die gleiche Anzahl von Auswärtstoren erzielt haben.

----
**Zum Beispiel:**

Im Pokal von Polen spielen zwei Mannschaften: **Thunder** und **Lightning**. Sie haben folgende Spiele gespielt:

**Heimmannschaft: Thunder.**

Thunder 0:2 Lightning

**Heimmannschaft: Lightning.**

Lightning 1:3 Thunder

Das Gesamtergebnis des Hin- und Rückspiels beträgt 3:3. Allerdings erzielte Thunder im Auswärtsspiel 3 Tore und Lightning nur 2. Also Thunder gewinnt.

----

Schreiben Sie eine Methode `footballWin`, die folgende Parameter annimmt:

* Tore, die Mannschaft A im ersten Spiel erzielt hat (auf dem Spielfeld von Mannschaft A),
* Tore, die Mannschaft B im ersten Spiel erzielt hat (auf dem Spielfeld von Mannschaft A),
* Tore, die Mannschaft A im zweiten Spiel erzielt hat (auf dem Spielfeld von Mannschaft B),
* Tore, die Mannschaft B im zweiten Spiel erzielt hat (auf dem Spielfeld von Mannschaft B),

Die Methode soll 1 zurückgeben, wenn das Hin- und Rückspiel von Team A gewonnen wurde und 2 wenn es von B gewonnen wurde. Im Falle eines Unentschiedens wird X zurückgegeben.
Das Ergebnis soll eine Zeichenkette sein, keine Zahl!
