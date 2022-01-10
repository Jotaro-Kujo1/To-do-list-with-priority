import java.util.*;

public class ListShaping {
    private Treatment tr;
    private Pish pishnitskiy;
    private Sel selyanichev;
    private Yud yudina;
    private Gan ganicheva;
    private Vin vinogradova;
    private Map<String,Integer> raiting;

    public ListShaping(){
        tr = new Treatment();
        raiting = new HashMap<String, Integer>();
        tr.arraysSplit();
        classCreating();
        raitingForm();
    }

    private void classCreating(){
        List<String> tmpPrepods = tr.getPrepods();
        List<Integer> tmpNums = tr.getNum();
        for(int i=0;i<tmpPrepods.size();i++){
            String str = tmpPrepods.get(i);
            switch(str){
                case("Пышницкий"):
                    pishnitskiy = new Pish();
                    System.out.println("Пыша заспавнился");
                    pishnitskiy.setNum_Of_Works(tmpNums.get(i));
                    pishnitskiy.calculationFinalCostLaba();
                    raiting.put(pishnitskiy.getName(),pishnitskiy.final_Cost);
                    break;
                case("Селяничев"):
                    selyanichev = new Sel();
                    System.out.println("Селян заспавнился");
                    selyanichev.setNum_Of_Works(tmpNums.get(i));
                    selyanichev.calculationFinalCostLaba();
                    raiting.put(selyanichev.getName(),selyanichev.final_Cost);
                    break;
                case("Юдина"):
                    yudina = new Yud();
                    System.out.println("Юдина заспавнился");
                    yudina.setNum_Of_Works(tmpNums.get(i));
                    yudina.calculationFinalCostLaba();
                    raiting.put(yudina.getName(),yudina.final_Cost);
                    break;
                case("Ганичева"):
                    ganicheva = new Gan();
                    System.out.println("Ганичева заспавнился");
                    ganicheva.setNum_Of_Works(tmpNums.get(i));
                    ganicheva.calculationFinalCostLaba();
                    raiting.put(ganicheva.getName(),ganicheva.final_Cost);
                    break;
                case("Виноградова"):
                    vinogradova = new Vin();
                    System.out.println("Виноградова заспавнился");
                    vinogradova.setNum_Of_Works(tmpNums.get(i));
                    vinogradova.calculationFinalCostLaba();
                    raiting.put(vinogradova.getName(),vinogradova.final_Cost);
                    break;
            }
        }
    }

    private void raitingForm(){
        System.out.println(raiting);
        SortedSet<Integer> values = new TreeSet<Integer>(raiting.values());
        System.out.println(values);
    }
}
