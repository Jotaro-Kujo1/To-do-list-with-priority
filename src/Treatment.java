import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Treatment {
    private String res;
    //private int countr;
    private List<String> prepods;
    private List<String> works;
    private List<Integer> num;

    public Treatment(){
        res = new String();
        //countr = 0;
        prepods = new ArrayList<String>();
        works = new ArrayList<String>();
        num = new ArrayList<Integer>();
    }

    private void start(){
        int countr;
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько всего работ?:");
        countr = in.nextInt();
        System.out.println(" Введите данные в формате (Фамилия препода, работа, количество работ), пример: Пышницкий лаба 3 ");
        for(int i=0;i<=countr;i++){
           res += in.nextLine() + " ";
        }
        System.out.println(res);
    }


    private String[] separation(){
        start();
        String ress = res.replaceFirst("^ *", "");
        String [] str = ress.split(" ");
        return str;
    }


    public void arraysSplit(){
        int i = 0;
        String [] str = separation();

        while(i<str.length){
            prepods.add(str[i]);
            works.add(str[i+1]);
            num.add(Integer.parseInt(str[i+2]));
            i+=3;
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
    public void display3(){
        for (Integer i:
             num) {
            System.out.println(i);
        }
    }
    public List<String> getPrepods(){
        return prepods;
    }
    public List<String> getWorks(){
        return works;
    }
    public List<Integer> getNum(){
        return num;
    }

}
