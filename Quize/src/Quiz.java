import java.util.List;
import java.util.Scanner;

/**
 * Quiz class that handles the quiz flow
 */
class Quiz {

    /**
     * List of subjects.
     */
    private List<Subject> subjects;

    /**
     * Total questions count.
     */
    private int totalQuestions;

    /**
     * count of correct answers.
     */
    private int correctAnswers;

    /**
     * Constructor of Quiz class, initializes the data.
     * @param subjects list of subjects
     */
    public Quiz(List<Subject> subjects) {
        this.subjects = subjects;
        this.totalQuestions = 5;
        this.correctAnswers = 0;
    }

    /**
     * This method starts the quiz.
     */
    public void startQuiz() {
        displaySubjectList();

        /**
         * Select a subject to start quiz.
         */
        Scanner scanner = new Scanner(System.in);
        int selectedSubjectIndex = scanner.nextInt() - 1;

        if (selectedSubjectIndex >= 0 && selectedSubjectIndex < subjects.size()) {
            Subject selectedSubject = subjects.get(selectedSubjectIndex);
            System.out.println("Selected subject: " + selectedSubject.getName());

            /**
             * Display questions and option in a loop.
             * Check if selected option is correct and count corrected answers.
             */
            for (int i = 0; i < totalQuestions; i++) {
                Question question = selectedSubject.getRandomQuestion();
                question.displayQuestion();
                int answer = scanner.nextInt();

                if (question.checkAnswer(answer - 1)) {
                    correctAnswers++;
                }
            }

            /**
             * Display result.
             */
            displayResult();
        } else {
            System.out.println("Invalid subject selection.");
        }
    }

    /**
     * This method displays the available subjects.
     */
    private void displaySubjectList() {
        System.out.println("Available Subjects:");
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println((i + 1) + ". " + subjects.get(i).getName());
        }
        System.out.print("Select a subject to play the quiz: ");
    }


    /**
     * This method displays the result to the user such as total question, correct answers, wrong answers and final result.
     */
    private void displayResult() {
        System.out.println("Quiz Completed!");
        System.out.println("Total Questions: " + totalQuestions);
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Wrong Answers: " + (totalQuestions - correctAnswers));
        double percentage = (double) correctAnswers / totalQuestions * 100;
        System.out.println("Final Score: " + percentage + "%");
    }
}

