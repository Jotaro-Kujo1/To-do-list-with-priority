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
    private List<String> worksAfterSort;
    private List<Integer> numOfWorksAfterSort;

    public ListShaping(){
        tr = new Treatment();
        raiting = new HashMap<String, Integer>();
        finRait = new ArrayList<Integer>();
        finalRaitAfterSort = new ArrayList<Integer>();
        prepodsAfterSort = new ArrayList<String>();
        worksAfterSort = new ArrayList<String>();
        numOfWorksAfterSort = new ArrayList<Integer>();
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
                    raiting.put(vinogradova.getName(),vinogradova.final_Cost);
                    finRait.add(vinogradova.final_Cost);
                    break;
            }
        }
    }

    private void raitingForm(){
        List<String> tmpPrepods = tr.getPrepods();
        List<String> tmpWorks = tr.getWorks();
        SortedSet<Integer> values = new TreeSet<Integer>(raiting.values());


        for(int i=0;i<tmpPrepods.size();i++){
            Integer a = values.last();
            finalRaitAfterSort.add(a);
            values.remove(a);
        }



        for(int i=0;i<finalRaitAfterSort.size();i++){
            int sorted = finalRaitAfterSort.get(i);
            for(int j=0;j<finRait.size();j++){
                int nonsorted = finRait.get(j);
                if(sorted == nonsorted){
                    String pr = tmpPrepods.get(j);
                    String wk = tmpWorks.get(j);
                    prepodsAfterSort.add(pr);
                    worksAfterSort.add(wk);
                }
            }
        }


        System.out.println(finalRaitAfterSort);//Тут значения
        System.out.println(prepodsAfterSort);//Тут фамилии
        System.out.println(worksAfterSort);//Тут работы
    }

    public List<Event> eventCreating(){
        List<Event> myEvents = new ArrayList<Event>();
        for(int i=0;i<worksAfterSort.size();i++){
            myEvents.add(new Event(prepodsAfterSort.get(i), worksAfterSort.get(i), finalRaitAfterSort.get(i)));
        }
        return myEvents;
    }
}
