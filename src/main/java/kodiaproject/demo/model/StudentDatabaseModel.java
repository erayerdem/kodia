package kodiaproject.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
@Entity
public class StudentDatabaseModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(nullable = false, name = "university_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UniversityDatabaseModel universityDatabaseModel;
    @Column(nullable = false)
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(nullable = false, name = "started_at")
    private Date startedDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(nullable = false, name = "created_at")
    @CreatedDate
    private Date createdDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(nullable = false, name = "updated_at")
    @LastModifiedDate
    private Date updatedDate;


}
