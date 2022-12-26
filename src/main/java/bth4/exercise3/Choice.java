package bth4.exercise3;

public class Choice {

    private String content;
    private String explanation;

    public Choice(String content, String explanation) {
        this.content = content;
        this.explanation = explanation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
