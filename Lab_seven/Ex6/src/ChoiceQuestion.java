import java.util.ArrayList;

public class ChoiceQuestion extends Question
{
    // Instance Variables
    private ArrayList<String> choices;

    // Constructors

    public ChoiceQuestion()
    {
        super();
        choices = new ArrayList<String>();
    }

    // Methods

    public ArrayList<String> getChoices()
    {
        return this.choices;
    }


    public void setChoice(String choice)
    {
        this.choices.add(choice);
    }


    public void display()
    {
        super.display();

        for(int i = 0; i < choices.size(); i++)
        {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }


    public String toString()
    {
        return getClass().getName();
    }
}
