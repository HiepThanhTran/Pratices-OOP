package bth4.exercise3;

import java.util.List;

public class MultipleChoiceQuestion extends Question {

    private List<Choice> choices;
    private Choice answer;

    public MultipleChoiceQuestion(String content, List<Choice> choices, Choice answer) {
        super(content);
        this.choices = choices;
        this.answer = answer;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public Choice getAnswer() {
        return answer;
    }

    public void setAnswer(Choice answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String t = super.toString();
        for (int i = 0; i < choices.size(); i++) {
            String tmp = String.format("%s. %s\n", (char) (1 + 'A'), choices.get(i).getContent());
            builder.append(tmp);
        }
        return String.format("%s\n%s", t, builder);
    }

    @Override
    public boolean isAnswer(List<Choice> answers) {
        return answers.contains(this.answer);
    }
}
