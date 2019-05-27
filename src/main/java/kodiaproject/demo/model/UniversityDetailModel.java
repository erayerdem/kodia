package kodiaproject.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor

public class UniversityDetailModel implements Serializable {


    @JsonProperty(value = "id")
    private int id;

    @JsonProperty(value = "api_id")
    private int apiId;

    private String name;

    private String city;

    @JsonProperty(value = "web_page")
    private String webPage;

    private String type;


    @JsonProperty(value = "founded_at")

    private String foundedDate;

    @JsonProperty(value = "students")
    private List<StudentDatabaseModel> studentDatabaseModels;


}
