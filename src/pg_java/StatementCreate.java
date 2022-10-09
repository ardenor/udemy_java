package pg_java;

public class StatementCreate {
    public static void main(String[] args) {
//        App.query("CREATE TABLE TESTING (ID INT PRIMARY KEY NOT NULL, NAME TEXT NOT NULL, AGE INT NOT NULL)");
        App.selectQuery("SELECT * FROM FILMS LIMIT 2");
        App.modifyQuery("CREATE TABLE distributors (\n" +
                "    did     integer CHECK (did > 100),\n" +
                "    name    varchar(40)\n" +
                ")");
    }
}
