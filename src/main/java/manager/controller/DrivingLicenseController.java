package manager.controller;

import manager.data.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DrivingLicenseController {

    private DrivingLicenseService drivingLicenseService;

    public DrivingLicenseController(DrivingLicenseService drivingLicenseService) {
        this.drivingLicenseService = drivingLicenseService;
    }

    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return drivingLicenseService.getAllQuestions();
    }

    @GetMapping("/questions/id/{id}")
    public Optional<Question> getQuestionById(@PathVariable("id") int id) {
        return drivingLicenseService.getQuestionById(id);
    }

    @GetMapping("/questions/type/{type}")
    public List<Question> getQuestionsByType(@PathVariable("type") String type){
        return drivingLicenseService.getQuestionsByType(type);
    }

    @GetMapping("/questions/basictest")
    public List<Question> getBasicPartOfTest(){
        return drivingLicenseService.getBasicTest();
    }

}