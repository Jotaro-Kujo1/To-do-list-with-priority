public class Pish extends Prepod implements Kursach, Laba{
    private int kursach_Cost;
    private int laba_Cost;

    public Pish(){
        kursach_Cost = kursach_Default_Cost;
        laba_Cost = laba_Default_Cost;
    }

    public void newKursachCost(){
        kursach_Cost = kursach_Default_Cost * 5;
    }
    public void newLabaCost(){
        laba_Cost = laba_Default_Cost * 5;
    }
}
