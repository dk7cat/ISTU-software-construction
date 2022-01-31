import java.sql.*;
import java.util.HashMap;

public class DBFetcher {

    Connection connection;

    public DBFetcher(Connection connection) {

        this.connection = connection;
    }

    public HashMap<String, Integer> getFirstScheduleByDay(String day) throws SQLException {

        String query = "Select id, id_teacher, id_subject, id_audience, id_day, students_quantity from schedule\n" +
                        "where id in (select min(id) from schedule where id_day in " +
                        "(select id from day where name like ?))";
        HashMap<String, Integer> result = new HashMap<>();
        PreparedStatement preparedStatement = this.connection.prepareStatement(query);
        preparedStatement.setString(1, day);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            result.put("id", resultSet.getInt("id"));
            result.put("id_teacher", resultSet.getInt("id_teacher"));
            result.put("id_subject", resultSet.getInt("id_subject"));
            result.put("id_audience", resultSet.getInt("id_audience"));
            result.put("id_day", resultSet.getInt("id_day"));
            result.put("students_quantity", resultSet.getInt("students_quantity"));
        }
        preparedStatement.close();

        return result;
    }

    public void getTeacherByDayAndByAudience(String day, String audience) throws SQLException {

        String query = "Select first_name, last_name, patronymic from teacher \n" +
                "join schedule \n" +
                "on teacher.id = schedule.id_teacher\n" +
                "where schedule.id_day in (select id from day where name like ?)\n" +
                "and schedule.id_audience in (select id from audience where name like ?)";

        PreparedStatement preparedStatement = this.connection.prepareStatement(query);
        preparedStatement.setString(1, day);
        preparedStatement.setString(2, audience);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String patronymic = resultSet.getString("patronymic");
            System.out.println(firstName + " " + patronymic + " " + lastName);
        }
        preparedStatement.close();
    }

    public void getTeacherByNotDay(String day) throws SQLException {

        String query = "Select first_name, last_name, patronymic from teacher \n" +
                "join schedule \n" +
                "on teacher.id = schedule.id_teacher\n" +
                "where schedule.id_day not in (select id from day where name like ?)\n";

        PreparedStatement preparedStatement = this.connection.prepareStatement(query);
        preparedStatement.setString(1, day);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String patronymic = resultSet.getString("patronymic");
            System.out.println(firstName + " " + patronymic + " " + lastName);
        }
        preparedStatement.close();
    }
}
