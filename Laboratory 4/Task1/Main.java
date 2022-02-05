import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException {
//      Создаем менеджера подключения к БД и создаем новое соединение
        DBManager dbManager = new DBManager();
        Connection connection =  dbManager.getConnection();
//      Получаем или изменяем данные БД
        DBFetcher fetcher = new DBFetcher(connection);
        DBChanger changer = new DBChanger(connection);
//        fetcher.getTeacherByNotDay("Tuesday");
//        fetcher.getTeacherByDayAndByAudience("Tuesday", "A-232");
        changer.transferFirstToLast("Tuesday");
//      Закрываем соединение
        connection.close();
    }
}
