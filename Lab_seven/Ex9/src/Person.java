/**
 * Implement a superclass Person. Make two classes, Student and Instructor, that inherit
 * for Person. A person has a name and a year of birth. A student has a major, and
 * an instructor has a salary. Write the class declarations, the constructors, and the
 * methods toString for all classes. Supply a test program that tests these classes and
 * methods.
 */
public class Person {

        // Instance Variables
        private String name;
        private int birthYear;

        // Constructors

        public Person()
        {
            name = "";
            birthYear = 0;
        }
        // Methods

        public String getName()
        {
            return name;
        }

        public void setName(String personName)
        {
            name = personName;
        }

        public void setBirthYear(int year)
        {
            birthYear = year;
        }

        public int getBirthYear()
        {
            return birthYear;
        }

        public String toString()
        {
            return getClass().getName() + "[Name=" + getName() + "][BirthYear=" + getBirthYear() + "]";
        }

    }
