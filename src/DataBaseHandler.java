import java.sql.*;

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
}
