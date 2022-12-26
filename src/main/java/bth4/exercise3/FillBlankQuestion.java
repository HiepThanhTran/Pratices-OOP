package bth4.exercise3;

import java.util.List;

public class FillBlankQuestion extends Question {

    private List<Choice> answers;

    public FillBlankQuestion(String content, List<Choice> answers) {
        super(content);
        this.answers = answers;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String t = super.toString();
        for (int i = 0; i < answers.size(); i++) {
            String tmp = String.format("%s. %s\n", (char) (1 + 'A'), answers.get(i).getContent());
            builder.append(tmp);
        }
        return String.format("%s\n%s", t, builder);
    }

    @Override
    public boolean isAnswer(List<Choice> answers) {
        return this.answers.equals(answers);
    }
}
