

public class MultipleChoiceQuestionTester
{
    public static void main(String[] args) {
        MultipleChoiceQuestion q = new MultipleChoiceQuestion();

        q.setText("What are the method in java from these?");

        q.addChoice("set", true);
        q.addChoice("was", false);
        q.addChoice("get", true);
        q.addChoice("came", false);
        q.addChoice("write", true);

        q.presentQuestion();
    }
}
