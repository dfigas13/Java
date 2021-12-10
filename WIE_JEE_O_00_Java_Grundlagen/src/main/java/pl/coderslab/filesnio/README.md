## Aufgabe 1 - zum Lösen mit dem Kursleiter

In der Datei `Main01.java` erstellen Sie eine Methode mit der Signatur `public static void createDirectory(String fileName)`.

1. Ergänzen Sie den Block der Methode so, dass sie ein Verzeichnis mit dem angegebenen Namen erstellt.
2. Überprüfen Sie, ob das Verzeichnis nicht bereits vorhanden ist.
3. Verwenden Sie die Methoden der Klassen aus dem Paket `java.nio.file`: `Files.exists(directory)` und `Files.createDirectory(directory);`.


## Aufgabe 2

In der Datei `Main02.java` erstellen Sie eine Methode mit der Signatur `public static void createFile (String fileName)`.

1. Ergänzen Sie den Block der Methode so, dass sie eine Datei mit dem angegebenen Namen erstellt.
2. Überprüfen Sie, ob die Datei nicht bereits vorhanden ist,
3. verwenden Sie Methoden der Klasse `java.nio.file` .


## Aufgabe 3

In der Datei `Main03.java` erstellen Sie eine Methode mit der Signatur `public static void copyFile(String directory, String fileName, String secondFileName)`.  
Danach:  

1. Ergänzen Sie den Block der Methode so, dass sie aus dem Verzeichnis `directory` eine Datei mit dem Namen `fileName` in eine Datei mit dem Namen `secondFileName` kopiert.
2. Überprüfen Sie, ob die Datei nicht bereits vorhanden ist.


## Aufgabe 4

In der Datei `Main04.java` erstellen Sie eine Methode mit der Signatur `public static void writeToFile(String fileName)`.  
Vervollständigen Sie den Block der Methode so, dass sie:

1. eine Datei mit dem Namen `fileName` erstellt (wenn sie nicht vorhanden ist). 
2. ganze Zeilen von der Konsole abliest und sie in einer Datei speichert. Verwenden Sie eine entsprechende Methode der Klasse `Scanner`.


## Aufgabe 5

In der Datei `Main05.java` erstellen Sie eine Methode mit der Signatur `public static void readFromFile(String fileName)`.  
Vervollständigen Sie den Block der Methode so, dass sie:

1. den Inhalt der im Methodenparameter angegebenen Datei abliest (prüfen Sie, ob die Quelldatei existiert),
2. eine neue Datei mit der Erweiterung `html` und dem gleichen Namen wie die zu ladende Datei erstellt,
3. Daten in die neue Datei als `html` eingibt, wobei jede Zeile der geladenen Datei im <p>-Tag stehen wird.

Beispiel:
```html
<html>
<body>
<p>first line</p>
<p>second line</p>
</body>
</html>

```
