package ro.fasttrackit.curs22.homework.curs22homework.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ro.fasttrackit.curs22.homework.curs22homework.model.Questions;
import ro.fasttrackit.curs22.homework.curs22homework.model.QuestionsImpl;
import ro.fasttrackit.curs22.homework.curs22homework.repository.QuestionsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionsService implements QuestionsImpl {

    private final QuestionsRepository repository;

    public QuestionsService(QuestionsRepository repository) {
        this.repository = repository;
    }

    public List<Questions> getAll(){
        return repository.findAll();
    }

    public void saveQuestion(Questions questions) {
        this.repository.save(questions);
    }

    public Questions getQuestionById(int id) {
        Optional<Questions> optional = repository.findById(id);
        Questions questions = null;
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

    public Page<Questions> findPaginated ( int pageNo, int pageSize){
            Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
            return this.repository.findAll(pageable);
    }
}