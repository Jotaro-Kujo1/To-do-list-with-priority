import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

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
                    break;
                case("Селяничев"):
                    selyanichev = new Sel();
                    System.out.println("Селян заспавнился");
                    selyanichev.setNum_Of_Works(tmpNums.get(i));
                    selyanichev.calculationFinalCostLaba();
                    break;
                case("Юдина"):
                    yudina = new Yud();
                    System.out.println("Юдина заспавнился");
                    yudina.setNum_Of_Works(tmpNums.get(i));
                    yudina.calculationFinalCostLaba();
                    break;
                case("Ганичева"):
                    ganicheva = new Gan();
                    System.out.println("Ганичева заспавнился");
                    ganicheva.setNum_Of_Works(tmpNums.get(i));
                    ganicheva.calculationFinalCostLaba();
                    break;
                case("Виноградова"):
                    vinogradova = new Vin();
                    System.out.println("Виноградова заспавнился");
                    vinogradova.setNum_Of_Works(tmpNums.get(i));
                    vinogradova.calculationFinalCostLaba();
                    break;
            }
        }
    }

    private void raitingForm(){


    }
}
