package cinema;

public class People {
    private Gender gender;
    private String jmeno;
    private String rodneMesto;

    public Gender getGender() {
        return gender;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getRodneMesto() {
        return rodneMesto;
    }

    public People(String jmeno, String rodneMesto, Gender gender) {
        this.gender = gender;
        this.jmeno = jmeno;
        this.rodneMesto = rodneMesto;
    }

    public void printInfo(){
        System.out.println(jmeno+" "+"-"+" "+gender);
    }

}
