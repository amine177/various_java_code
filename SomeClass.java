
  enum Day {MON, TUE, SAT};

public class SomeClass {
  public static void main(String[] args) {

    Day a = Day.MON;

    switch (a) {
      case MON:
        System.out.println("Yeaay, it is monday!");
        break;
      default:
        System.out.println("Bye, bye!");
    }

  }
}
