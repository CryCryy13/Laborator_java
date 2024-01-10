package classes;

public class Course implements CourseOperations{
    String name;
    String description;
    Professor teacher;
    Student[] students;
    public Course(String name, String description, Professor teacher, Student[] students){
        this.name="";
        this.description="";
        this.teacher=teacher;
        this.students=students;
    }
    public void updateProfessor(Professor teacher){
        this.teacher=teacher;
    }
    public Professor getTeacher() {
        return teacher;
    }
    public void addStudent(Student student) {
        int newLength=students.length+1;
        Student[] aux=new Student[newLength];
        int index=0;
        for (Student s : students){
            aux[index++]=s;
        }
        aux[index]=student;
        this.students=new Student[newLength];
        System.arraycopy(aux, 0, students, 0, newLength);
    }
    @Override
    public String toString(){
        String str = "Course: "+"name="+name+", description="+description+",\nTeacher="+ teacher+",\nStudents:\n";
        for(Student s : students) {
            str += s+"\n";
        }
        return str;
    }
    public String getName(){
        return name;
    }

    @Override
    public void UpdateProfessor(Professor p) {

    }

    @Override
    public void AddStudent(Student srudent) {

    }
    // EXERCITIUL 2 PCT C: Add functional code for the methods:
//– public void RemoveStudent(Student student);
//– public void UpdateStudent(Student student);
//– public void UpdateCourse(String name, String description);
    @Override
    public void RemoveStudent(Student student) {
        // de facut aici cod ca sa remove un student
        int newLength=students.length-1;
        Student[] aux=new Student[newLength];
        int index=0;
        for (Student s : students){
            aux[index++]=s;
        }
        Boolean ELEMENT;
        ELEMENT = Student.remove(aux[index]);
        // in student am implementat treaba cu remove
        // aici nusj daca e bine, ca asa am gasit sa fac. mai e o chestie in alta clasa ca nu mergea remove si trebuia sa implementez o metoda ca sa imi dea null
       /* int studentidesters= students.length;
        for(int i = 0; i < students.length; i++){
            if(students[i].equals(student)){
                studentidesters = i;
                break;
            }
        }

        if(studentidesters!= students.length){
            Student[] vectornoustudenti = new Student[students.length - 1];
            System.arraycopy(students, 0, vectornoustudenti, 0, studentidesters);
            System.arraycopy(students, studentidesters+1, vectornoustudenti, studentidesters, students.length - indexOfStudentToRemove -1);
            students = vectornoustudenti;
        }*/

    }

    @Override
    public void UpdateStudent(Student student) {
        int studentupdata = students.length;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                studentupdata = i;
                break;
            }
        }

        if (studentupdata != -students.length) {
            students[studentupdata] = student;
        }

    }

    @Override
    public void UpdateCourse(String name, String description) {
        this.name = name;
        this.description = description;

    }
}
