package coralcorp.Model;

public class Question {
    private String question;
    private String[] answers;
    private int[] karmaPerAnswer;
    private int indexCorrectAnswer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public int[] getKarmaPerAnswer() {
        return karmaPerAnswer;
    }

    public void setKarmaPerAnswer(int[] karmaPerAnswer) {
        this.karmaPerAnswer = karmaPerAnswer;
    }

    public int getIndexCorrectAnswer() {
        return indexCorrectAnswer;
    }

    public void setIndexCorrectAnswer(int indexCorrectAnswer) {
        this.indexCorrectAnswer = indexCorrectAnswer;
    }
}
