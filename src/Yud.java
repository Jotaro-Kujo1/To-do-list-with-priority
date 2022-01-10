public class Yud extends Prepod implements Kursach,Laba{
    private int kursach_Cost;
    private int laba_Cost;
    private String name;

    public Yud(){
        kursach_Cost = kursach_Default_Cost;
        laba_Cost = laba_Default_Cost;
        name = "Юдина";
        newLabaCost();
    }

    public void newKursachCost(){
        kursach_Cost = kursach_Default_Cost * 3;
    }
    public void newLabaCost(){
        laba_Cost = laba_Default_Cost * 4;
    }
    public void calculationFinalCostKursach() {
        final_Cost = kursach_Cost * num_Of_Works;
    }

    @Override
    public void calculationFinalCostLaba() {
        final_Cost = laba_Cost * num_Of_Works;
    }
    public String getName(){
        return name;
    }
}
