![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709394-2cabee80-571f-11eb-9518-ea6a794e558e.png)


## `for`: Array erstellen

- Erstellen Sie eine Variable `n`. <br>
Weisen Sie der Variable n einen ganzzahligen Zahlenwert zu.



- Erstellen Sie eine `for`-Schleife, die auf Basis der Variablen `n` ein *eindimensionales Array* erzeugt,
das als Elemente alle Zahlen von `1 bis n` enthält!

<br>

### Hinweis
Erstellen Sie das Array ohne Werte vor Beginn der Schleife und hängen Sie unter Verwendung der Array-Funktion
`.push(element)` einzeln Elemente an.

## `for` - gerade und ungerade Zahlen

- Erstellen Sie eine Variable `n`. Weisen Sie der Variable n einen ganzzahligen Zahlenwert zu.

- Erstellen Sie eine mithilfe einer `for`-Schleife eine Logik, die:
    - alle ganzen Zahlen von `0` bis `n` auf der Entwicklerkonsole ausgibt und
    - jeder Ausgabe einer Zahl in der Konsole anhängt, ob diese `gerade` oder `ungerade` ist.

<br>

***Beispiel***:

```
0 – gerade Zahl
1 – ungerade Zahl
2 – gerade Zahl
3 – ungerade Zahl
...
```

<br>

### Hinweis

Eine Zahl ist gerade, wenn sie restlos durch `2` teilbar ist.<br>
Verwenden Sie hier zur Feststellung den `modulo`-Operator!

## `while`: Array erstellen

- Erstellen Sie eine Variable `n`. <br>
  Weisen Sie der Variable n einen ganzzahligen Zahlenwert zu.


- Erstellen Sie eine `while`-Schleife, die auf Basis der Variablen `n` ein *eindimensionales Array* erzeugt, das als
  Elemente alle Zahlen von `1 bis n` enthält!


## `while`: gerade und ungerade Zahlen

- Erstellen Sie eine Variable `n`. <br>
  Weisen Sie der Variable n einen ganzzahligen Zahlenwert zu.

- Erstellen Sie eine mithilfe einer `while`-Schleife eine Logik, die:
    - alle ganzen Zahlen von `0` bis `n` auf der Entwicklerkonsole ausgibt und
    - jeder Ausgabe einer Zahl in der Konsole anhängt, ob diese `gerade` oder `ungerade` ist.

<br>

***Beispiel***:

```
0 – gerade Zahl
1 – ungerade Zahl
2 – gerade Zahl
3 – ungerade Zahl
...
```

<br>

### Hinweis

Eine Zahl ist gerade, wenn sie restlos durch `2` teilbar ist.<br>
Verwenden Sie hier zur Feststellung den `modulo`-Operator!

## `while`: Text wiederholt ausgeben

- Erstellen Sie eine Variable `n`. Weisen Sie der Variable n einen ganzzahligen Zahlenwert zu.


- Erstellen Sie mithilfe einer `while`-Schleife eine Logik, die den Text `Ich liebe JS!` genau `n` Mal auf der
  Entwicklerkonsole ausgibt.


- Überprüfen Sie das Verhalten der von Ihnen erstellten Programmlogik, wenn Sie `n = 0` setzen!




## Ein zweidimensionales Array iterativ ausgeben

- Erstellen Sie mithilfe von verschachtelten Schleifen eine Logik zur *Ausgabe aller Elemente* eines
  `zweidimensionalen Arrays`.


- ***Zusatz***: Erstellen Sie ein zweidimensionales Array nach Belieben und überprüfen Sie ihre Logik!


## Ein 2D-Array iterativ erstellen

- Definieren Sie die Variable `array`.

- Definieren Sie die Variablen `rows` (engl. Zeilen) und `cols` (engl. Spalten). <br>
  Weisen Sie den Variablen ganzzahlige Werte zu.

- Erstellen Sie mithilfe von verschachtelten Schleifen eine Logik, die in `array` ein multidimensionales Array auf Basis
  der Variablen `rows` und `cols` erstellt.<br>
  Als Werte sollen ***aufeinanderfolgende ganze Zahlen***, beginnend mit `1`, zugewiesen werden!


## Multiplikationstabelle

- Erstellen Sie eine Variable `n`. <br>
  Weisen Sie der Variable n einen ganzzahligen Zahlenwert zu.


- Erstellen Sie eine Logik, die auf Basis der Variablen `n` eine ***Multiplikationstabelle*** in einem zweidimensionalen
  Array erstellt.<br>
  Das Array soll dabei jeweils die Rechenergebnisse an der korrekten Position enthalten.

<br>

Betrachten wir die Herangehensweise am Beispiel `n = 3`:

```
1 x 1 = 1 | 1 x 2 = 2 | 1 x 3 = 3
2 x 1 = 2 | 2 x 2 = 4 | 2 x 3 = 6
3 x 1 = 3 | 3 x 2 = 6 | 3 x 3 = 9
```

Das Ergebnis-Array enthält nur die *Multiplikationsergebnisse*:

```
...
array2D[0][3] = 0
array2D[1][0] = 0
array2D[1][1] = 1
array2D[1][2] = 2
array2D[1][3] = 3
array2D[2][0] = 0
array2D[2][1] = 2
array2D[2][2] = 4
...
```


Das Ergebnis-Array soll zum Schluss auf folgende Weise ausgegeben werden (Beispiel `n = 3`):

```
1 x 1 = 1 | 1 x 2 = 2 | 1 x 3 = 3
2 x 1 = 2 | 2 x 2 = 4 | 2 x 3 = 6
3 x 1 = 3 | 3 x 2 = 6 | 3 x 3 = 9
```

Verwenden Sie hierzu ebenfalls verschachtelte Schleifen!


## Sternchen

- Erstellen Sie eine Variable `n`. <br>
  Weisen Sie der Variable n einen ganzzahligen Zahlenwert zu.


- Erstellen Sie mithilfe von (wertabhängig) verschachtelten Schleifen auf Basis der Variablen `n` eine Logik, die
  folgende Ausgabe erzeugt; beginnend mit `1` Stern bis hin zu `n` Sternen:

```
*
**
***
****
*****
```



## Break

- Erstellen Sie eine Schleife, die `1 000 000 (eine Million)` Mal durchlaufen wird.


- Geben Sie die `Iteratorvariable` in jedem Durchlauf auf der Entwicklerkonsole aus.


- Verlassen Sie die Schleife mittels `break`, wenn `i` den Wert `5` erreicht hat.