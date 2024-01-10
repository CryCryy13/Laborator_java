package classes;
import java.util.ArrayList;

public class MockClassManager implements ManagerCourseOperation{
    @Override
    public void AddCourse(Course course){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void UpdateCourse(Course course){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void DeleteCourse(Course course){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<Course> GenerateCourses(){
        ArrayList<Course> courses = new ArrayList <>();

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Andrei","Negoita",2231));
        students.add(new Student("Ion", "Mateescu", 4221));

        Professor prof = new Professor("Anton", "Panaitescu");
        courses.add(new Course("Rezistenta Materialelor", "calculul reactiunilor, \n" +"diagramele de eforturi, calculul caracteristicilor geometrice ale \n"+"suprafetelor plane si calculul elementelor de rezistenta la solicitari simple \n", prof, students));
        return courses;
    }
}
