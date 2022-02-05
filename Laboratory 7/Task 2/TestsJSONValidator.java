import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.security.jgss.GSSUtil;
import org.json.JSONArray;

import java.io.*;
import java.sql.Date;

public class TestsJSONValidator {

    Integer currentId;
    boolean isGood;

    public void validate(String jsonFile) throws IOException {
//        Считываем json файл в java обьект
        ObjectMapper mapper = new ObjectMapper();
        FileReader json = new FileReader(jsonFile);
        Test[] tests = mapper.readValue(json, Test[].class);
        for (Test test: tests) {
//            Производим все проверки
            currentId = test.getIdPatient();
            isGood = true;
            checkIdPatien(test.getIdPatient());
            checkDate(test.getDate());
            checkIdLaboratory(test.getLaboratoryId());
            checkPrecision(test.getPrecision());
            checkResult(test.getResult());
            checkType(test.getType());
            if (isGood) {
                System.out.println("Test for patient " + currentId + " successfully completed.");
            }
        }
    }
// Проверка идентификатор пациента
    public void checkIdPatien(Integer value) {
        if (value <= 0) {
            System.out.println("Wrong id");
            isGood = false;
        }
    }
    // Проверка даты теста
    public void checkDate(String value) {
        try {
            Date.valueOf(value);
        } catch (Exception e) {
            System.out.println("Wrong date at id " + currentId);
            isGood = false;
        }
    }
    // Проверка типа теста
    public void checkType(String value) {
        if (!(value.equals("lgM") || value.equals("lgG"))) {
            System.out.println("Wrong type at id " + currentId);
            isGood = false;
        }
    }
    // Проверка точности теста
    public void checkPrecision(String value) {
        if (!(value.equals("quantitative") || value.equals("qualitative"))) {
            System.out.println("Wrong precision at id " + currentId);
            isGood = false;
        }
    }
    // Проверка идентификатора лаборатории
    public void checkIdLaboratory(Integer value) {
        if (value <= 0) {
            System.out.println("Wrong laboratory id at id " + currentId);
            isGood = false;
        }
    }
    // Проверка результата теста
    public void checkResult(String value) {
        if (!(value.equals("positive") || value.equals("negative"))) {
            System.out.println("Wrong result at id " + currentId);
            isGood = false;
        }
    }
}
