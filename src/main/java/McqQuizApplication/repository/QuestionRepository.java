package McqQuizApplication.repository;

import McqQuizApplication.Model.Question;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class QuestionRepository  {

    List<Question> questionList = new ArrayList<>();
    // Create a list of options
    List<String> options = Arrays.asList("Paris", "London", "Berlin", "Madrid");
     {

        questionList.add(new Question(1L,"What is the capital of France?",options,"Paris"));
    }

    public Question saveQuestion(Question question) {
        questionList.add(question);
    return  questionList.get(1);
    }

    public List<Question> findAll() {
        return  questionList;
    }
}
