import javafx.collections.ObservableList;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseHandler extends Configs{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException{
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }

    public void userRegistration(String login, String password){
        String sqlQuery = "INSERT INTO todolist.users (login,password) VALUES(?,?)";
        try(PreparedStatement statement = getDbConnection().prepareStatement(sqlQuery)){
            statement.setString(1,login);
            statement.setString(2,password);
            statement.execute();
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public boolean userLogIn(String login, String password) {
        ResultSet rset = null;
        String sqlQuery = "SELECT * FROM todolist.users WHERE login =? AND password =?";
        try (PreparedStatement statement = getDbConnection().prepareStatement(sqlQuery)) {
            statement.setString(1, login);
            statement.setString(2, password);
            rset = statement.executeQuery();
            if(rset.next())return true;
            else return false;
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }
    }


    public void addPrepod(ObservableList<Task> evv){
        for (Task i:evv
             ) {
            String sqlQuery = "INSERT INTO todolist.works (name,work,nums,raiting) VALUES(?,?,?,?)";
            try(PreparedStatement statement = getDbConnection().prepareStatement(sqlQuery)){
                statement.setString(1,i.getPr());
                statement.setString(2,i.getWork());
                statement.setInt(3,i.getNums());
                statement.setInt(4,i.getRaiting());
                statement.execute();
            }catch (SQLException | ClassNotFoundException ex){
                ex.printStackTrace();
            }
        }
    }

    public List<Task> getPrepodAfterSingIn(){
        ResultSet rset = null;
        String sqlQuery = "SELECT * FROM todolist.works";
        List<Task> list = new ArrayList<>();
        Task task = null;
        try(PreparedStatement statement = getDbConnection().prepareStatement(sqlQuery)){
            rset = statement.executeQuery();
            statement.execute();
            while(rset.next()){
                String pr = rset.getString(1);
                String work = rset.getString(2);
                int nums = Integer.parseInt(rset.getString(3));
                int raiting = Integer.parseInt(rset.getString(4));
                task = new Task(pr,work,nums,raiting);
                list.add(task);
            }
        }catch(SQLException | ClassNotFoundException ex){
            ex.getMessage();
        }
        return list;
    }
}
