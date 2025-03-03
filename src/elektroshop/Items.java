package elektroshop;

public class Items {
    private Fridge[] items;


    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu ledniček. A ty prida do pole items.
     * @param count - pozadovany pocet lednicek
     */
    public void addItems(int count) {
      items = new Fridge[count];
        for (int i=0; i<count; i++){
           System.out.println("Zadej značku ledničky");
           String znacka = sc.nextLine;
            System.out.println("Zadej model ledničky");
            String model = sc.nextLine;
            System.out.println("Zadej narocnost ledničky(A-G)");
            String narocnost = sc.nextLine;
        }

    }


    /**
     * Tato metoda vypise informace o lednickach. Na prvnim rádku bude text "-----INFO O LEDNICKACH----- ",
     * na dalsich radkach bude vzdy rok vyroby lednick, dvojtecka a popis spotreby. (Vyuzijte metodu printInfo() tridy Fridge.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O LEDNICKACH-----");
        fridge.printInfo
        System.out.println("-----");
    }
}
