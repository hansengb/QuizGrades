import java.util.Scanner;

public class QuizGrades
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String quiz;
        double quizzes = 0.0;
        int currentQuiz;
        int highestQuiz = 0;
        int lowestQuiz = 100 ;
        double grades = 0.0;

        System.out.println("Insert Quiz Grade: ");
        quiz = scan.nextLine();

        while(quiz.length() > 0){
                currentQuiz = Integer.parseInt(quiz);
                if(currentQuiz > highestQuiz){
                    highestQuiz = currentQuiz;
                }
                if(currentQuiz < lowestQuiz){
                    lowestQuiz = currentQuiz;
                }
                quizzes++;
                grades = grades + currentQuiz;

                System.out.println("Insert Quiz Grade: ");
                quiz = scan.nextLine();
            }

        quizzes = quizzes - 2;
        grades = grades - highestQuiz;
        grades = grades - lowestQuiz;

        System.out.println("Your quiz average is: " + grades/quizzes + "%");
    
 
 
    }
}