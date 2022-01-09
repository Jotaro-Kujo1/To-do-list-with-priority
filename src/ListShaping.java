import java.util.List;
import java.util.ArrayList;

public class ListShaping {
    private Treatment tr;
    private Pish pishnitskiy;
    private Sel selyanichev;
    private Yud yudina;
    private Gan ganicheva;
    private Vin vinogradova;

    public ListShaping(){
        tr = new Treatment();
        tr.arraysSplit();
        classCreating();
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
                    break;
                case("Селяничев"):
                    selyanichev = new Sel();
                    System.out.println("Селян заспавнился");
                    selyanichev.setNum_Of_Works(tmpNums.get(i));
                    break;
                case("Юдина"):
                    yudina = new Yud();
                    System.out.println("Юдина заспавнился");
                    yudina.setNum_Of_Works(tmpNums.get(i));
                    break;
                case("Ганичева"):
                    ganicheva = new Gan();
                    System.out.println("Ганичева заспавнился");
                    ganicheva.setNum_Of_Works(tmpNums.get(i));
                    break;
                case("Виноградова"):
                    vinogradova = new Vin();
                    System.out.println("Виноградова заспавнился");
                    vinogradova.setNum_Of_Works(tmpNums.get(i));
                    break;
            }
        }
    }
}
