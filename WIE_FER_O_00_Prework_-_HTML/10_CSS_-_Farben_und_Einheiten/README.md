![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709394-2cabee80-571f-11eb-9518-ea6a794e558e.png)


> Öffnen Sie die Datei `index.html` im jeweiligen Aufgaben-Ordner auf **github.com** (Anklicken der Datei). Dies dient als **Vorschaumodus**. 
> Öffnen Sie die gleiche Datei aus dem geklonten Repository Ihres PC´s mittels Code-Editor Ihrer Wahl (WebStorm, Visual Studio Code). In diesem führen Sie, wie unten beschrieben, die Aufgabe aus - **Bearbeitungsmodus**.

## Layoutoptimierung
 Die Beispielseite beinhaltet eine Beschreibung von Prag und eine Bildgalerie. Unser Ziel ist es, das Layout dieser Seite zu verbessern.


## Container-Adaptierung

Die erste Aufgabe ist es den Container mit samt seines Inhaltes zu adaptieren. Es ist das Element mit der Klasse `.container`. 
Verwenden Sie dafür folgende Stile (Formatierungen):

* Breite: `680px`,
* maximale Breite (Eigenschaft max-width): `90%`,    
* Abstand des Textes vom Rand des Containers: `50px`,
* Farbe des Hintergrunds: `rgba(255, 255, 255, 0.95)`,    
* Textgröße: `15px,
* Zeilenabstand: `1.5em`,
* Farbe des Textes: `rgba(0, 0, 0, 0.6)`.


## Anpassung der Überschriften

Eine weitere Aufgaben stellt sich mit der Anpassung der Überschriften `h1` und `h2`.

Setzen Sie folgende Stile ein:
* **Gemeinsame** Textfarbe (`h1`+`h2`): `#b4411e`, 
* Textgröße `h1`: `38px`,
* Zeilenabstand `h1`: `1.2em`,
* Textgröße `h2`: `32px`,
* Zeilenabstand `h2`: `1em`.

Another step will be the appearance of `h1` and `h2` headings.

Set them **common** text color: `#b4411e`.

Then give them the following style:
* font size: 
  * `h1`: `38px`
  * `h2`: `32px`
* the size of the line spacing: 
  * `h1`: `1.2em`
  * `h2`: `1em`


## Galerie

### Teil 1 - Linkbreite verändern

Verändern Sie nun spezifisch Elemente aus der Galerie: In dieser befinden sich Links zu den jeweiligen Fotos, d.h. die Elemente `.gallery a`.

Verändern wir diese folgender Maßen:
* max-width: `50%`,
* padding: `3px`.


### Teil 2 - Bildgröße beschränken

Obwohl Sie die Link-Breite schon auf `50%` reduziert haben, harmonieren diese noch nicht mit den Fotos. Dies resultiert aus der Tatsache, dass die Grafiken `img` standardmäßig in ihren **Originalgröße** angezeigt werden. Korrigieren Sie dies.

Setzen wir für die Elemente `.gallery img` folgende Formatierung:
* maximale Breite (max-width) auf `100%`
