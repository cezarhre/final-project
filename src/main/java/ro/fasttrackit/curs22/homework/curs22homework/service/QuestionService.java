package ro.fasttrackit.curs22.homework.curs22homework.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ro.fasttrackit.curs22.homework.curs22homework.model.Question;
import ro.fasttrackit.curs22.homework.curs22homework.repository.QuestionRepository;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private final QuestionRepository repository;

    public QuestionService(QuestionRepository repository) {
        this.repository = repository;
    }

    public List<Question> getAll(){
        return repository.findAll();
    }

    public void saveQuestion(Question questions) {
        this.repository.save(questions);
    }

    public Question getQuestionById(int id) {
        Optional<Question> optional = repository.findById(id);
        Question questions;
        if (optional.isPresent()) {
            questions = optional.get();
        } else {
            throw new RuntimeException(" Question not found for id :: " + id);
        }
        return questions;
    }

    public void deleteQuestionById(int id) {
        this.repository.deleteById(id);
    }

    public Page<Question> findPaginated (int pageNo, int pageSize){
            Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
            return this.repository.findAll(pageable);
    }
}