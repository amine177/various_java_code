public class TestEdible {
  public static void main(String[] args) {
    Object[] objects = {
      new Tiger(),
      new Chicken(),
      new Apple()
    };
    for (int i = 0; i < objects.length; i++) {
      if (objects[i] instanceof Edible)
        System.out.println(
          ((Edible)objects[i]).howToEat()
        );
      if (objects[i] instanceof Animal)
        System.out.println(
          ((Animal)objects[i]).sound()
        );
    }
  }
}


abstract class Animal {
  public abstract String sound();
}


abstract class Fruit implements Edible {
}


class Chicken extends Animal implements Edible {

  @Override
  public String howToEat() {
    return "Chicken: Fry it";
  }

  @Override
  public String sound() {
    return "Chick: cocococooo";
  }
}


class Apple extends Fruit {

  @Override
  public String howToEat() {
    return "Apple: cider";
  }
}


class Tiger extends Animal {

  @Override
  public String sound() {
    return "Tiger: Roar";
  }
}
