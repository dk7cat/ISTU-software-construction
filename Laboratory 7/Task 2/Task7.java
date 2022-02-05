import java.io.IOException;

public class Task7 {
    public static void main(String[] args) throws IOException {
        // Проверка пациентов
//        PatientsXMLValidator.validate("Laboratory 7/Task 2/Patients.xml", "Laboratory 7/Task 2/XMLPatientSchema.xsd");
        // Проверка тестов
        TestsJSONValidator jsonValidator = new TestsJSONValidator();
        jsonValidator.validate("Laboratory 7/Task 2/Tests.json");
    }
}
