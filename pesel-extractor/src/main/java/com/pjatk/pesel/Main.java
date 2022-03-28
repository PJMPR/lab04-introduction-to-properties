package com.pjatk.pesel;

//import com.pjatk.pesel.model.*

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Main {

    public static void main(String[] args){

        String pesel = "94011341966";

        //if(!PeselValidator.isValid(pesel))return;

        /* kostruktor przyjmuje numer PESEL */
        //Person person = new Person(pesel);

        //person.setName("Jan");
        //person.setLastname("Kowalski");
        //System.out.println("imie: " + person.getName());
        //System.out.println("nazwisko: " + person.getLastname());
        //System.out.println("nr pesel: " + person.getPeselNumber());

        //System.out.println("płeć: " +  person.getGender());

        //System.out.println("Urodzony:");
        //System.out.println("Rok: " + person.person.getDateOfBirth().getYear());
        //System.out.println("Miesiąc: " +person.getDateOfBirth().getMonth().toString()); //powinien wypisac "JANUARY"
        //System.out.println("Dzień: " +person.getDateOfBirth().getDayOfMonth());

        // powinien wypisac którąś z wartości: MONDAY, TUESDAY, WEDNSEDAY...
        //System.out.println("Dzien tygodnia: " +person.getDateOfBirth().getMonth().toString());

        funWithDates();
        funWithString();
    }

    static void funWithDates(){

        print("-------------------------------------------------------------");
        //tworzenie obektu do manewrowania na datach
        LocalDate date = LocalDate.of(2005, 10, 19);

        //pobranie informacji o dacie:
        print(date.getDayOfMonth());// wyswietla dzien miesiaca
        print(date.getYear());//wyswietla rok
        print(date.getDayOfWeek()); //wyswietla dzien tygodnia

        print(date.plusMonths(3)); // zwróci nową date po przesunieciu o 3 miesiace (styczeń 2006)
        print(date.minusYears(4)); // nowa data przesunięta o 4 lata wstecz

        print(LocalDate.now().isAfter(date)); // sprawdza czy data dzisiejsza jest wieksza od danej daty
        print("-------------------------------------------------------------");
    }

    static void funWithString(){
        print("-------------------------------------------------------------");
        String text = "Ala ma kota";

        print(text.toUpperCase(Locale.ROOT)); // ALA MA KOTA
        print(text.toLowerCase(Locale.ROOT));//ala ma kota

        print(text.replace("Ala", "Maciek"));//zamienia Ale na Maćka

        print(text.contains("kot"));// sprawdza czy text posiada wyraz kot

        print(text.substring(4,6));//wydziela słowo "ma"

        print("test@wp.pl".matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"));

        print("-------------------------------------------------------------");
    }

    static void print(Object obj){
        System.out.println(obj);
    }
}
