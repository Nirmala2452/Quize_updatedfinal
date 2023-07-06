Question and MCQQuestion classes: These are abstract and concrete classes respectively. Question is an abstract class representing a general question, while MCQQuestion is a concrete subclass representing multiple-choice questions. The MCQQuestion class extends Question and implements the abstract checkAnswer() method to validate the user's answer.

Subject class: The Subject class represents a subject and contains a list of questions related to that subject. It has methods to get the subject name and to retrieve a random question from the list.

Quiz class: The Quiz class is the core of the application. It takes a list of subjects during initialization. It handles the quiz flow, including displaying the subject list, prompting the user to choose a subject, displaying random questions, accepting answers, and displaying the final result.

main() method: In the QuizApplication class, we have the main() method where we set up the quiz by creating subjects and their corresponding questions. We then add these subjects to the Quiz instance and call the startQuiz() method to initiate the quiz.

Now, let's explain the startQuiz() method in the Quiz class in more detail:

It begins by displaying the available subjects to the user and prompting them to choose one.

The user enters the subject number, and the selected subject is retrieved from the list of subjects based on the user's input.

The quiz then proceeds to ask 5 random questions from the selected subject.

For each question, it displays the question along with the answer options.

The user enters their answer (the option number), and the checkAnswer() method of the MCQQuestion class is used to validate the answer. If the answer is correct, the correctAnswers count is incremented.

After all 5 questions are answered, the quiz displays the result, including the total number of questions, correct answers count, wrong answers count, and the final score in percentage.
