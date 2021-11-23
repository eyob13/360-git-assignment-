import java.util.Scanner;
public class TriviaGame {
   public static void main(String[] args) {
    final TriviaGame run = new TriviaGame();
    }

    {
        final int size=5;
        /**
         *  An array of type String should be used for the questions.
         */
        String[] questions = new String[size];
        /**
         * Another array of type String should be used to store the answers.
         */
        String[] answers = new String[size];
        /**
         * An array of type int should be used for the point values.
         */
        int[] values =  new int[size];
        // initialize using hard coding

        initializeArrays(questions,answers,values);
        //call the methods
        playGame(questions,answers,values);
        goodByeMessage();

    }
    private static void initializeArrays(String[] questions, String[] answers, int[] values)
    {
        questions[0]="The first president of the united states";
        answers[0] = "George Washington";
        values[0] =1;
        questions[1] ="who found america first before columbus";
        answers[1] ="Leif Eriksson";
        values[1] =2;
        questions[2] = "What was US called before July 4, 1776 '";
        answers[2] ="The United Colonies";
        values[2] = 3;
        questions[3] ="Who is the tallest person on record (8 ft. 11 in) that has lived?";
        answers[3] ="Robert Wadlow";
        values[3] = 4;
        questions[4]="PT Barnum said 'This way to the _______' to attract people to the exit.";
        answers[4] ="egress";
        values[4] =5;
    }
    private static void playGame(String[] questions, String[] answers, int[] values)
    {
        int score=0;
        String response="";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <questions.length ; i++) {

            System.out.println("Question "+(i+1));
            System.out.println(questions[i]);
            response = scanner.nextLine();
            if(response.equalsIgnoreCase(answers[i]))
            {
                System.out.println("That is correct!");
                score +=values[i];
            }
            else
            {
                System.out.println("Wrong. The correct answer is "+answers[i]);
            }
            System.out.println("Your score is "+score);
        }
    }
    private static void goodByeMessage()
    {
        System.out.println("Game over! Thanks for playing!" );
    }

  
}