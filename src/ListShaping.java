import java.util.*;

/*
В дальнейшем думаю разбить класс на более маленькие классы.
Он получился слишком перегруженным с моей точки зрения
 */
public class ListShaping {
    private Treatment tr;
    private Pish pishnitskiy;
    private Sel selyanichev;
    private Yud yudina;
    private Gan ganicheva;
    private Vin vinogradova;
    private List<Integer> finRait;
    private List<Integer> finalRaitAfterSort;
    private List<String> prepodsAfterSort;
    private List<String> worksAfterSort;
    private List<Integer> numOfWorksAfterSort;


    public ListShaping(Treatment tr){
        this.tr = tr;
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
                    finRait.add(vinogradova.final_Cost);
                    break;
            }
        }
    }

    private void raitingForm(){
        List<String> tmpPrepods = tr.getPrepods();
        List<String> tmpWorks = tr.getWorks();
        List<Integer> tmpNums = tr.getNum();
        SortedSet<Integer> values = new TreeSet<Integer>(finRait);


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
                    Integer ns = tmpNums.get(j);
                    prepodsAfterSort.add(pr);
                    worksAfterSort.add(wk);
                    numOfWorksAfterSort.add(ns);
                }
            }
        }


        System.out.println(finalRaitAfterSort);//Тут значения
        System.out.println(prepodsAfterSort);//Тут фамилии
        System.out.println(worksAfterSort);//Тут работы
        System.out.println(numOfWorksAfterSort);//Количество работ
    }

    public List<Task> eventCreating(){
        List<Task> myEvents = new ArrayList<Task>();
        for(int i=0;i<worksAfterSort.size();i++){
            myEvents.add(new Task(prepodsAfterSort.get(i), worksAfterSort.get(i),numOfWorksAfterSort.get(i), finalRaitAfterSort.get(i)));
        }
        return myEvents;
    }
}
