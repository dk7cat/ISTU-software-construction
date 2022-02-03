import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.security.jgss.GSSUtil;
import org.json.JSONArray;

import java.io.*;
import java.sql.Date;

public class TestsJSONValidator {

    Integer currentId;
    boolean isGood;

    public void validate(String jsonFile) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        FileReader json = new FileReader(jsonFile);
        Test[] tests = mapper.readValue(json, Test[].class);
        for (Test test: tests) {
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

    public void checkIdPatien(Integer value) {
        if (value <= 0) {
            System.out.println("Wrong id");
            isGood = false;
        }
    }

    public void checkDate(String value) {
        try {
            Date.valueOf(value);
        } catch (Exception e) {
            System.out.println("Wrong date at id " + currentId);
            isGood = false;
        }
    }

    public void checkType(String value) {
        if (!(value.equals("lgM") || value.equals("lgG"))) {
            System.out.println("Wrong type at id " + currentId);
            isGood = false;
        }
    }

    public void checkPrecision(String value) {
        if (!(value.equals("quantitative") || value.equals("qualitative"))) {
            System.out.println("Wrong precision at id " + currentId);
            isGood = false;
        }
    }

    public void checkIdLaboratory(Integer value) {
        if (value <= 0) {
            System.out.println("Wrong laboratory id at id " + currentId);
            isGood = false;
        }
    }

    public void checkResult(String value) {
        if (!(value.equals("positive") || value.equals("negative"))) {
            System.out.println("Wrong result at id " + currentId);
            isGood = false;
        }
    }
}
