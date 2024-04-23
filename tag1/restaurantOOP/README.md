## Aufgabe 25 | Objektorientierte Programmierung

Stell dir vor, du erstellst ein Programm für ein Restaurant. Dieses soll die Gäste registrieren, ihre
Tischnummer und die bestellten Speisen festhalten und den Rechnungsbetrag berechnen.

1) Erstelle eine Klasse für einen Besucher. Diese soll als Attribute die Tischnummer, eine Liste für
   die bestellten Gerichte und Getränke (die zunächst leer ist) und den Rechnungsbetrag (der zu
   Beginn bei 0 Euro liegt) enthalten. Verwende für den Konstruktor daher nur die Tischnummer als
   Übergabewert und gib die übrigen Attribute direkt vor.
2) Erstelle im Hauptprogramm ein Dictionary für die Speisekarte. Der Schlüssel soll dabei der
   Name der Speise beziehungsweise des Getränkes sein. Gib als Wert den entsprechenden Preis
   an.
3) Erstelle eine Methode, die es erlaubt, ein Gericht oder ein Getränk zu bestellen. Diese soll als
   Übergabewert den Namen des bestellten Gerichtes/Getränkes erhalten (also den Schlüssel für
   das Dictionary). Füge diesen in die Liste ein und addiere den zugehörigen Preis zum bisherigen
   Rechnungsbetrag..
4) Erstelle eine Methode, die die alle Daten des Gastes ausgibt – also die Tischnummer, die
   bestellten Speisen und den Rechnungsbetrag. Die bestellten Gerichte sollen dabei
   untereinander jeweils in einer einzelnen Zeile ausgegeben werden.
5) Erstelle im Hauptprogramm ein Objekt für einen neuen Gast. Dieser bestellt zwei Gerichte und
   zwei Getränke.
6) Gib daraufhin die Daten des Gastes aus. 