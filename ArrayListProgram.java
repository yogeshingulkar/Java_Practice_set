import java.util.*;

//Custom Exception
class UserNoSuchElementException extends RuntimeException {
    UserNoSuchElementException() {
        super();
    }
}

class UserIndexOutOfBoundsException extends RuntimeException {
    UserIndexOutOfBoundsException(String msg) {
        super(msg);
    }
}

class MyArrayList<E> implements Cloneable {

    private static final int INITIAL_CAPACITY = 10;
    private E[] arr;
    private int indx; // size

    //  Constructors 
    public MyArrayList() {
        arr = (E[]) new Object[INITIAL_CAPACITY];
        indx = 0;
    }

    public MyArrayList(int cap) {
        arr = (E[]) new Object[cap];
        indx = 0;
    }

    //  toString 
    @Override
    public String toString() {
        if (indx == 0) return "[]";

        String op = "[";
        for (int i = 0; i < indx - 1; i++) {
            op += arr[i] + ", ";
        }
        op += arr[indx - 1] + "]";
        return op;
    }

    //  Capacity Handling 
    private int newCapacity(int oldCap) {
        return (int) (oldCap * 1.5);
    }

    public void ensureCapacity(int cap) {
        if (arr.length >= cap) return;

        E[] newArr = (E[]) new Object[cap];
        for (int i = 0; i < indx; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void trimToSize() {
        if (arr.length == indx) return;

        E[] newArr = (E[]) new Object[indx];
        for (int i = 0; i < indx; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    //  Basic Operations 
    public boolean add(E ele) {
        if (indx == arr.length) {
            ensureCapacity(newCapacity(arr.length));
        }
        arr[indx++] = ele;
        return true;
    }

    public void addFirst(E ele) {
        add(0, ele);
    }

    public void addLast(E ele) {
        add(indx, ele);
    }

    public void add(int index, E ele) {
        if (index < 0 || index > indx)
            throw new UserIndexOutOfBoundsException(
                "Index " + index + " out of bounds for length " + indx
            );

        if (indx == arr.length) {
            ensureCapacity(newCapacity(arr.length));
        }

        for (int i = indx - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        arr[index] = ele;
        indx++;
    }

    //  Get / Set 
    public E get(int index) {
        if (index < 0 || index >= indx)
            throw new UserIndexOutOfBoundsException(
                "Index " + index + " out of bounds for length " + indx
            );
        return arr[index];
    }

    public E set(int index, E ele) {
        if (index < 0 || index >= indx)
            throw new UserIndexOutOfBoundsException(
                "Index " + index + " out of bounds for length " + indx
            );

        E temp = arr[index];
        arr[index] = ele;
        return temp;
    }

    //  Remove 
    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(indx - 1);
    }

    public E remove(int index) {
        if (index < 0 || index >= indx)
            throw new UserIndexOutOfBoundsException(
                "Index " + index + " out of bounds for length " + indx
            );

        E temp = arr[index];
        for (int i = index + 1; i < indx; i++) {
            arr[i - 1] = arr[i];
        }

        arr[--indx] = null;
        return temp;
    }

    //  Search 
    public int indexOf(Object obj) {
        for (int i = 0; i < indx; i++) {
            if (arr[i].equals(obj)) return i;
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        for (int i = indx - 1; i >= 0; i--) {
            if (arr[i].equals(obj)) return i;
        }
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    //  Utility 
    public int size() {
        return indx;
    }

    public boolean isEmpty() {
        return indx == 0;
    }

    public E getFirst() {
        if (indx == 0) throw new UserNoSuchElementException();
        return arr[0];
    }

    public E getLast() {
        if (indx == 0) throw new UserNoSuchElementException();
        return arr[indx - 1];
    }

    public Object[] toArray() {
        Object[] newArr = new Object[indx];
        for (int i = 0; i < indx; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public void clear() {
        arr = (E[]) new Object[arr.length];
        indx = 0;
    }

    //  Clone 
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //  hashCode & equals 
    @Override
    public int hashCode() {
        int hashCode = 1;
        for (int i = 0; i < indx; i++) {
            hashCode += arr[i].hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyArrayList)) return false;
        MyArrayList<?> other = (MyArrayList<?>) obj;
        return this.hashCode() == other.hashCode();
    }
}

//  Driver Class 

public class DriverExampleArrayList 
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1); // [10, 20, 30]

        MyArrayList<Integer> clone = (MyArrayList<Integer>) list1.clone();
        System.out.println(clone); // [10, 20, 30]

        list1.addAll(Arrays.asList(40, 50));
        System.out.println(list1); // [10, 20, 30, 40, 50]
    }
}
