/**
 *  Concrete implementation of Question class for MCQ
 */
class MCQQuestion extends Question {


    /**
     * Constructor of MCQQuestion class, it invokes super class constructor.
     * @param question the question text.
     * @param options array of answer options.
     * @param correctAnswerIndex the index of correct option in the array.
     */
    public MCQQuestion(String question, String[] options, int correctAnswerIndex) {
        super(question, options, correctAnswerIndex);
    }

    /**
     * This is the implementation of abstract method checkAnswer
     * @param answerIndex index of correct option.
     * @return true if selected option is correct otherwise false.
     */
    @Override
    public boolean checkAnswer(int answerIndex) {
        return answerIndex == correctAnswerIndex;
    }
}