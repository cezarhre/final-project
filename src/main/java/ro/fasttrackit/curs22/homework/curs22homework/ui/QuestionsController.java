package ro.fasttrackit.curs22.homework.curs22homework.ui;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.curs22.homework.curs22homework.model.Questions;
import ro.fasttrackit.curs22.homework.curs22homework.service.QuestionsService;

import java.util.List;

@Controller
public class QuestionsController {

    private final QuestionsService service;

    public QuestionsController(QuestionsService service) {
        this.service = service;
    }

    @GetMapping("questions")
    String viewHomePage(Model model){
        return findPaginated(1, model);
    }

    @GetMapping("/showNewQuestionForm")
    public String showNewQuestionForm(Model model) {
        // create model attribute to bind form data
        Questions questions = new Questions();
        model.addAttribute("questions", questions);
        return "newQuestion";
    }

    @PostMapping("/saveQuestion")
    public String saveQuestion(@ModelAttribute("questions") Questions questions) {
        // save question to database
        service.saveQuestion(questions);
        return "redirect:/questions";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable ( value = "id") int id, Model model) {

        // get question from the service
        Questions questions = service.getQuestionById(id);

        // set question as a model attribute to pre-populate the form
        model.addAttribute("questions", questions);
        return "updateQuestion";
    }

    @GetMapping("/deleteQuestion/{id}")
    public String deleteEmployee(@PathVariable (value = "id") int id) {

        // call delete question method
        this.service.deleteQuestionById(id);
        return "redirect:/questions";
    }

    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,Model model) {
        int pageSize = 4;

        Page<Questions> page = service.findPaginated(pageNo, pageSize);
        List<Questions> questionsList = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());

        model.addAttribute("questionsList", questionsList);
        return "index";
    }



}
