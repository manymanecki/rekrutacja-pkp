# REKRUTACJA
### Zadanie 1A: W jakim celu używa się klas abstrakcyjnych, a w jakim interfejsów?
Róznicą pomiędzy klasą abstrakcyjną a interfejsem jest ograniczone dziedziczenie. Zgodnie z działaniem Javy, klasa może dziedziczyć tylko po jednej klasie. Interfejs nie posiada takiej restrykcji, co oznacza że w danej klasie możemy implementować wiele interfejsów. Ważną róznicą jest także fakt, że w klasie abstrakcyjnej możemy zawrzeć "szkielet" działania danych metod, a interfejs jedynie ma dać znać programiście że jeżeli jest implementowany, to w kodzie muszą się znaleźć dane metody - jest to swego rodzaju wzór.

Mając to na uwadze: 
- Klasę abstrakcyjną stosujemy kiedy musimy lub powinniśmy zdefiniować specyficzny sposób działania normalnej klasy (np. mając podobne klasy o róznej implementacji metod)
- Interfejs stosujemy kiedy mamy sie stosować pewnych zasad związanych z kodem który będziemy pisać (jako implementacja metod zawartych w interfejsie lub poprzez deklaracje interfejsu który będzie przeciążany)

### Zadanie 1B: Czym różni się tablica od listy liniowej?
- Tablica jest grupą zmiennych o uprzednio zdefiniowanym typie. Rozmiar oraz rodzaj danych przechowywanych w tablicy musi byc wczesniej ustalony a potem nie może być zmieniony. To sprawia że tablica jest obiektem niedynamiczny (problematyczne gdy potrzebujemy przechować większą ilość elementów), ale za to stale zajmuje określoną ilość pamięci oraz w każdej chwili pozwala nam odwołać się do danej ramki pamięci (indeks tablicy). 
- Lista Liniowa także jest grupą zmiennych o uprzednio zdefiniowanym typie, jednakże jej rozmiar może dynamicznie ulec zmianie. Każdy element listy liniowej jest połączony ze sobą wskaźnikami (jest to związane z dynamiczną naturą listy liniowej, lista także musi początkowo zająć określoną ilość pamięci a gdy zajdzie taka potrzeba, zajmie sobie jeszcze troche i da znać gdzie znajduje się reszta, albo usunie po sobie pozostałości). Plusem takiego rozwiązania jest proste modyfikowanie danych znajdujących się w środku listy liniowej - operacje są szybkie i proste, oraz oczywiście dynamika (choć przyznam częściej miałem do czynienia z ArrayList lub HashMap niz LinkedList ;) )

# Rozwiązania zadań 2 oraz 3 znajdują się kolejno w plikach Numbers oraz Kanye.
### Zadanie 2: Podaj szacowaną złożoność obliczeniową oraz pamięciową.
- Szacowana zlozonosc obliczeniowa: O(logN)
- Szacowana zlozonosc pamieciowa: O(1)