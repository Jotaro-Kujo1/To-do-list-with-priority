public class Yud extends Prepod implements Kursach,Laba{
    private int kursach_Cost;
    private int laba_Cost;

    public Yud(){
        kursach_Cost = kursach_Default_Cost;
        laba_Cost = laba_Default_Cost;
    }

    public void newKursachCost(){
        kursach_Cost = kursach_Default_Cost * 3;
    }
    public void newLabaCost(){
        laba_Cost = laba_Default_Cost * 4;
    }
}
