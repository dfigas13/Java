![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709394-2cabee80-571f-11eb-9518-ea6a794e558e.png)


> Öffnen Sie die Datei `index.html` im jeweiligen Aufgaben-Ordner auf **github.com** (Anklicken der Datei). Dies dient als **Vorschaumodus**. 
> Öffnen Sie die gleiche Datei aus dem geklonten Repository Ihres PC´s mittels Code-Editor Ihrer Wahl (WebStorm, Visual Studio Code). In diesem führen Sie, wie unten beschrieben, die Aufgabe aus - **Bearbeitungsmodus**.

## Formatierung des Inhaltes (Stiländerung)

Im oberen und im unteren Bereich der Seite befinden sich 2 Leisten, derer Breite auf 80% eingestellt ist. Dazwischen liegt das Element `.content`, d.h. der Inhalt der Seite auf weißem Hintergrund.

Stellen wir den Stil des `content`-Element ein.
* maximale Breite (`max-width`) auf `80%`,
* Innenabstand `50px` auf allen Seiten,

Wie wir sehen, ist unser Element beim Verwenden von o. g. Eigenschaften ein bisschen breiter als untere und obere Leiste. Woraus resultiert das? Versuchen wir dies mit Hilfe der Eigenschaft `box-sizing` zu verändern.


## Stiländerung der Schaltflächen

Im Inhalt befindet sich das Element `.btn`.

Verwenden wir diese Formatierung dafür:
* Innenabstand eingestellt auf `20px 40px`,
* Unterer Aussenabstand `20px`.

Wie man sieht, wird das Element nicht ganz gut angezeigt. Dies resultiert aus der Tatsache, dass es sich hier um einen formatierten Link handelt und es sich bei diesem standardmäßig um ein `inline`-Element handelt. Wodurch zeichnet sich eine solche Anzeigeart aus? Ändern sie diese auf eine korrekte Anzeigeart.


## Foto-Galerie

Im unteren Bereich der Seite befindet sich eine Galerie mit der Klasse `.gallery`. Im inneren Bereich der Seite befindet sich eine Liste der Fotos mit der Klasse `.gallery-content`, in der sich die horizontal angeordneten Fotos befinden. Leider passen diese nicht in der horizontalen Ebene und der Kunde möchte nicht, dass sie mehr Platz in der vertikalen Ebene in Anspruch nehmen (sie können also auch nicht umgebrochen werden). Verwenden Sie eine entsprechende Eigenschaft, dank der eine horizontale Bildlaufleiste im Element`.gallery-content` angezeigt wird. 
