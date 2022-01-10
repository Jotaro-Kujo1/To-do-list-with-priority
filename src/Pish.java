public class Pish extends Prepod implements Kursach, Laba{
    private int kursach_Cost;
    private int laba_Cost;
    private String name;

    public Pish(){
        kursach_Cost = kursach_Default_Cost;
        laba_Cost = laba_Default_Cost;
        name = "Пышницкий";
    }

    public void newKursachCost(){
        kursach_Cost = kursach_Default_Cost * 5;
    }
    public void newLabaCost(){
        laba_Cost = laba_Default_Cost * 5;
    }

    @Override
    public void calculationFinalCostKursach() {
        final_Cost = kursach_Cost * num_Of_Works;
    }

    @Override
    public void calculationFinalCostLaba() {
        final_Cost = laba_Cost * num_Of_Works;
    }
}
