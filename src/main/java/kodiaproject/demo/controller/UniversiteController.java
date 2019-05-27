package kodiaproject.demo.controller;


import kodiaproject.demo.model.UniversityDetailModel;
import kodiaproject.demo.model.UniversityRequestModel;
import kodiaproject.demo.service.UniversityService;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Data
public class UniversiteController {

    private final UniversityService universityService;

    @GetMapping("universities")
    public List<UniversityRequestModel> getUniversities() {

        List<UniversityRequestModel> universities = universityService.getUniversities();
        return universities;
    }

    @GetMapping("universities/{id}")
    public UniversityDetailModel getUniversity(@PathVariable("id") int id) {
        UniversityDetailModel university = universityService.findUniversity(id);
        return university;
    }

}
