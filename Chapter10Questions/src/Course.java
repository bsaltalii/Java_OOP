public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    public Course(String courseName) {
        this.courseName=courseName;
    }
    public void addStudent(String student){
        if (numberOfStudents<=students.length){
            students[numberOfStudents]=student;
            numberOfStudents++;
        }else{
            String[] newStudents = new String[150];
            System.arraycopy(this.students,0,newStudents,0,this.students.length);
            newStudents[numberOfStudents]=student;
            numberOfStudents++;
            this.students=newStudents;
        }
    }
    public String[] getStudents(){
        String[] newStudent= new String[this.students.length];
        System.arraycopy(this.students,0,newStudent,0,this.students.length);
        return newStudent;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){
        for (int i=0;i<this.students.length;i++){
            if (this.students[i]==student)
                this.students[i] = null;
        }
        numberOfStudents--;
    }
    public void clear(){
        for (int i=0;i<this.students.length;i++){
            students[i]=null;
        }
    }
    public void DisplayStudents(String[] students){
        for (int i=0;i<students.length;i++){
            System.out.println("Student "+(i+1)+" : "+students[i]);
        }
    }
    public static void main(String[] args) {
        Course course = new Course("Galatasaray");
        course.addStudent("Mauro Icardi");
        course.addStudent("Dries Mertens");
        course.addStudent("Lucas Torreira");
        course.addStudent("Fernando Muslera");
        course.addStudent("Nicolo Zaniolo");
        course.dropStudent("Nicolo Zaniolo");
        course.DisplayStudents(course.getStudents());
    }
}