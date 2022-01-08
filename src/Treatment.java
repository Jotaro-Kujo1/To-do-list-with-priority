import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Treatment {
    //private List<Prepod> prepods = new ArrayList<Prepod>();
    private String res;
    private List<String> prepods;
    private List<String> works;

    public Treatment(){
        res = new String();
        prepods = new ArrayList<String>();
        works = new ArrayList<String>();
    }

    private void start(){
        int countr;
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько всего работ?:");
        countr = in.nextInt();
        System.out.println(" Введите данные в формате (Фамилия препода, работа), пример: Пышницкий,лаба ");
        for(int i=0;i<=countr;i++){
           res += in.nextLine() + " ";
        }
        System.out.println(res);
    }

    private List<String> separation(){
        start();
        List<String> tmp = new ArrayList<String>();
        for(String i: res.split(",")){
            tmp.add(i);
        }
        return tmp;
    }

    public void arraysSplit(){
        List<String> tmp = separation();
        for(String i:tmp){
            if(tmp.indexOf(i) == 0 || tmp.indexOf(i)%2==0) prepods.add(i);
            else works.add(i);
        }
    }

    public void display(){
        for (String i:
             prepods) {
            System.out.println(i);
        }
    }
    public void display2(){
        for (String i:
             works) {
            System.out.println(i);
        }
    }
}
