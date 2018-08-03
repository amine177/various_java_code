import java.io.PrintWriter;
import java.util.Date;

public class Test {
   public static void main(String[] args){
     Person[] persons = {
       new Person(3),
       new Person(4),
       new Person(1)
     };
     java.util.Arrays.sort(persons);
   }
}


class Person {
  private int id;

  Person(int id) {
    this.id = id;
  }
}
