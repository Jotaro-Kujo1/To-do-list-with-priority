import java.util.*;

public class ListShaping {
    private Treatment tr;
    private Pish pishnitskiy;
    private Sel selyanichev;
    private Yud yudina;
    private Gan ganicheva;
    private Vin vinogradova;
    private Map<String,Integer> raiting;
    private List<Integer> finRait;
    private List<Integer> finalRaitAfterSort;
    private List<String> prepodsAfterSort;

    public ListShaping(){
        tr = new Treatment();
        raiting = new HashMap<String, Integer>();
        finRait = new ArrayList<Integer>();
        finalRaitAfterSort = new ArrayList<Integer>();
        prepodsAfterSort = new ArrayList<String>();
        tr.arraysSplit();
        classCreating();
        raitingForm();
    }

    private void classCreating(){
        List<String> tmpPrepods = tr.getPrepods();
        List<Integer> tmpNums = tr.getNum();
        List<String> tmpWorks = tr.getWorks();
        for(int i=0;i<tmpPrepods.size();i++){
            String str = tmpPrepods.get(i);
            String temp;
            switch(str){
                case("Пышницкий"):
                    pishnitskiy = new Pish();
                    temp = tmpWorks.get(i);
                    System.out.println("Пыша заспавнился");
                    pishnitskiy.setNum_Of_Works(tmpNums.get(i));
                    switch (temp){
                        case("лаба"):
                            pishnitskiy.calculationFinalCostLaba();
                            break;
                        case("курсач"):
                            pishnitskiy.calculationFinalCostKursach();
                            break;
                    }
                    //pishnitskiy.calculationFinalCostLaba();
                    raiting.put(pishnitskiy.getName(),pishnitskiy.final_Cost);
                    finRait.add(pishnitskiy.final_Cost);
                    break;
                case("Селяничев"):
                    selyanichev = new Sel();
                    temp = tmpWorks.get(i);
                    System.out.println("Селян заспавнился");
                    selyanichev.setNum_Of_Works(tmpNums.get(i));
                    switch (temp){
                        case("лаба"):
                            selyanichev.calculationFinalCostLaba();
                            break;
                        case("курсач"):
                            selyanichev.calculationFinalCostKursach();
                            break;
                    }
                    //selyanichev.calculationFinalCostLaba();
                    raiting.put(selyanichev.getName(),selyanichev.final_Cost);
                    finRait.add(selyanichev.final_Cost);
                    break;
                case("Юдина"):
                    yudina = new Yud();
                    temp = tmpWorks.get(i);
                    System.out.println("Юдина заспавнился");
                    yudina.setNum_Of_Works(tmpNums.get(i));
                    switch (temp){
                        case("лаба"):
                            yudina.calculationFinalCostLaba();
                            break;
                        case("курсач"):
                            yudina.calculationFinalCostKursach();
                            break;
                    }
                    //yudina.calculationFinalCostLaba();
                    raiting.put(yudina.getName(),yudina.final_Cost);
                    finRait.add(yudina.final_Cost);
                    break;
                case("Ганичева"):
                    ganicheva = new Gan();
                    temp = tmpWorks.get(i);
                    System.out.println("Ганичева заспавнился");
                    ganicheva.setNum_Of_Works(tmpNums.get(i));
                    switch (temp){
                        case("лаба"):
                            ganicheva.calculationFinalCostLaba();
                            break;
                        case("курсач"):
                            ganicheva.calculationFinalCostKursach();
                            break;
                    }
                    //ganicheva.calculationFinalCostLaba();
                    raiting.put(ganicheva.getName(),ganicheva.final_Cost);
                    finRait.add(ganicheva.final_Cost);
                    break;
                case("Виноградова"):
                    vinogradova = new Vin();
                    temp = tmpWorks.get(i);
                    System.out.println("Виноградова заспавнился");
                    vinogradova.setNum_Of_Works(tmpNums.get(i));
                    switch (temp){
                        case("лаба"):
                            vinogradova.calculationFinalCostLaba();
                            break;
                        case("курсач"):
                            vinogradova.calculationFinalCostKursach();
                            break;
                    }
                    //vinogradova.calculationFinalCostLaba();
                    raiting.put(vinogradova.getName(),vinogradova.final_Cost);
                    finRait.add(vinogradova.final_Cost);
                    break;
            }
        }
    }

    private void raitingForm(){
        System.out.println(raiting);
        List<String> tmpPrepods = tr.getPrepods();
        List<Integer> tmpNums = tr.getNum();
        SortedSet<Integer> values = new TreeSet<Integer>(raiting.values());
        List<Integer> valuesCopy = new ArrayList<Integer>();//Сортированный по убыванию массив баллов

        System.out.print("sorted");
        System.out.println(values);

        for(int i=0;i<tmpPrepods.size();i++){
            Integer a = values.last();
            valuesCopy.add(a);
            values.remove(a);
        }

        System.out.print("sorted again");
        System.out.println(valuesCopy);

        for(int i=0;i<valuesCopy.size();i++){
            int sorted = valuesCopy.get(i);
            for(int j=0;j<finRait.size();j++){
                int nonsorted = finRait.get(j);
                if(sorted == nonsorted){
                    String heh = tmpPrepods.get(j);
                    prepodsAfterSort.add(heh);
                }
            }
        }

        System.out.println("/////////////////");
        System.out.println(valuesCopy);//Тут значения
        System.out.println(prepodsAfterSort);//Тут фамилии
    }
}
