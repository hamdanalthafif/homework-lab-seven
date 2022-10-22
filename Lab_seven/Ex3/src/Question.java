import java.util.Scanner;
/**
 A question with a text and an answer.
 */
public class Question
{
    // Instance Variables
    private String text;
    private String answer;

    // Constructors

    public Question()
    {
        this.text = "";
        this.answer = "";
    }

    // Methods

    public void setAnswer(String correctResponse)
    {
        this.answer = correctResponse;
    }


    public String getAnswer()
    {
        return this.answer;
    }
    /**
     * Checks if the response is correct
     * @param  response the given response
     * @return true if the response is correct, false if response is incorrect
     */
    public boolean checkAnswer(String response)
    {
        return response.equals(answer);
    }

    /**
     * Displays the question
     */
    public void display()
    {
        System.out.println(text);
    }

    /**
     * Sets the question text
     *  string the question to be asked
     */
    public void setText(String questionText)
    {
        this.text = questionText;
    }

    /**
     * Presents the question and asks for an input
     */
    public void presentQuestion()
    {
        Scanner in = new Scanner(System.in);

        this.display();

        System.out.print("Your Answer: ");
        String response = in.nextLine();

        System.out.println(this.checkAnswer(response));
    }
}

