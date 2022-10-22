
    public class Student extends Person
    {
        // Instance Variables
        private String major;

        // Constructors

        public Student(String studentMajor)
        {
            major = studentMajor;
        }

        // Methods

        public String toString()
        {
            return  super.toString() + "[Major=" + getMajor() + "]";
        }


        public String getMajor()
        {
            return major;
        }


        public void setMajor(String studetnMajor)
        {
            major = studetnMajor;
        }
    }


