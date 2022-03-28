# Zadanie

1. Należy utworzyć klasę PeselValidator z jedną metodą statyczną w pakiecie ```com.pjatk.pesel.model```
```
public class PeselValidator{
    public static boolean isValid(String pesel){
        
        /* Algorytm sprawdzający czy nr pesel jest prawidłowym numerem PESEL 
        (wyrażenie regularne oraz sprawdzenie sumy kontrolnej) */
        
        return false;
    }
}
```

2. Należy utworzyć klasę Person w pakiecie ```com.pjatk.pesel.model```
    * konstruktor przyjmujący numer PESEL
    * Właściowści:
        + imię i nazwisko (gettery i settery)
        + nr pesel (getter)
        + płeć odczytana z numeru PESEL (getter)
        + data urodzenia odczytana z numeru PESEL (getter)

![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/PJMPR/lab04-introduction-to-properties/main/UML/diagram.puml)


