Denken Sie daran, die Lösungen zu den Aufgaben in den entsprechenden, für die Aufgaben vorbereiteten java-Dateien zu speichern.  

## Aufgabe 1


In der Datei `Main01.java`:

1. Erstellen Sie einen Array mit **drei** Elementen vom Typ **int**. Nennen Sie den Array `threeElements`.
2. Fügen Sie in den Array drei Zahlen ein: 3, 4 i 5.
4. Zeigen Sie die Elemente dieses Arrays nacheinander, getrennt durch ein Leerzeichen, auf der Konsole an.
5. Verwenden Sie bei dieser Aufgabe keine Schleifen.

Das erwartete Ergebnis:
```3 4 5```


## Aufgabe 2

In der Datei `Main02.java` erstellen Sie einen Array mit einer Liste von Früchten. Nennen Sie den Array `fruits`.  

Danach:
1. Fügen Sie in ihn drei Werte: `apple`, `banana`, `berry` ein.
2. zeigen Sie die **erste** Frucht auf der Konsole an.
3. zeigen Sie in der nächsten Zeile die **letzte** Frucht an (verwenden Sie `length`).
4. zeigen Sie alle Früchte mit einer Schleife an - **jede Frucht in einer neuen Zeile** (verwenden Sie `length`).

Das erwartete Ergebnis:
```
apple
berry
apple
banana
berry
```


## Aufgabe 3

In der Datei `Main03.java`

1. Erstellen Sie einen Array des Typs `int` und  (4, 643, 112, 9999, 69 ) nennen Sie ihn `numbers`.
2. Erstellen Sie eine Variable `sum` und weisen Sie ihr die Zahl 0 zu.
3. Berechnen Sie die Summ der Zahlen aus dem Array mit einer for-Schleife.
4. Zeigen Sie die Summe auf der Konsole an nach dem Muster: `SUM: 10827`.


## Aufgabe 4

In der Datei `Main04.java`:

1. Erstellen Sie einen Array mit den Zahlen (4, 643, 112, 9999, 69 ) und nennen Sie ihn `numbers`.
2. Überprüfen Sie mit einer Schleife ```for```, welche Zahlen gerade sind und zeigen Sie sie **eine unter der anderen** auf der Konsole an.
3. Erstellen Sie eine zusätzliche Variable `sumOdd` mit dem Wert 0.
4. Modifizieren Sie die Schleife aus dem Punkt 1 so, dass sie **zusätzlich** ungerade Zahlen addiert.
5. Zeigen Sie das zusätzlich Ergebnis auf der Konsole an nach dem Muster: `SUM: 10711`.

Das erwartete Ergebnis:
````
4
112
SUM: 10711.
````


## Aufgabe 5

In der Datei `Main05.java`:

1. Erstellen Sie einen Array mit den Zahlen (4, 643, 112, 9999, -69) und nennen Sie ihn `numbers`.
2. Erstellen Sie eine Variable `min` und weisen Sie ihr die Zahl 0 zu.
3. Mit einer for-Schleife finden Sie die kleinste Zahl, weisen Sie sie der Variablen `min` zu und zeigen Sie sie auf der Konsole an.
4. Dazu iterieren Sie den Array und prüfen Sie, ob ein gegebenes Element kleiner als der aktuelle `min`-Wert ist - wenn ja, aktualisieren Sie die Variable `min`.

Das erwartete Ergebnis:
````
MIN: -69
````


## Aufgabe 6

In der Datei `Main06.java`

1. Erstellen Sie einen Array mit den Zahlen (4, 643, 112, 9999, -69) und nennen Sie ihn `numbers`.
2. Zeigen Sie die Elemente mit einer for-Schleife vom Ende bis Anfang auf der Konsole an - jedes Element in einer anderen Zeile.

Das erwartete Ergebnis:
````
-69
9999
112
643
4
````


## Aufgabe 7

In der Datei `Main07.java` befindet sich ein Array mit Temperaturen:

1. Die Temperatur wir im Array in Grad Celsius angegeben. Rechnen Sie sie in Grad Fahrenheit um.  
   Der Umrechnungsfaktor ist wie folgt: tempCelc * 1.8 + 32.
2. Dazu iterieren Sie den Array und überschreiben Sie die angegebene Temperatur mit dem neu berechneten Wert.
3. Berechnen Sie die Durchschnittstemperatur aus den neu berechneten Werten und weisen Sie sie der Variablen `avg` zu.
4. Zeigen Sie sie nach dem Muster DURCHSCHNITT auf der Konsole an: 3.95 - runden Sie die Zahl auf zwei Nachkommastellen.  
Sie können diese Methode verwenden:
 ```java
 String.format( "%.2f", variableToFormat );
 ```
