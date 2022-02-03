import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test {

    @JsonProperty("id_patient")
    int id_patient;

    @JsonProperty("date")
    String date;

    @JsonProperty("type")
    String type;

    @JsonProperty("precision")
    String precision;

    @JsonProperty("laboratory_id")
    int laboratory_id;

    @JsonProperty("result")
    String result;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("id_patient")
    public Integer getIdPatient() {
        return id_patient;
    }

    @JsonProperty("id_patient")
    public void setIdPatient(Integer idPatient) {
        this.id_patient = idPatient;
    }

    @JsonProperty("laboratory_id")
    public Integer getLaboratoryId() {
        return laboratory_id;
    }

    @JsonProperty("laboratory_id")
    public void setLaboratoryId(Integer laboratoryId) {
        this.laboratory_id = laboratoryId;
    }

    @JsonProperty("precision")
    public String getPrecision() {
        return precision;
    }

    @JsonProperty("precision")
    public void setPrecision(String precision) {
        this.precision = precision;
    }

    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
