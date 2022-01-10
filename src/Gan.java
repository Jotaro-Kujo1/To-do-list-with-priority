public class Gan extends Prepod implements Kursach,Laba{
    private int kursach_Cost;
    private int laba_Cost;
    private String name;

    public Gan(){
        kursach_Cost = kursach_Default_Cost;
        laba_Cost = laba_Default_Cost;
        name = "Ганичева";
    }

    public void newKursachCost(){
        kursach_Cost = kursach_Default_Cost * 4;
    }
    public void newLabaCost(){
        laba_Cost = laba_Default_Cost * 3;
    }
    public void calculationFinalCostKursach() {
        final_Cost = kursach_Cost * num_Of_Works;
    }

    @Override
    public void calculationFinalCostLaba() {
        final_Cost = laba_Cost * num_Of_Works;
    }
}
