package kodiaproject.demo.repository;

import kodiaproject.demo.model.StudentDatabaseModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentDatabaseModel,Integer> {
}
