package classes;

public interface CourseOperations {
    public void UpdateProfessor(Professor p);
    public void AddStudent(Student srudent);
    public void RemoveStudent(Student student);
    public void UpdateStudent(Student student);
    public void UpdateCourse(String name, String description);
}
