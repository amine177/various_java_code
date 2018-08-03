import java.util.Arrays;

public class Course implements Cloneable{
   private String courseName;
   private String[] students;
   private int numberOfStudents;

   public Course(String courseName) {
      this.courseName = courseName;
   }

   public String getCourseName() {
      return this.courseName;
   }

   public void addStudent(String studentName) {
      if (++numberOfStudents > students.length) {
         String[] temp = new String[students.length * 2];
         System.arraycopy(students, 0, temp, 0, students.length);
         students = temp;
         numberOfStudents--;
      }

      students[numberOfStudents++] = studentName;
   }

   public void dropStudent(String student) {
      students[numberOfStudents--] = null;
   }

   public String[] getStudents() {
      return this.students;
   }

   public int getNumberOfStudent() {
      return this.numberOfStudents;
   }

   public void clear() {
      for (int i = 0; i < students.length; ++i)
         students[i] = null;
   }

   @Override
   public Object clone()
   throws CloneNotSupportedException{
     Course c = (Course)this.clone();
     c.students = (String[]) students.clone();
     return c;
   }
}
