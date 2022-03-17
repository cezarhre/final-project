package ro.fasttrackit.curs22.homework.curs22homework.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.fasttrackit.curs22.homework.curs22homework.service.QuestionsService;

@Controller
@RequestMapping("questions")
public class QuestionsController {

    private QuestionsService service;

    public QuestionsController(QuestionsService service) {
        this.service = service;
    }

    @GetMapping
    String getTablesPage(Model model){
        model.addAttribute("questions", service.getAll());
        return "questions";
    }
}
