package kodiaproject.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import kodiaproject.demo.model.UniversityDatabaseModel;
import kodiaproject.demo.repository.UniversityRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
@Data
@EnableJpaAuditing
public class DemoApplication {

    private final UniversityRepository universityRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    CommandLineRunner initialUniversities() {
        return args -> {

            final ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<List<UniversityDatabaseModel>> typeReference = new TypeReference<List<UniversityDatabaseModel>>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream("/universities.json");

            try {

                List<UniversityDatabaseModel> users = objectMapper.readValue(inputStream, typeReference);

                universityRepository.saveAll(users);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
    }

}
