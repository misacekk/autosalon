package elektroshop;

import java.util.Scanner;

public class Items {
    private Fridge[] items;
    private static Scanner sc = new Scanner(System.in);

    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu ledniček. A ty prida do pole items.
     *
     * @param count - pozadovany pocet lednicek
     */
    public void addItems(int count) {
        items = new Fridge[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Zadej značku ledničky");
            String znacka = sc.nextLine();
            System.out.println("Zadej model ledničky");
            String model = sc.nextLine();
            System.out.println("Zadej narocnost ledničky (A-G)");
            String narocnostString = sc.nextLine().toUpperCase();
            Narocnost narocnost = Narocnost.valueOf(narocnostString);
            System.out.println("Zadej rok výroby ledničky");
            int rokVyroby = sc.nextInt();
            sc.nextLine();
            items[i] = new Fridge(znacka, model, rokVyroby, narocnost);
        }
    }

    /**
     * Tato metoda vypise informace o lednickach. Na prvnim rádku bude text "-----INFO O LEDNICKACH----- ",
     * na dalsich radkach bude vzdy rok vyroby lednick, dvojtecka a popis spotreby. (Vyuzijte metodu printInfo() tridy Fridge.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo() {
        System.out.println("-----INFO O LEDNICKACH-----");
        if (items != null) {
            for (Fridge fridge : items) {
                if (fridge != null) {
                    fridge.printInfo();
                }
            }
        }
        System.out.println("-----");
    }

    /**
     * Tato metoda vypíše všechny ledničky s energetickou náročností A
     */
    public void printNarocnostA() {
        System.out.println("Ledničky s náročností A:");
        if (items != null) {
            for (Fridge fridge : items) {
                if (fridge != null && fridge.getNarocnost() == Narocnost.A) {
                    fridge.printInfo();
                }
            }
        }
    }

    /**
     * Tato metoda vypíše počet všech ledniček
     */
    public void printPocetPolozek() {
        System.out.println("Počet všech ledniček: " + (items != null ? items.length : 0));
    }

    /**
     * Tato metoda vypíše počet ledniček jednotlivých energetických náročností
     */
    public void printZajimavosti() {
        int[] pocty = new int[Narocnost.values().length];
        if (items != null) {
            for (Fridge fridge : items) {
                if (fridge != null) {
                    pocty[fridge.getNarocnost().ordinal()]++;
                }
            }
        }
        System.out.println("Počty ledniček dle náročnosti:");
        for (int i = 0; i < Narocnost.values().length; i++) {
            System.out.println(Narocnost.values()[i] + ": " + pocty[i]);
        }
    }
}
