package kodiaproject.demo.service;


import kodiaproject.demo.model.UniversityDetailModel;
import kodiaproject.demo.model.UniversityRequestModel;
import kodiaproject.demo.repository.UniversityRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class UniversityServiceIMP implements UniversityService {
    private final UniversityRepository universityRepository;

    @Override
    public List<UniversityRequestModel> getUniversities() {

        List<UniversityRequestModel> universities = universityRepository.findAllBy();

        return universities;
    }

    @Override
    public UniversityDetailModel findUniversity(int id) {

        Optional<UniversityDetailModel> byId = universityRepository.findByApiId(id);
        if (byId.isPresent()) {
            return byId.get();
        } else throw new RuntimeException();
    }
}
