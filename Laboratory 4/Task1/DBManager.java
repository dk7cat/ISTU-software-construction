import org.sqlite.JDBC;

import java.sql.*;

public class DBManager {
    private static final String CON_STR = "jdbc:sqlite:Laboratory 4/Task 1/task4.db";

    public Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        return DriverManager.getConnection(CON_STR);
    }

}
