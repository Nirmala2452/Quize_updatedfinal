import java.util.List;
import java.util.Random;

/**
 * Subject class that contains name of subject and a list of questions
 */

class Subject {

    /**
     * name of a Subject.
     */
    private String name;

    /**
     * list of Questions.
     */
    private List<Question> questions;

    /**
     * Constructor of Subject, it initializes name of subject and questions.
     * @param name name of subject.
     * @param questions list of question for the subject.
     */
    public Subject(String name, List<Question> questions) {
        this.name = name;
        this.questions = questions;
    }

    /**
     * This method gives the name of subject.
     * @return name of subject.
     */
    public String getName() {
        return name;
    }

    /**
     * This method gets a random question from the list of questions.
     * @return random question.
     */
    public Question getRandomQuestion() {
        Random random = new Random();
        int randomIndex = random.nextInt(questions.size());
        return questions.get(randomIndex);
    }
}
