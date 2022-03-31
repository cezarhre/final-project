package ro.fasttrackit.curs22.homework.curs22homework.model;

import javax.persistence.Entity;

@Entity
public class QuestionForm extends Question{
    private String quest;
    private String opt1;
    private String opt2;
    private String opt3;
    private boolean valid1;
    private boolean valid2;
    private boolean valid3;

    public QuestionForm(){
    }

    @Override
    public String getQuest() {
        return quest;
    }

    @Override
    public void setQuest(String quest) {
        this.quest = quest;
    }

    @Override
    public String getOpt1() {
        return opt1;
    }

    @Override
    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    @Override
    public String getOpt2() {
        return opt2;
    }

    @Override
    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    @Override
    public String getOpt3() {
        return opt3;
    }

    @Override
    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public boolean isValid1() {
        return valid1;
    }

    public void setValid1(boolean valid1) {
        this.valid1 = valid1;
    }

    public boolean isValid2() {
        return valid2;
    }

    public void setValid2(boolean valid2) {
        this.valid2 = valid2;
    }

    public boolean isValid3() {
        return valid3;
    }

    public void setValid3(boolean valid3) {
        this.valid3 = valid3;
    }
}
