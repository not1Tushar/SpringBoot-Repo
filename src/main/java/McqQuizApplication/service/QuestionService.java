package McqQuizApplication.service;

import McqQuizApplication.Model.Question;
import McqQuizApplication.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question addQuestion(Question question) {
        return questionRepository.saveQuestion(question);
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public int calculateScore(List<String> answers) {
        int score = 0;
        List<Question> questions = questionRepository.findAll();

        for (int i = 0; i < answers.size(); i++) {
            if (i < questions.size() && answers.get(i).equals(questions.get(i).getCorrectAnswer())) {
                score++;
            }
        }
        return score;
    }
}
