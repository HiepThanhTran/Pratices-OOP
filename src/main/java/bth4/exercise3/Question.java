package bth4.exercise3;

import java.util.List;

public abstract class Question {

    private static int id = 0;
    private String questId;
    private String content;

    {
        id++;
        questId = String.format("%03d", id);
    }

    public Question(String content) {
        this.content = content;
    }

    public String getQuestId() {
        return questId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("\n- Mã câu hỏi: %s\n- Nội dung: %s", questId, content);
    }

    public abstract boolean isAnswer(List<Choice> answers);
}
