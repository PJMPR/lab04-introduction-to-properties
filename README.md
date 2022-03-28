# Zadanie

1. (1 pkt) Należy utworzyć klasę PeselValidator z jedną metodą statyczną w pakiecie ```com.pjatk.pesel.model```
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
        + imię i nazwisko (gettery i settery) (0.5 pkt)
        + nr pesel (getter) (0.5 pkt)
        + płeć odczytana z numeru PESEL (getter) (0.5 pkt)
        + data urodzenia odczytana z numeru PESEL (getter) (0.5 pkt)

![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/PJMPR/lab04-introduction-to-properties/main/UML/diagram1.puml)


