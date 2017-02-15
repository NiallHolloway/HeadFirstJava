package QuizGame;
/**
 * Created by niall-holloway on 15/02/17.
 */

import java.io.*;

public class QuizCard implements Serializable {

    private String uniqueID;
    private String category;
    private String question;
    private String answer;
    private String hint;

    QuizCard(String q, String a) {
        question = q;
        answer = a;
    }


    public void setUniqueID(String id) {
        uniqueID = id;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setCategory(String c) {
        category = c;
    }

    public String getCategory() {
        return category;
    }

    public void setQuestion(String q) {
        question = q;
    }

    String getQuestion() {
        return question;
    }

    public void setAnswer(String a) {
        answer = a;
    }

    String getAnswer() {
        return answer;
    }

    public void setHint(String h) {
        hint = h;
    }

    public String getHint() {
        return hint;
    }

}

