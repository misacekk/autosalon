package cinema;

import elektroshop.Fridge;
import elektroshop.Narocnost;

import java.util.Scanner;

public class Film {

    private String name;
    private int year;
    private People[] actors;
    private static Scanner sc = new Scanner(System.in);

    private People director;
    public Film(String name, int year) {
     this.name = name;
     this.year = year;
 }

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu hercu. A ty prida do pole actors.
     * @param count - pozadovany pocet hercu
     */
    public void addActors(int count) {
        actors = new People[count];
        for (int i=0; i < count; i++){
            System.out.println("Zadej jméno herce");
            String jmeno = sc.nextLine();
            System.out.println("Zadej rodné město herce");
            String rodneMesto = sc.nextLine();
            System.out.println("Zadej pohlaví herce(MALE/FEMALE)");
            String genderString = sc.nextLine().toUpperCase();
            Gender gender = Gender.valueOf(genderString);
            actors[i] = new People(jmeno, rodneMesto, gender);
            //nacti od uzivatele jmeno, rodne mesto a pohlavi herce
            //pridej herce do pole hercu
        }

    }

    /**
     * Tato metoda vypise informace o filmu. Na prvnim rádku bude text "-----INFO O FILMU----- ", na druhem bude nazev, rok vydani filmu.
     * Na tretim radku bude text "herci" a následne budou vypsani vsichni herci oddeleni od sebe carkou a to ve formatu "jmeno - pohlavi" (Vyuzijte metodu printInfo() tridy People.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O FILMU-----");
        System.out.println(name+", "+year);
        System.out.println("herci");
        for(People p : actors){
            p.printInfo();
            //System.out.print(","); nestiham jak to udelat s carkama :(
        }
        System.out.println("-----");
    }

    public void printPocetHercu(){
        System.out.println("Počet herců: " + (actors.length));
        }
}
