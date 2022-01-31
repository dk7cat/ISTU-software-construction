import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException {

        DBManager dbManager = new DBManager();
        Connection connection =  dbManager.getConnection();

        DBFetcher fetcher = new DBFetcher(connection);
        DBChanger changer = new DBChanger(connection);
//        fetcher.getTeacherByNotDay("Tuesday");
//        fetcher.getTeacherByDayAndByAudience("Tuesday", "A-232");
        changer.transferFirstToLast("Tuesday");

        connection.close();
    }
}
