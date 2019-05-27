package kodiaproject.demo.service;


import kodiaproject.demo.model.UniversityDetailModel;
import kodiaproject.demo.model.UniversityRequestModel;

import java.util.List;

public interface UniversityService {
    List<UniversityRequestModel> getUniversities();

    UniversityDetailModel findUniversity(int id);
}
