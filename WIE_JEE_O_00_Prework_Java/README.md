![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/152855/73064373-5ed69780-3ea1-11ea-8a71-3d370a5e7dd8.png)

# Grundlagen der Java-Programmierung
> Einige wichtige Informationen

Bevor Sie mit dem Lösen von Aufgaben beginnen, lesen Sie die folgenden Hinweise.

## Wie fängt man an?

1. Erstellen Sie ein [*fork*](https://guides.github.com/activities/forking/)-Repositorium mit den Aufgaben.
2. Klonen Sie das Repositorium auf Ihren Computer. Benutzen Sie den Befehl "git clone Adresse_des_Repositoriums".

Die Adresse des Repositoriums finden Sie auf der Repositorium-Seite nachdem Sie auf die Schaltfläche "Clone or download" klicken.

Benutzen Sie dafür die Adresse Ihres eigenen Forks - sie sollte wie folgt aussehen:
https://github.com/Ihr-Login/Adresse_des_Repositoriums

3. Importieren Sie das Projekt als ein Maven-Projekt nach den folgenden Hinweisen:

	* In IntelliJ wählen wir "File –> New –> Project from Existing Sources..."
	* Wir wählen den Speicherort des Verzeichnisses mit dem geklonten Projekt und bestätigen ihn.
	* Im neuen Fenster wählen wir "Import project from external model" und "Maven"
	* Wir wählen die Option "Finish" (in IntelliJ vor 2020: "Next –> Next –> Next –> Finish");

4. Lösen Sie die Aufgaben und speichern Sie die Änderungen in Ihrem Repositorium. Verwenden Sie dazu den Befehl "git add Name_der_Datei".
Wenn Sie alle geänderten Dateien hinzufügen möchten, verwenden Sie "git add." 
Vergessen Sie den Punkt am Ende nicht!
Dann speichern Sie die Änderungen mit dem Befehl "git commit -m "Name_des_Commits"
5. Verschieben Sie die Änderungen in Ihr Repositorium auf GitHub.  Verwenden Sie dazu den Befehl "git push origin master"
6. Erstellen Sie [*pull request*](https://help.github.com/articles/creating-a-pull-request) im ursprünglichen Repositorium, wenn Sie alle Aufgaben gelöst haben.
## Plan von diesem Repositorium
    
    * Hier finden Sie Aufgaben zum Kurs. Speichern Sie sie systematisch auf Github.

* src/main/java/pl/coderslab/afirstprogram
* src/main/java/pl/coderslab/bvariablesandoperators
* src/main/java/pl/coderslab/cflowcontrol
* src/main/java/pl/coderslab/darrays
* src/main/java/pl/coderslab/estartupparameters


Lösen Sie einzelne Aufgaben in entsprechenden Dateien.

Tests zu den Aufgaben basieren auf Meldungen, die in den Methoden angezeigt werden. Vermeiden Sie zusätzliche Anrufe, z. B. :
````java
System.out.println("some message");
````

**Repositorium mit den Aufgaben wird 2 Wochen nach dem Kurs gelöscht. Dadurch werden auch alle Forks gelöscht, die von diesem Repositorium aus gemacht werden.**

## Bemerkungen zu den Aufgaben

Wenn Sie Bemerkungen zu den Aufgaben haben, können Sie diese per E-Mail an diese Adresse senden: 
 <a href="mailto:<a href='mailto:arkadiusz.jozwiak@coderslab.pl'>arkadiusz.jozwiak@coderslab.pl</a>">arkadiusz.jozwiak@coderslab.pl</a>,
 im Betreff schreiben Sie: **Bemerkungen zu den Aufgaben**.
 
Damit das Problem schnell lokalisiert und behoben werden kann, fügen Sie die folgenden Informationen in die E-Mail ein:

- Link zur Seite mit der Aufgabe
- Nummer der Aufgabe (ggf. Unterpunkt)
- Beschreibung des Problems
