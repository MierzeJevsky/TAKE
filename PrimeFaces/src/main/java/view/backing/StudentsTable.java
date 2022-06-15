package view.backing;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Mierzej
 */
@Named(value = "StudentsTable")
@RequestScoped
public class StudentsTable
{

    private List<Student> students;

    /**
     * Creates a new instance of StudentsTable
     */
    public StudentsTable()
    {
        students = new ArrayList<>();
        students.add(new Student("imie1", "naz1", 3.0));
        students.add(new Student("imie2", "naz2", 3.5));
        students.add(new Student("imie3", "naz3", 4.0));
        students.add(new Student("imie4", "naz4", 4.5));
        students.add(new Student("imie5", "naz5", 5.0));
        students.add(new Student("imie6", "naz6", 4.2));
        students.add(new Student("imie7", "naz7", 3.69));
        students.add(new Student("imie8", "naz8", 2.0));
        students.add(new Student("imie9", "naz9", 2.5));

    }

    /**
     * @return the students
     */
    public List<Student> getStudents()
    {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students)
    {
        this.students = students;
    }

}
