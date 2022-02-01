package manager.controller;

import manager.data.BasicPartOfTest;
import manager.data.Question;
import manager.data.QuestionRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class DrivingLicenseService {

    private QuestionRepository repository;

    public DrivingLicenseService(QuestionRepository repository) {
        this.repository = repository;
    }

    Optional<Question> getQuestionById(int id){
        return repository.findById(id);
    }
    List<Question> getAllQuestions(){
        return repository.findAll();
    }

    List<Question> getQuestionsByType(String type){
        return repository.findByRodzaj(type);
    }

    List<Question> getBasicTest(){
        return new BasicPartOfTest(getQuestionsByType("podstawowy")).getBasic_test();
    }

}
