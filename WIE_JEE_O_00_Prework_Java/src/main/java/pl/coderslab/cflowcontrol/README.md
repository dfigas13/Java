Denken Sie daran, die Lösungen zu den Aufgaben in den entsprechenden, für die Aufgaben vorbereiteten java-Dateien zu speichern.  

## Aufgabe 1


1. In der Datei `Main01.java` erstellen Sie zwei Variablen mit den Namen `nr1` und `nr2`, die Ganzzahlen mit den Werten 3 und 7 speichern.
2. Dann, unter Verwendung der bedingten Anweisung `if ... else` zeigen Sie auf der Konsole an, welcher Wert größer ist.
3. Zeigen Sie den Text wie folgt an: `Die größere Zahl ist 7.`


## Aufgabe 2


1. In der Datei `Main02.java` erstellen Sie drei Variablen mit den Namen `nr1`, `nr2` und `nr3` die Ganzzahlen mit den Werten 3, 7 und 11 speichern.
2. Dann, unter Verwendung der bedingten Anweisung `if ... else if ... else` zeigen Sie auf der Webseite an, welcher Wert der größte ist.
3. Zeigen Sie den Text wie folgt an: `Die größte Zahl ist 11.`


## Aufgabe 3


1. In der Datei `Main03.java` erstellen Sie eine Schleife, die den Text **Java** 3 Mal auf der Konsole anzeigtt.
2. Schreiben Sie sowohl eine Schleife `for`, als auch `while`.
3. Insgesamt wird die Zeichenfolge 6 Mal angezeigt.

Das erwartete Ergebnis:
````
Java
Java
Java
Java
Java
Java
````


## Aufgabe 4


1. In der Datei `Main04.java` erstellen Sie eine Schleife, die Zahlen von 1 bis 10 in einer Zeile auf der Konsole anzeigt.
2. Schreiben Sie sowohl eine Schleife `for`, als auch `while`.
3. Es werden insgesamt 20 Zahlen angezeigt.

Das erwartete Ergebnis:
````
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
````


## Aufgabe 5


1. In der Datei `Main05.java` erstellen Sie Variablen `resultFor` und `resultWhile` und weisen Sie ihnen die Zahl 0 zu.
2. Erstellen Sie dann eine Schleife, die die Zahlen 1 bis 10 addiert und den Variablen `resultFor` oder `resultWhile` zuweist.
3. Die Schleife soll bei jedem Durchlauf (auch Schleifeniteration genannt) eine weitere Zahl aus dem angegebenen Bereich der Variable `resultFor` oder `resultWhile` zuweisen.
4. Schreiben Sie sowohl eine Schleife `for`, als auch `while`.
5. Zeigen Sie die Variablen `resultFor` und `resultWhile` in getrennten Zeilen auf der Konsole an.

Das erwartete Ergebnis:
````
55
55
````


## Aufgabe 6


1. Schreiben Sie in der Datei `Main6.java` einen Code, der, basierend auf dem Wert der Variablen `n` ( int n = 6;),
 alle Zahlen von 0 bis **n** anzeigt.
Zeigen Sie bei jeder Zahl an, ob sie gerade oder ungerade ist.  

Muster:

```
0 – gerade
1 – ungerade
2 – gerade
3 – ungerade
...
```

Schreiben Sie sowohl eine Schleife `for`, als auch `while`.

*Hinweis: Wie kann man überprüfen, ob eine Zahl gerade oder ungerade ist?
 Es reicht aus, den Rest der Division durch 2 zu berechnen.
 Wenn das Ergebnis 0 ist, dann ist die Zahl gerade, sonst ist sie ungerade.*

Das erwartete Ergebnis:
````
0 - gerade
1 - ungerade
2 - gerade
3 - ungerade
4 - gerade
5 - ungerade
6 - gerade
0 - gerade
1 - ungerade
2 - gerade
3 - ungerade
4 - gerade
5 - ungerade
6 - gerade
````


## Aufgabe 7

1. In der Datei `Main07.java` erstellen Sie zwei unabhängige Schleifen und zeigen Sie die Werte ihrer Zähler in
 jeder Iteration für i < 3 und j < 3.
2. Verwenden Sie: ```System.out.println("i = " + i + " j = " + j);```
3. Lösen Sie die Aufgabe mit zwei `for`-Schleifen.

*Hinweis: Das Prinzip der Erstellung von verschachtelten Schleifen (abhängigen und unabhängigen) wurde in der Präsentation
 **Grundlagen der Programmierung** besprochen.
 Im Zweifelsfall lesen Sie den Abschnitt **Schleifen: for, verschachtelte Schleife for und while** in dieser Präsentation.*

 Das erwartete Ergebnis:
```
i= 0 j= 0
i= 0 j= 1
i= 0 j= 2
i= 1 j= 0
i= 1 j= 1
i= 1 j= 2
i= 2 j= 0
i= 2 j= 1
i= 2 j= 2
```


## Aufgabe 8


In der Datei `Main08Sample` befindet sich ein Programm, das
auf de Konsole ein Schema wie das unten aus n Sternen anzeigt.  
Analysieren Sie es sorgfältig.
Beispiel für `n = 5`:

```
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

Für diese Aufgabe verwenden wir verschachtelte Schleifen!

In der Datei `Main08.java` erstellen Sie ein Programm, das anhand des Wertes der Variablen `n` folgendes Schema
für int `n = 5` in der Methode main zeichnen wird.

```
* 2 3 4 5
* * 3 4 5
* * * 4 5
* * * * 5
* * * * *
```


Um eine solche Zeichenfolge zu erzeugen, verwenden Sie in einer geschachtelten Schleife den bedingten Ausdruck `if`, 
mit dem Sie entscheiden können, ob ein Sternchen oder ein Zähler aus der geschachtelten Schleife ausgegeben werden soll.


## Aufgabe 9


In der Datei `Main09.java` erstellen Sie ein Programm, das anhand des Wertes `n` folgendes Schema anzeigt -
 für int `n = 5` in der Methode main zeichnen wird.

```
*
* *
* * *
* * * *
* * * * *
```

Es gibt zwei Möglichkeiten diese Aufgabe zu lösen:

1. mit abhängigen Schleifen,
2. mit unabhängigen Schleifen und bedingter Anweisung `if`.

*Folgen Sie den Beispielen von früheren Aufträgen. Hier braucht es etwas Überlegung und Verständnis von verschachtelten Schleifen.*


## Aufgabe 10

In der Datei `Main10.java` erstellen Sie ein Programm, das anhand des Wertes der Variablen `n` folgendes Schema zeichnen wird (hier für n = 5).

```
* 2 3 4 5
* * 3 4 5
* * * 4 5
* * * * 5
* * * * *
* * * * *
* * * * 5
* * * 4 5
* * 3 4 5
* 2 3 4 5
```

Um eine solche Zeichenfolge zu erzeugen, verwenden Sie in einer geschachtelten Schleife den bedingten Ausdruck `if`, 
mit dem Sie entscheiden können, ob ein Sternchen oder ein Zähler aus der geschachtelten Schleife ausgegeben werden soll.
