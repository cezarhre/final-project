package ro.fasttrackit.curs22.homework.curs22homework.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs22.homework.curs22homework.model.Questions;
import ro.fasttrackit.curs22.homework.curs22homework.repository.QuestionsRepository;

import java.util.List;

@Service
public class QuestionsService {

    private final QuestionsRepository repository;

    public QuestionsService(QuestionsRepository repository) {
        this.repository = repository;
    }
    public List<Questions> getAll(){
        return repository.findAll();
    }
}
