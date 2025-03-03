package elektroshop;

public class Fridge {
    private String znacka;
    private String model;
    private int rokVyroby;
    private Narocnost narocnost;

public Fridge(String znacka, String model, int rokVyroby,Narocnost narocnost){
    this.znacka = znacka;
    this.model = model;
    this.rokVyroby = rokVyroby;
    this.narocnost = narocnost;
}
public int getRokVyroby() {
    return rokVyroby;
}
public void printInfo(){
        System.out.print("Rok výroby: "+getRokVyroby());

}
}