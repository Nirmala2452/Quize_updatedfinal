// Abstract class for Question

/**
 * Question class stores information of question like question, list of options and correct answer index.
 * @see Question
 */

abstract class Question {

    /**
     * question text.
     */
    protected String question;

    /**
     * array of answer options.
     */
    protected String[] options;

    /**
     * index of correct option.
     */
    protected int correctAnswerIndex;


    /**
     * Constructor of Question class, it initializes the fields.
     * @param question the question text.
     * @param options array of answer options.
     * @param correctAnswerIndex the index of correct option in the array.
     */
    public Question(String question, String[] options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    /**
     * And abstract method which checks the answer
     * @param answerIndex index of correct option.
     * @return true if answer is correct otherwise false.
     */
    public abstract boolean checkAnswer(int answerIndex);

    /**
     * It displays questions on terminal.
     */
    public void displayQuestion() {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
}
