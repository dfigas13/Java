## Aufgabe 1

Im Paket „pl.coderslab.homeworks.datainput“ in der Datei „Main01.java“ erstellen Sie ein Programm, das:

1. die Daten von der Konsole lädt:
```
Nachname Vorname Geburtsjahr Geschlecht:
```
2. Die Daten werden geladen, bis **quit** auf der Konsole eingegeben wird. Speichern Sie die Daten in einem Array vom Typ **String**.

3. Nach der Eingabe von **quit** erstellen Sie mit diesen Daten einen zweiten Array, die nur die Personen enthält, die in den Ruhestand gehen können.
Für Frauen ist es 60 Jahre, für Männer 65 Jahre.
Geben Sie die Daten als „Name + Nachname“ ein.

3. Der Code sollte in der Methode mit der Signatur
 „public static String[] retirement()“ enthalten werden.

Beispiellinien mit eingegebenen Daten:

```
Kowalski Marek 1955 M
Krzak Marianna 1966 K
Kamil Kowalski 2020 M
```


## Aufgabe 2

Im Paket „pl.coderslab.homeworks.datainput“ in der Datei „Main02.java“ erstellen Sie eine Methode mit der Signatur „public static int[] sortedArray()“:

1. Ergänzen Sie den Methodenkörper, so dass die Methode von der Konsole abliest, wieviel zahlen verlost werden sollten.
2. Sie erstellt einen Array gibt zufällige Werte aus dem Bereich [0,100] in ihn ein.
3. Sie sortiert die Array-Elemente und gibt sie zurück.


## Aufgabe 3

Im Paket „pl.coderslab.homeworks.datainput“ in der Datei „Main03.java“ erstellen Sie eine Methode mit der Signatur „public static void printTriangle()“:

1. Ergänzen Sie den Methodenkörper, so dass die Methode einen Wert des Typs „int“ von der Konsole abliest.
2. Sie zeigt ein Dreieck auf der Konsole an, das aus „x“-Zeichen besteht, wobei beide Katheten gleich dem abgelesenen Wert sind
Beispiel für den abgelesenen Wert 5.

````
x
x x
x x x
x x x x 
x x x x x
````


## Aufgabe 1

Im Paket „pl.coderslab.homeworks.strings“ in der Datei „Main01.java“ erstellen Sie eine Methode mit der Signatur „public static int count(String fileName)“:

1. Ergänzen Sie den Methodenkörper, so dass die Methode die Zeichen aus der Datei zählt und die Anzahl zurückgibt.


## Aufgabe 2

Im Paket „pl.coderslab.homeworks.strings“ in der Datei „Main02.java“ erstellen Sie eine Methode mit der Signatur „public static int count(String fileName)“:

1. Ergänzen Sie den Methodenkörper, so dass die Methode die Wörter aus der Datei zählt und die Anzahl zurückgibt.


## Aufgabe 3

Im Paket „pl.coderslab.homeworks.strings“ in der Datei „Main03.java“ erstellen Sie eine Methode mit der Signatur „public static boolean checkFileExist()“:

1. Ergänzen Sie den Methodenkörper, so dass sie den Dateinamen aus der Konsole abliest.
2. Die Methode soll überprüfen, ob die Datei existiert und dann „true“ oder „false“ anzeigen.


## Aufgabe 4

Im Paket „pl.coderslab.homeworks.strings“ in der Datei „Main04.java“ erstellen Sie eine Methode mit der Signatur „public static boolean rewrite()“:
1. Ergänzen Sie den Methodenkörper, so dass sie den Dateinamen aus der Konsole abliest.
2. Die Methode überprüft, ob die Datei existiert und wenn ja, erstellt eine zweite Datei mit dem Suffix „_2“,
 in der der Inhalt der Vorlagedatei zweimal gespeichert wird.

Beispiel: 
Der geladene Name der Datei mit dem Inhalt „abc“ ist „text1.txt“. Es wird eine Datei mit dem Namen „text1_2.txt“ mit dem folgenden Inhalt erstellt:
````
abc
abc
````
