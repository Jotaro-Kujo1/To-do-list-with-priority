import java.util.Scanner;

public class Registration {
    private String userName;
    private String password;
    private boolean chReg;

    /*
    Проверка на существующий аккаунт будет подтягиваться из базы
    Пока это не реализовано
    */
    public void startReg(){
        Scanner in = new Scanner(System.in);
        System.out.println("У вас уже есть аккаунт?");
        if(in.nextLine().equals("Да")){
            setChReg(checkReg());
        }else{
            System.out.println("Хотите зарегестрироваться?");
            if(in.nextLine().equals("Да")){
                String userNameTmp;
                String passwordTmp;
                System.out.println("Введите логин:");
                userNameTmp = in.nextLine();
                System.out.println("Введите пароль:");
                passwordTmp = in.nextLine();
                setUserName(userNameTmp);
                setPassword(passwordTmp);
                startReg();
            }
        }
    }

    public boolean checkReg(){
        Scanner in = new Scanner(System.in);
        String userNameTmp;
        String passwordTmp;
        System.out.println("Введите логин:");
        userNameTmp = in.nextLine();
        System.out.println("Введите пароль:");
        passwordTmp = in.nextLine();
        if(getUserName().equals(userNameTmp) && getPassword().equals(passwordTmp)) return true;
        else return false;
    }

    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
    public boolean getChReg(){
        return chReg;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setChReg(boolean chReg){
        this.chReg = chReg;
    }
}
