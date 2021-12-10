![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709394-2cabee80-571f-11eb-9518-ea6a794e558e.png)


## Tabelle erstellen

- Erstellen Sie eine Funktion `createArray(rows)`, die
    - ein Array mit der übergebenen Anzahl an Elementen (`rows`) erstellt und
      <br><br>
    - dem Array aufsteigende Zahlenwerte, angefangen mit `1`, zuweist und
      <br><br>
    - das Array nach der Erstellung auf geeignete Weise auf der Entwicklerkonsole ausgibt.

<br>

Rufen Sie ihre Funktion zur Demonstration mit dem Argument `5` auf!


##  Array anzeigen

- Erstellen Sie die Funktion `printArray(array)`, die auf geeignete Weise alle Elemente des übergebenen Arrays `array`
auf der Entwicklerkonsole ausgibt!

<br>

Definieren Sie zwecks Demonstration das Array

```js
const people = ["John", "Eve", "Donna", "Chris"];
```

... und rufen Sie Ihre Funktion mit `people` als Argument auf!

Überprüfen Sie, ob alle Werte wie erwartet ausgegeben werden.

## 2D-Array ausgeben

- Erstellen Sie die Funktion `printArray2D(array2D)`, die alle Elemente eines übergebenen zweidimensionalen Arrays 
ausgibt!

<br>

Definieren Sie zwecks Demonstration das zweidimensionale Array

```js
const users = [
  ["John", "Newman"],
  ["Zander","Branson"]
];
```

... und rufen Sie Ihre Funktion mit `users` als Argument auf!

Überprüfen Sie, ob alle Werte wie erwartet ausgegeben werden.

## Höchstwert

- Erstellen Sie die Funktion `maxFromArray(numbers)`, der wir später ein aus zahlen bestehendes Array übergeben.


- Erstellen Sie in `maxFromArray` eine Logik, die den ***größten vorkommenden Zahlenwert*** des übergebenen Arrays
  ermittelt und ***zurückgibt***!

Kommen im Array auch Werte vor, die keine Zahlen sind, so werden diese einfach ignoriert. <br>
Kommt gar kein Zahlenwert vor, so soll `null` zurückgegeben werden.

<br>

Rufen Sie ihre Funktion testweise mit einem selbst erstellten Array auf.<br>
Das Beispiel-Array soll hierbei auch `strings` enthalten! Geben Sie den Rückgabewert ihres Aufrufs von `maxFromArray()
auf der Entwicklerkonsole aus.


## "Wertwiederholung"

- Erstellen Sie eine Funktion `indexOfRepeatedValue(array)`, der wir später beim Aufruf ein Array als Argument übergeben 
werden.


- Erstellen Sie ein Array mit `10 Ganzzahlen`, wobei sich einige von ihnen wiederholen sollen - etwa folgendermaßen:

```js
const numbers = [2, 4, 5, 2, 3, 5, 1, 2, 4];
```

- Erstellen Sie in `indexOfRepeatedValue(array)` eine Logik, die:
  - durch verschachtelte Iteration durch das übergebene Array feststellt, `welche Zahl` sich als `erstes` im Array 
wiederholt und
  <br><br>
  - den Array-`Index` jener ersten sich wiederholenden Zahl, ***sofern gefunden***, ermittelt und ***zurückgibt***!

<br>

Wird kein sich wiederholender Zahlenwert gefunden, so soll die Funktion den "Sonderwert" `null` zurückgeben.

<br>

> ## Tipps
> 
> - Erstellen Sie außerhalb einer Schleife *Variablen*, um sich Werte über den bzw. einen Schleifenkontext hinaus zu merken.
<br><br>
> - Verwenden Sie das Schlüsselwort `break`, wenn die erste doppelt vorkommende Zahl gefunden wurde!
