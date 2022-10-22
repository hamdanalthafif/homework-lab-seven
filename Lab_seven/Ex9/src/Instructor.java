public class Instructor extends Person
{
    // Instance Variables
    private double salary;

    // Constructors

    public Instructor(double yearlySalary)
    {
        salary = yearlySalary;
    }

    // Methods

    public String toString()
    {
        return  super.toString() + "[Salary=" + getSalary() + "]";
    }


    public double getSalary()
    {
        return salary;
    }


    public void setSalary(double yearlySalary)
    {
        salary = yearlySalary;
    }
}
