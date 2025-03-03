package elektroshop;

public class Fridge {
    private String znacka;
    private String model;
    private int rokVyroby;
    private Narocnost narocnost;

    public Fridge(String znacka, String model, int rokVyroby, Narocnost narocnost) {
        this.znacka = znacka;
        this.model = model;
        this.rokVyroby = rokVyroby;
        this.narocnost = narocnost;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public Narocnost getNarocnost() {
        return narocnost;
    }

    public void printInfo() {
        System.out.print(getRokVyroby() + ": ");
        switch (narocnost) {
            case A:
                System.out.println("very low");
                break;
            case B:
                System.out.println("low");
                break;
            case C:
                System.out.println("normal");
                break;
            case D:
                System.out.println("above normal");
                break;
            case E:
                System.out.println("high");
                break;
            case F:
                System.out.println("very high");
                break;
            case G:
                System.out.println("extremely high");
                break;
        }
    }
}
