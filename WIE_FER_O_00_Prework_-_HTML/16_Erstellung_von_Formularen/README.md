![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709394-2cabee80-571f-11eb-9518-ea6a794e558e.png)


> Öffnen Sie die Datei `index.html` im jeweiligen Aufgaben-Ordner auf **github.com** (Anklicken der Datei). Dies dient als **Vorschaumodus**. 
> Öffnen Sie die gleiche Datei aus dem geklonten Repository Ihres PC´s mittels Code-Editor Ihrer Wahl (WebStorm, Visual Studio Code). In diesem führen Sie, wie unten beschrieben, die Aufgabe aus - **Bearbeitungsmodus**.

Unsere Aufgabe besteht darin, ein einfaches Kontaktformular zu erstellen. Das Formular ist bereits fertig formatiert. Wir konzentrieren uns ausschließlich auf den HTML-Code.


## Namensfeld einfügen

Platzieren wir ein `<input>`-Feld im Formular, welches folgende Kriterien erfüllen soll:

* Feldtyp: `text`
* Attribut `name` wird den Wert `name` haben
* `id` des Feldes ist `name`

Über diesem Feld wird ein `<label>`-Element eingesetzt, welches auf das obere `<input>`-Feld hinweist.


## Emailadressen-Feld hinzufügen

Fügen wir ein weiteres `<input>`-Feld hinzu, welches folgende Kriterien erfüllen soll:

* Feldtyp: `email`
* Attribut `name` wird den Wert `email` haben
* `id` des Feldes ist `email`

Über diesem Feld wird ein `<label>`-Element eingesetzt, welches auf das obere `<input>`-Feld hinweist.


## Mehrzeilige Nachrichtenfeld einfügen

Setzen wir nun das Element `<textarea>` ins Formular ein, welches folgende Kriterien erfüllen soll:

* Attribut `name` wird den Wert `msg` haben
* `id` des Feldes ist `msg`

Über diesem Feld wird ein `<label>`-Element eingesetzt, welches auf das obere `<textarea>`-Feld hinweist.


##  Absende-Button setzen

Fügen wir zuletzt ein `<button>`-Element ein, welches zum **Absenden** des Formulares dienen soll.
Der Button soll einen spezifischen Text beinhalten, z.B. "Senden".
