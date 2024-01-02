import java.util.AbstractList;

public class CollectionArrayList<T> extends AbstractList<T> {
  public Object[] myList;
  public int size;
  public int totalCapacity = 1;

  public CollectionArrayList () {
    this.myList = new Object[1];
    this.size = 0;
  }

  @Override
  public T get(int index) {
    return (T)myList[index];
  }

  @Override
  public int size() {
    return this.size;
  }

  public void doubleLength(int capacity) {
    totalCapacity = totalCapacity * 2;
    Object[] newarray = new Object[capacity * 2];
    for (int i = 0; i < size; i++) {
      newarray[i] = myList[i];
    }
    myList = newarray;
  }

  @Override
  public boolean add(T element) {
    if (size == totalCapacity) {
      doubleLength(size);
    }
    this.myList[size] = element;
    size = size + 1;
    return true;
  }

  @Override
  public T remove(int index) {
    T oldValue = (T) myList[index];
    Object[] newarray = new Object[totalCapacity];
    for (int i = 0, j = 0; j < size; i++, j++) {
      if (j != index) {
        newarray[i] = myList[j];
      } else {
        i--;
      }
    }
    myList = newarray;
    return oldValue;
  }

  public static void main(String[] args) {
    CollectionArrayList<Integer> iarray = new CollectionArrayList<>();
    iarray.add(3);
    iarray.add(4);
    iarray.add(7);
    iarray.add(5);

    System.out.println(iarray.get(2));
    iarray.remove(0);
    System.out.println(iarray.get(2));
  }
}
