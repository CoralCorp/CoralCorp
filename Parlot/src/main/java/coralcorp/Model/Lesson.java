package coralcorp.Model;

public class Lesson {

    private String lessonID;
    private Question question;
    private String animationPath;
    private String character;

    public String getLessonID() {
        return lessonID;
    }

    public void setLessonID(String lessonID) {
        this.lessonID = lessonID;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getAnimationPath() {
        return animationPath;
    }

    public void setAnimationPath(String animationPath) {
        this.animationPath = animationPath;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
