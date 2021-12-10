## Aufgabe 1

Die Caesar-Verschlüsselung ist die Chiffre, die Julius Caesar zur Verschlüsselung seiner Briefe an Cicero verwendete.

Im Paket „pl.coderslab.homeworks.strings“ in der Datei „Main01.java“ erstellen Sie eine Methode mit der Signatur „public static String encode(String str)“:
 
1. Ergänzen Sie den Methodenblock, so dass die Methode sie Zeichenfolge zurückgibt, die mit der Caesar-Chiffre verschlüsselt ist.  



## Aufgabe 2

Im Paket „pl.coderslab.homeworks.strings“ in der Datei „Main02.java“ modifizieren Sie die Methode aus der Hausaufgabe 1 mit der Signatur „public static String encode(String str, int shift)“:
 
1. „shift“ bedeutet Verschiebung von Zeichen
2. Fügen Sie eine Methode „public static String decode(String str, int shift)“ hinzu, die der Verschlüsselung dient .


## Aufgabe 3

Im Paket „pl.coderslab.homeworks.strings“ in der Datei „Main03.java“ erstellen Sie eine Methode mit der Signatur „public static String upperCase(String str, int index)“:

1. Die Methode gibt die Zeichenfolge „str“ zurück, in der die Zeichen ab durch „index“ teilbaren Positionen in große Buchstaben umgewandelt wurden.


## Aufgabe 4

Im Paket „pl.coderslab.homeworks.strings“ in der Datei „Main04.java“ erstellen Sie eine Methode mit der Signatur „public static int tripple(String str)“: 
1. Die Methode gibt die Anzahl der der dreimaligen Vorkommen der Zeichen in der Zeichenfolge zurück

Beispiel für qazbbbwsx -> 1, für aaawsxbbb ->2


## Aufgabe 5

Im Paket „pl.coderslab.homeworks.strings“ in der Datei „Main05.java“ erstellen Sie eine Methode mit der Signatur „public static String replaceChar(String str, char forReplace, char replacement)“:

1. Ergänzen Sie den Methodenblock, so dass die Methode die Zeichenfolge zurückgibt, die sich aus der Ersetzung
  aller „forReplace“-Zeichen durch „replacement“-Zeichen in der Zeichenfolge „str“ ergibt.


## Aufgabe 6

Im Paket „pl.coderslab.homeworks.strings“ in der Datei „Main06.java“ erstellen Sie eine Methode mit der Signatur „public static String replaceStr(String str, String forReplace, String replacement)“:

1. Ergänzen Sie den Methodenblock, so dass die Methode die Zeichenfolge zurückgibt, die sich aus der Ersetzung
 aller Vorkommen von der „forReplace“-Zeichenfolge durch die „replacement“-Zeichenfolge ergibt.


## Aufgabe 7

Im Paket „pl.coderslab.homeworks.strings“ in der Datei „Main07.java“ erstellen Sie eine Methode mit der Signatur „public static String censor(String str, String[] words)“:

1. Die Methode:

* wandelt eine Textzeichenfolge in einen Array mit Wörtern um,
* überprüft, ob sie keine verbotenen Wörter enthält, die im Array „words“ enthalten sind,
* wenn sie vorkommen, wird sie sie in vier Sterne (****) umwandeln
* danach wandelt sie den Array wieder in einen String um und gibt den Wert zurück.
