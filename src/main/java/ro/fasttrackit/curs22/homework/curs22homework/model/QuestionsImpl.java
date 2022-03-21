package ro.fasttrackit.curs22.homework.curs22homework.model;

import org.springframework.data.domain.Page;

import java.util.List;

public interface QuestionsImpl {
    List<Questions> getAll();
    void saveQuestion(Questions questions);
    Questions getQuestionById(int id);
    void deleteQuestionById(int id);
    Page<Questions> findPaginated(int pageNo, int pageSize);
}
