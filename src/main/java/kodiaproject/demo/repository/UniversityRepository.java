package kodiaproject.demo.repository;

import kodiaproject.demo.model.UniversityDatabaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UniversityRepository extends JpaRepository<UniversityDatabaseModel, Integer> {
}
