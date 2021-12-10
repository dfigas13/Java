Denken Sie daran, die Lösungen zu den Aufgaben in den entsprechenden, für die Aufgaben vorbereiteten `java` Dateien zu speichern.  

## Aufgabe 1

1. In der Datei `Main01.java` in der Methode `main`
laden Sie alle Parameter und zeigen Sie sie in einer Zeile an z. B.:
```
1 John 4 Keller
```


## Aufgabe 2

1. In der Datei `Main02.java` in der Methode `main`
rufen Sie alle Parameter ab und zeigen Sie sie dann in umgekehrter Reihenfolge an.
z.B. für gegebene `1 John 4 Keller` als Ergebnis erhalten wir
```
Keller 4 John 1
```


## Aufgabe 3


1. In der Datei `Main03.java` in der Methode `main`
schreiben Sie ein Programm, das aus allen Startparametern den Durchschnitt berechnet und ihn auf der Konsole anzeigt.
2. Wir nehmen an, dass die angegebenen Parameter Zahlen sind.
3. Um eine Zeichenfolge in eine Zahl umzuwandeln, können wir
````
Integer.parseInt("12") verwenden.
````
Ein beispielhaftes, erwartetes Ergebnis:
````
2.5
````


## Aufgabe 4

1. In der Datei `Main04.java` erstellen Sie ein Programm, das 3 Startparameter: a, b, c abruft.
2. Das Programm soll überprüfen, ob die angegebenen Zahlen Seiten eines Dreiecks sein können.
3. Diese geometrische Figur kann nur dann aus drei Linien konstruiert werden,
 wenn die Summe der Längen der beiden kürzeren Linien größer ist als die Länge der dritten Linie, d.h:

```
a + b > c
c + b > a
a + c > b
```

Zeigen Sie nach der Prüfung die entsprechenden Informationen gemäß der folgenden Formel  
auf der Konsole an: wenn man aus den gegebenen Seiten ein Dreieck konstruiert kann:
```
YES
```  
wenn man aus den gegebenen Seiten kein Dreieck konstruiert kann:
```
NO
```


## Aufgabe 5

In der Datei `Main05.java` schreiben Sie ein Programm, das einen Test benotet:

* 0-50 Pkt – F
* 51-70 Pkt – E
* 71-90 Pkt – C  
* 91-100 Pkt – A

1. Erstellen Sie eine Variable `points`, der der Wert des Startparameters zugewiesen wird.
2. Überprüfen Sie zunächst ob die Anzahl der Punkte:
* größer oder gleich 0 ist; wenn nicht, zeigen Sie die Meldung `BADVALUE` auf der Konsole an;
* größer oder gleich 100 ist; wenn nicht, zeigen Sie die Meldung `BADVALUE` auf der Konsole an;
4. Prüfen Sie dann, welche Note welcher Punktzahl entspricht und zeigen Sie ihr Symbol auf der Konsole an.
5. Zum Lösen dieser Aufgabe verwenden Sie `if ... else if ... else`.


## Aufgabe 6

In der Datei `Main06.java` erstellen Sie ein Programm, in dem eine Multiplikationstabelle für die angegeben Variable `n` gebildet wird.
Rufen Sie den Startparameter ab und weisen Sie ihn der Variablen `n` zu.
Z.B. für n = 3 sieht das Ergebnis folgendermaßen aus:

```
1 x 1 = 1  
1 x 2 = 2  
1 x 3 = 3  

2 x 1 = 2  
2 x 2 = 4  
2 x 3 = 6  

3 x 1 = 3  
3 x 2 = 6  
3 x 3 = 9  
```

Verwenden Sie den Operator `*`, um Zahlen zu multiplizieren.  

Denken Sie daran, ein Leerzeichen zwischen die Zahlen und `x` und `=` einzufügen.


## Aufgabe 7

In der datei `Main07.java`:  

1. Schreiben Sie ein Programm, das den Wert `x!` berechnet, wo `!` Fakultät bedeutet, und `x` eine Variable ist.  
2. Rufen Sie den Startparameter ab und weisen Sie ihn der Variablen `n` zu.
3. Verwenden Sie dafür eine der Ihnen bekannten Schleifen.
4. Die Fakultät soll der Variablen `factorial` zugewiesen werden.
5. Zeigen Sie nach der Berechnung der Fakultät das Ergebnis auf der Konsole an.
Beispiel für x = 3:

````
6
````


Fakultät ist das Ergebnis des Multiplizierens von ganzen Zahlen von eins bis zur angegeben Zahl, d.h.:

```
5! = 1*2*3*4*5 = 120
8! = 1*2*3*4*5*6*7*8 = 40320
```


## Aufgabe 8

In der Datei `Main08.java` erstellen Sie zwei Variablen: `x` und `y`, die positive Ganzzahlen sind.
1. Rufen Sie den Startparameter ab und weisen Sie ihn der Variablen `x` und `z` zu.
2. Schreiben Sie ein Programm, das den *größten gemeinsamen Teiler (*greatest common divisor – GCD*) von zwei Zahlen berechnet.
3. Lesen Sie die Beschreibung auf dieser [Seite][GCD].
4. Zeigen Sie das Ergebnis auf der Konsole zusammen mit den Zahlen an, für die es berechnet wurde.
Beispiel für 420 und 168:

`84`.


**Lösen Sie einzelne Aufgaben in entsprechenden, vorbereiteten Dateien.**

<!-- Links -->
[GCD]: http://www.programming-algorithms.net/article/43434/Greatest-common-divisor
