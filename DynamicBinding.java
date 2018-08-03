public class DynamicBinding {
   public static void main(String[] args) {
      m(new GraduateStudent());
      m(new Student());
      m(new Person());
      m(new Object());
   }

   public static void m(Object m) {
      System.out.println(m);
   }
}

class GraduateStudent
   extends Student {
   @Override
   public String toString() {
      return "Graduate";
   }
}

class Student
   extends Person {
   @Override
   public String toString() {
      return "Student";
   }
}

class Person {
   @Override
   public String toString() {
      return "Person";
   }
}
