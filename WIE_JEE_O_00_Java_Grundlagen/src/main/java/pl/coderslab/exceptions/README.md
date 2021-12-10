## Aufgabe 1 - zum Lösen mit dem Kursleiter

In der Datei `Main01.java` befindet sich eine Methode mit der Signatur `public static int factorial(int number)`, die
die Potenz einer im Parameter übergebenen natürlichen Zahl zurückgibt.
1. Modifizieren Sie den Code so, dass die Methode eine `IllegalArgumentException`
zurückgibt, wenn die im Parameter übergebene Zahl kleiner als 0 ist.
2. Finden Sie heraus, ob es sich um eine kontrollierte oder unkontrollierte Ausnahme handelt und warum.
3. Testen Sie das Programm, indem Sie die Methode `factorial` mit gültigen und ungültigen Parametern aufrufen.
4. Beim Aufrufen der Methode `factorial`, fügen Sie die Behandlung der Ausnahme `IllegalArgumentException` hinzu.
5. Testen Sie das Programm nochmal.


## Aufgabe 2

In der Datei `Main02.java` befindet sich ein Programm, das eine Ausnahme wirft.
1. Starten Sie das Programm und beobachten Sie, welche Ausnahme geworfen wird.
2. Fügen Sie eine entsprechende Ausnahmebehandlung in den Code ein und starten Sie das Programm erneut.
3. Finden Sie heraus, ob es sich um eine kontrollierte oder unkontrollierte Ausnahme handelt und warum.


## Aufgabe 3

In der Datei `Main03.java` befindet sich ein Programm, das eine Ausnahme wirft.
1. Starten Sie das Programm und beobachten Sie, welche Ausnahme geworfen wird.
2. Modifizieren Sie den Code, um ihn vor dem Werfen einer Ausnahme zu schützen - Sie sollten es so einrichten, dass diese Ausnahme an der angegebenen Stelle nicht geworfen wird.


## Aufgabe 4

Die Datei `Main04.java` enthält ein Programm mit Ausnahmebehandlung für zwei Ausnahmen.

1. Starten Sie das Programm und beobachten Sie, welche Ausnahme geworfen wird.
2. Entfernen Sie den Kommentar und korrigieren Sie den Code so, dass die zusätzliche Ausnahme aus dem Kommentar korrekt behandelt wird.
1. Starten Sie das Programm und beobachten Sie, welche Ausnahme geworfen wird.


## Aufgabe 5

In der Datei `Main05.java` befindet sich ein Programm, das eine Ausnahme wirft.
1. Starten Sie das Programm und beobachten Sie, welche Ausnahme geworfen wird.
2. Fügen Sie die Behandlung der entsprechenden Ausnahme zum Code hinzu.
3. Fügen Sie einen Abschnitt in den Code ein, der unabhängig davon ausgeführt wird, ob eine Ausnahme geworfen wird oder nicht.
4. Testen Sie das Programm, indem Sie die Methode `parseInt` mit einem gültigen und ungültigen Parameter aufrufen.


## Aufgabe 6

In der Datei `Main06.java` befindet sich eine Methode mit der Signatur `public static int divide (int a, int b)`.

1. Ergänzen Sie den Block der Methode so, dass sie eine Division von `a` durch `b` durchführt und den ganzzahligen Teil des Ergebnisses der Division zurückgibt.
2. Rufen Sie die Methode `divide` auf und übergeben Sie den Parameter `b` mit dem Wert 0 und beobachten Sie, welche Ausnahme bei der Ausführung des Programms zurückgegeben wird.
3. Modifizieren Sie den Code so, dass die Methode `divide` eine `IllegalArgumentException` zurückgibt, wenn der Parameter `b` gleich 0 ist.
4. Starten Sie das Programm erneut und beobachten Sie, welche Ausnahme geworfen wird.
5. Geben Sie zur Methode main die Behandlung de Ausnahme `IllegalArgumentException`.
6. Testen Sie das Programm, indem Sie der Methode `divide` einen gültigen und einen ungültigen Parameter `b` übergeben.
