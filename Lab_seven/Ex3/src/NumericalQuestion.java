

public class NumericalQuestion extends Question
{
    // Instance Variables

    // Constructors

    // Methods
    /**
     * Checks the response and returns true if the response matches the correct response
     * and does not differ by more than 0.01
     * @param  response to be checked against the actual response
     */
    public boolean checkAnswer(String response)
    {
        // Compute the absolute value of the difference between the actual answer and the given answer
        double endResult = Math.abs(Double.valueOf(response) - Double.valueOf(super.getAnswer()));

        if(endResult <= 0.01)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

