public class Position {
  public static class Person {
    Person() {}
  }
  public static void main(String[] args) {
    Person p = null;
    Person p2 = new Person();
    p = p2;
    p2 = new Person();
    p = null;


  }
}
