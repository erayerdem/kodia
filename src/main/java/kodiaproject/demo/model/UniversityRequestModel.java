package kodiaproject.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class UniversityRequestModel implements Serializable {
    private  Integer id;

    private   String name;





}
