
import java.sql.*;
import java.time.LocalDateTime;

public class ConnectorSQL {
    final String url = "jdbc:mysql://localhost/SibNet";
    final String username = "root";
    final String password = "password";
    public Table tableName = new Table();
    public LocalDateTime date;



    public  void AddInTable(String id, String name, String otd) throws SQLException {

        Connection connection = null;
        Statement statement = null;
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement();
        String SQL = "INSERT INTO " + "Test" + " (id, name, otd)  VALUES (?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(SQL);
        stmt.setString(1,id);
        stmt.setString(2,name);
        stmt.setString(3,otd);

        stmt.executeUpdate();

        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }

    public void  CreateTable(){


        Connection connection = null;
        Statement statement = null;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            connection = DriverManager.getConnection(url, username, password);

            statement = connection.createStatement();




            String SQL = "CREATE TABLE " + "Test" + " (idone INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY," +"id VARCHAR (100), " + "name VARCHAR (1000), " + " otd VARCHAR (100))";

            statement.executeUpdate(SQL);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

            }
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        }


    }


}
