import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Car implements Comparable<Car>{
  private String manufacturer;
  private int age;

  public Car(String manufacturer, int age) {
    this.manufacturer = manufacturer;
    this.age = age;
  }

  @Override
  public int compareTo(Car otherCar) {
    return this.manufacturer.compareTo(otherCar.manufacturer);
  }

  public static class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
      if (c1.manufacturer.equals(c2.manufacturer)) {
        return c1.age - c2.age;
      }
      else {
        return c1.manufacturer.compareTo(c2.manufacturer);
      }
    }
  }

  public static void sortedwithoutcomparator(ArrayList<Car> CarList) {
    Collections.sort(CarList);
  }

  public static void sortedwithcomparator(ArrayList<Car> CarList) {
    Collections.sort(CarList, new CarComparator());
  }

  public static void main(String[] args) {
    ArrayList<Car> cars = new ArrayList<>();
    cars.add(new Car("d" , 1));
    cars.add(new Car("k" , 2));
    cars.add(new Car("d" , 3));
    cars.add(new Car("a" , 4));
    // sortedwithoutcomparator(cars);
    sortedwithcomparator(cars);
    for (Car i : cars) {
      System.out.println(i.manufacturer + " " + i.age);
    }
  }


}
