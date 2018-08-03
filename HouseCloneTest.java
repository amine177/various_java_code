public class HouseCloneTest {
  public static void main(String[] args) 
    throws CloneNotSupportedException {
    House house1 = new House(2, 23.4);
    House house2 = (House) house1.clone();
    System.out.println("house1.equals(house2) :" +
        house1.equals(house2));
    System.out.println(
        "house1.whenBuilt == house2.whenBuilt " +
        house1.getWhenBuilt().equals(
          house2.getWhenBuilt()));
  }
}
