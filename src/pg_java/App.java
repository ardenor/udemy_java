package pg_java;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//class GetSet{
//    private String sqlStatement = "";
//    public String getStatement(){
//        return sqlStatement;
//    }
//    public void setStatement(String sql){
//        this.sqlStatement = sql;
//    }
//}
public class App {
    private final String url = "jdbc:postgresql://localhost/postgres";
    private final String user = "postgres";
    private final String password = "changeit";


    public Connection modifyConnect(String sql){
        Connection conn = null;

        try{
            conn = DriverManager.getConnection(url, user,password);
            System.out.println("Connected to Postgresql successfully");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

            stmt.close();
            conn.close();

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return conn;
    }
    public Connection selectConnect(String sql){
        Connection conn = null;

        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Postgresql successfully");

            Statement stmt = conn.createStatement();

            //String sql1 = sql;//"CREATE TABLE COMPANY (ID INT PRIMARY KEY NOT NULL, NAME TEXT NOT NULL, AGE INT NOT NULL)";

            List<String> dataList = new ArrayList<>();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsMetaData = rs.getMetaData();

            while(rs.next()){
                int count = rsMetaData.getColumnCount();
                for(int i = 1; i <= count; i++){
                    dataList.add(rs.getString(i));
                }

//                dataList.add(rs.getString(2));
//                dataList.add(rs.getString(3));
            }

            System.out.println(dataList);
            //stmt.executeUpdate(sql1);

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return conn;
    }


    public static void selectQuery(String sql){
        App app = new App();
        app.selectConnect(sql);
    }
    public static void modifyQuery(String sql){
        App app = new App();
        app.modifyConnect(sql);
    }
}
