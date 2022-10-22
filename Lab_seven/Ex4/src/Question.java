import java.util.Scanner;

public class Question {
    // Instance Variables
    private String text;
    private String answer;

    // Constructors

    public Question()
    {
        text = "";
        answer = "";
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


    public boolean checkAnswer(String response)
    {
        return response.equalsIgnoreCase(answer);
    }


    public void display()
    {
        System.out.println(text);
    }


    public void setText(String questionText)
    {
        this.text = questionText;
    }


    public void presentQuestion()
    {
        Scanner in = new Scanner(System.in);

        this.display();

        System.out.print("Your Answer: ");
        String response = in.nextLine();

        System.out.println(this.checkAnswer(response));
    }
}
