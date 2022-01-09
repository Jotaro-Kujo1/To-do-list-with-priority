public abstract class Prepod {
    protected int kursach_Default_Cost;
    protected int laba_Default_Cost;
    protected int num_Of_Works;
    protected int final_Cost;

    public Prepod(){
        kursach_Default_Cost = 20;
        laba_Default_Cost = 5;
        num_Of_Works = 0;
        final_Cost = 0;
    }
    public void setNum_Of_Works(int num_Of_Works){
        this.num_Of_Works = num_Of_Works;
    }
    public abstract void calculationFinalCostKursach();

    public abstract void calculationFinalCostLaba();

    public int getFinal_Cost(){
        return final_Cost;
    }
}
