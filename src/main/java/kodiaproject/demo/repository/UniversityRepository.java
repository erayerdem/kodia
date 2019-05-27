package kodiaproject.demo.repository;


import kodiaproject.demo.model.UniversityDetailModel;
import kodiaproject.demo.model.UniversityRequestModel;
import kodiaproject.demo.model.UniversityDatabaseModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UniversityRepository extends JpaRepository<UniversityDatabaseModel, Integer> {



    List<UniversityRequestModel> findAllBy();

    Optional<UniversityDetailModel> findByApiId(@Param("apiId") int id);


}
