import java.util.*;

public class StudentMap {
  public static Map<String, Double> name_mark = new HashMap<>();

  public static ArrayList<String> GetName(Map<String, Double> student) {
    ArrayList<String> res = new ArrayList<>();
    for (Map.Entry<String, Double> entry: student.entrySet()) {
      res.add(entry.getKey());
    }
    Collections.sort(res);
    return res;
  }

  public static ArrayList<String> TopStudent(Map<String, Double> student, double P) {
    ArrayList<String> res = new ArrayList<>();
    int res_size = (int) P * student.size() / 100;
    List<Map.Entry<String, Double>> entryList = new ArrayList<>(student.entrySet());
    Collections.sort(entryList, Collections.reverseOrder(Map.Entry.comparingByValue()));
    for (Map.Entry<String, Double> entry : entryList) {
      if (res_size != 0) {
        res.add(entry.getKey());
        res_size = res_size - 1;
      } else {
        break;
      }
    }
    return res;
  }

  public static double median(Map<String, Double> student) {
    ArrayList<Double> marks = new ArrayList<>();
    for (Map.Entry<String, Double> entry: student.entrySet()) {
      marks.add(entry.getValue());
    }
    Collections.sort(marks);
    if ((marks.size() & 1) == 1) {
      return marks.get(marks.size() / 2);
    }
    else {
      return (marks.get(marks.size() / 2) + marks.get(marks.size() / 2 - 1)) / 2;
    }
  }

  public static void main(String[] args) {
    name_mark.put("Clare", 89.0);
    name_mark.put("Emily", 100.0);
    name_mark.put("Alice", 72.0);
    name_mark.put("David", 60.0);
    name_mark.put("Fiona", 50.0);

    System.out.println(TopStudent(name_mark, 40));
    System.out.println(median(name_mark));
    System.out.println(GetName(name_mark));



  }

}
