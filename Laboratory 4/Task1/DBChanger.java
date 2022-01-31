import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

public class DBChanger {

    Connection connection;
    DBFetcher fetcher;

    public DBChanger(Connection connection) {
        this.connection = connection;
        this.fetcher = new DBFetcher(this.connection);
    }

    public void transferFirstToLast(String day) throws SQLException {

        String insertQuery = "insert into schedule (id, id_teacher, id_subject, id_audience, id_day, students_quantity)\n" +
                            "values (\n" +
                            "(select max(rowid) from schedule)+1,?,?,?,?,?\n)";
        String deleteQuery = "delete from schedule where id = ?";

        HashMap<String, Integer> result = this.fetcher.getFirstScheduleByDay(day);

        System.out.println(result.toString());

        PreparedStatement deleteStatement = this.connection.prepareStatement(deleteQuery);
        deleteStatement.setInt(1, result.get("id"));

        PreparedStatement insertStatement = this.connection.prepareStatement(insertQuery);
        insertStatement.setInt(1, result.get("id_teacher"));
        insertStatement.setInt(2, result.get("id_subject"));
        insertStatement.setInt(3, result.get("id_audience"));
        insertStatement.setInt(4, result.get("id_day"));
        insertStatement.setInt(5, result.get("students_quantity"));

        deleteStatement.executeUpdate();

        insertStatement.executeUpdate();

        deleteStatement.close();
        insertStatement.close();

    }
}
