package kodiaproject.demo.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "universities")
@EntityListeners(AuditingEntityListener.class)
public class UniversityDatabaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(value ="hibernateid")
    private Integer id;
    @Column(unique = true, nullable = false, name = "api_id")
   @JsonProperty(value = "id")
    private int apiId;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    @JsonProperty(value = "web_page")
    private String webPage;
    @Column(nullable = false)
    private String type;

    @Column(nullable = false, name = "founded_at")
    @JsonProperty(value = "founded_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String foundedDate;
    @Column(nullable = false, name = "created_at")
    @CreatedDate
    @Temporal(TemporalType.DATE)
    private Date createdDate;

    @Column(nullable = false, name = "updated_at")
    @LastModifiedDate
    @Temporal(TemporalType.DATE)
    private Date updatedDate;
    @OneToMany(mappedBy = "universityDatabaseModel")
    List<StudentDatabaseModel> studentDatabaseModels;

}
