package bth4.exercise3;

import java.util.List;

public class QuestionManagement {

    private List<Question> questions;

    public QuestionManagement(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void removeQuestion(Question question) {
        this.questions.remove(question);
    }

    public void showListQuestion(String type) {

    }

    public void practice(String type, int amount) {

    }
}
