import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Average {
  public static double for_loop(int[] intlist) {
    int sum = 0;
    double ans = 0.0;
    for (int i = 0; i < intlist.length; i++) {
      sum = sum + intlist[i];
    }
    ans = sum / intlist.length;
    return ans;
  }

  public static double for_each(int[] intlist) {
    int sum = 0;
    double ans = 0.0;
    for (int i: intlist) {
      sum = sum + i;
    }
    ans = sum / intlist.length;
    return ans;
  }

  public static double iterator(ArrayList<Integer> intlist) {
    Iterator<Integer> it = intlist.iterator();
    int sum = 0;
    double ans = 0.0;
    while (it.hasNext()) {
      sum = sum + it.next();
    }
    ans = sum / intlist.size();
    return ans;
  }

  public static void main(String[] args) {
    int[] myList = {1,2,3,4,5};
    ArrayList<Integer> myArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(for_loop(myList));
    System.out.println(for_each(myList));
    System.out.println(iterator(myArrayList));
  }
}
