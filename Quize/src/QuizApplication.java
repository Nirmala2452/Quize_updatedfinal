import java.util.*;

/**
 * This a main class for our Quiz Application.
 *
 * @author Nirmala KC
 * @version 1.0
 * @see QuizApplication
 */

public class QuizApplication {

    /**
     * This is a main method
     *
     * @param args stores incoming the command line arg for the program
     */
    public static void main(String[] args) {
        // Create subjects and questions

        /**
         * Creating list of questions for subject 1
         */
        List<Question> subject1Questions = new ArrayList<>();
        subject1Questions.add(new MCQQuestion("Question 1?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 2?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 3?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 4?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 5?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 6?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 7?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 8?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 9?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 10?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 11?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 12?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 13?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 14?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 15?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 16?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 17?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 18?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 19?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject1Questions.add(new MCQQuestion("Question 20?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));


        /**
         * Creating list of questions for subject 2
         */
        List<Question> subject2Questions = new ArrayList<>();
        subject2Questions.add(new MCQQuestion("Question 1?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 1));
        subject2Questions.add(new MCQQuestion("Question 2?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 3?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 4?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 5?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 6?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 7?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 8?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 9?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 10?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 11?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 12?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 13?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 14?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 15?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 16?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 17?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 18?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 19?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));
        subject2Questions.add(new MCQQuestion("Question 20?", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, 2));

        /**
         * Creating subjects
         */

        // Create subjects
        Subject subject1 = new Subject("Core Java", subject1Questions);
        Subject subject2 = new Subject("Computer Fundamental", subject2Questions);
        // Add more subjects...

        /**
         * Creating list of subjects and adding subjects to the list.
         */
        // Create Quiz with subjects
        List<Subject> subjects = new ArrayList<>();
        subjects.add(subject1);
        subjects.add(subject2);
        // Add more subjects...

        /**
         * Instanciate Quiz class and start Quiz.
         */
        Quiz quiz = new Quiz(subjects);
        quiz.startQuiz();
    }
}
