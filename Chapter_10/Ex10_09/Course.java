import java.util.Arrays;

public class Course
{
    private String courseName;
    private String[] students = new String[4];
    private int numberOfStudents;

    public Course(String courseName)
    {
        this.courseName = courseName;
    }

    public void addStudent(String student)
    {
        if (students.length <= numberOfStudents)
        {
            String[] newArr = Arrays.copyOf(students, students.length);
            students = newArr;
            students[numberOfStudents] = student;
            numberOfStudents++;
            return;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents()
    {
        String[] studentsCopy = Arrays.copyOf(students, numberOfStudents);
        return studentsCopy;
    }

    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void dropStudent(String student)
    {
        // Left as an exercise in Exercise 10.9
        for (int i = 0; i <= numberOfStudents; i++)
        {
            if (students[i].equalsIgnoreCase(student))
            {
                students[i] = null;numberOfStudents--;
                break;
            }
        }
    }

    public void clear()
    {
        students = new String[students.length];
        numberOfStudents = 0;
    }
}