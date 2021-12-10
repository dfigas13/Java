## Aufgabe 1

Im Paket „pl.coderslab.homeworks.exceptions“ in der Datei „Main01.java“ erstellen Sie eine Methode mit der Signatur „public static void average(String a, String b)“.

1. Ergänzen Sie den Methodenblock, so dass die Methode die Variablen „a“ und „b“ in den numerischen Typ „int“ konvertiert und die Variable „a“ durch die Variable „b“ dividiert.
2. Sichern Sie das Programm vor möglichen Fehlern ab.
3. Fügen Sie ein Fragment hinzu, das immer ausgeführt wird, unabhängig davon, ob ein Fehler auftritt oder nicht.
4. Beachten Sie den Fehler „ArithmeticException“.
5. Ändern Sie den Typ der Variablen „a“ und „b“ auf „double“ und schauen Sie, welche Ergebnisse Sie erhalten, wenn Sie durch 0 dividieren.

Lesen Sie die Artikel:
[https://www.geeksforgeeks.org/g-fact-33-infinity-or-exception/](https://www.geeksforgeeks.org/g-fact-33-infinity-or-exception/)
[https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.17.2](https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.17.2)


## Aufgabe 2

Im Paket „pl.coderslab.homeworks.exceptions“ in der Datei „Main02.java“ erstellen Sie eine Methode mit der Signatur „public static String safeGet(String[] strTab, int index)“.

1. Ergänzen Sie den Methodenblock, so dass die Methode das Element des Arrays „strTab“ zurückgibt, das unter dem Index „index“ enthalten ist.
2. Fügen Sie die Behandlung der entsprechenden Ausnahme hinzu.
3. Testen Sie das Programm.


## Aufgabe 3

Im Paket „pl.coderslab.homeworks.exceptions“ in der Datei „Main03.java“ erstellen Sie eine Methode mit der Signatur „public static int getLength(String str)“.

1. Ergänzen Sie den Methodenblock, so dass die Methode die Länge der Zeichenfolge „str“ zurückgibt.
2. Testen Sie die Methode, indem Sie ihr einen Parameter mit dem Wert null übergeben.
3. Sichern Sie das Programm vor „NullPointerException“ ab.


## Aufgabe 4

Im Paket „pl.coderslab.homeworks.exceptions“ in der Datei „Main04.java“ erstellen Sie eine Methode mit der Signatur „public static int toInt(String str)“.

1. Ergänzen Sie den Methodenblock, so dass die Methode die Zeichenfolge „str“ geändert auf den Typ „int“ zurückgibt,
2. Behandeln Sie mögliche Ausnahmen.


## Aufgabe 5

Im Paket „pl.coderslab.homeworks.exceptions“ in der Datei „Main05.java“ erstellen Sie eine Methode mit der Signatur „public static int indexOf(int[] elements, int value)“.

1. Ergänzen Sie den Methodenblock, so dass die Methode den Index des Elements „value“ zurückgibt, das im Array „elements“ enthalten ist.
2. Wenn der Array das angegebene Element nicht enthält, geben Sie die Ausnahme „NoSuchElementException“ zurück. 
3. Testen Sie das Programm, indem Sie die Methode „indexOf“ mit einem Element aufrufen, das in dem Array vorkommt und einem, das dort nicht vorkommt. 
4. Beim Aufrufen der Methode „indexOf“, fügen Sie die Behandlung der Ausnahmen “NoSuchElementException“ hinzu.
5. Testen Sie das Programm nochmal.
